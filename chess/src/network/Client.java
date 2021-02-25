package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread implements Constants, Serializable {

	private static final long serialVersionUID = 8062375744100123820L;
	protected String servername, username;
	
	protected ObjectInputStream input;
	protected ObjectOutputStream output;
	protected Socket client;
	protected Packet received;
	
	/**
	 * Constructs a new Server object, running on a separate thread
	 * @param args 0: Host 1: Port 2: Username
	 * @throws UnknownHostException If a host is not running a server
	 * @throws IllegalArgumentException If arguments are incorrectly passed in
	 */
	public static void main(String[] args) throws UnknownHostException, IllegalArgumentException {
		try {
			new Client(args[0], args[1]).start();
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Illegal Arguments");
		}
	}
	
	public Client(String servername, String username) {
		this.servername = servername;
		this.username = username;
	}
	
	public void run() {
		try {
			client = new Socket(servername, PORT);
			output = new ObjectOutputStream(client.getOutputStream());
			output.flush();
			input = new ObjectInputStream(client.getInputStream());
			sendPacket(new Packet("Init", "Init"));
			new MessageListener().start();
		} catch (IOException e) {
			System.out.println("Couldn't create the socket. Check parameters and try again.");
		}
	}
	/**
	 * Send a message to the server player.
	 * @param p
	 */
	public void sendPacket(Packet p) {
		try {
			output.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Wait for a particular packet back from server player.
	 * @return Packet waiting for
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
	 * On a seperate method, responsible for listening to packets sent from server.
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
