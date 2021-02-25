package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

abstract public class Listener extends Thread implements Constants, Serializable {

	private static final long serialVersionUID = 7273305571233201499L;
	protected ObjectInputStream input;
	protected ObjectOutputStream output;
	protected Packet received;
	
	abstract public void run();
	
	/**
	 * Send a message to other player.
	 * @param p Packet to send.
	 */
	public void sendPacket(Packet p) {
		try {
			output.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Wait for a particular packet back from other player.
	 * @param subject Packet to wait for based on provided subject
	 * @return Packet to wait for
	 */
	public Packet waitForPacket(String subject) {
		while (true) {
			Utilities.sleep();
			if (received != null && subject.equals(received.getSubject())) {
				Packet toReturn = received;
				received = null;
				return toReturn;
			}
		}
	}
	
	/**
	 * On a seperate method, responsible for listening to packets sent from other player.
	 * Will constantly update <strong>received</strong> when a new Packet is received.
	 * @author matt
	 *
	 */
	class MessageListener extends Thread {
		public void run() {
			try {
				while (true) {
					Utilities.sleep();
					received = (Packet) input.readObject();
				}
			} catch (Exception e) {
				System.err.println("Process ended unexpectedly.\n" + e);
			}
		}
	}
}
