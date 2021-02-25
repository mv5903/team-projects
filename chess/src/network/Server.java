package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread implements Constants, Serializable {

	private static final long serialVersionUID = -6963353887578937765L;
	protected ObjectInputStream input;
	protected ObjectOutputStream output;
	protected ServerSocket socket;
	protected Socket client;
	protected Packet received;
	
	public static void main(String[] args) {
		Server s = null;
		try {
			s = new Server();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.sendPacket(new Packet("sup", "just chillin"));
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for (int i = 0; i < 5; i++) {
				nums.add(i * 4);
			}
			try {
				Utilities.sleep();
				s.sendPacket(new Packet("second packet", nums));
				System.out.println(s.waitForPacket("three"));
			} catch (Exception e) {
				e.printStackTrace();
			};
		}
		
	}
	
	public Server() throws Exception {
		socket = new ServerSocket(PORT, 10);
		client = socket.accept();
		System.out.println("Player connected!");
		input = new ObjectInputStream(client.getInputStream());
		output = new ObjectOutputStream(client.getOutputStream());
		output.flush();
		sendPacket(new Packet("Init", "Init"));
		new MessageListener().start();
	}
	
	public void sendPacket(Packet p) {
		try {
			output.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * If this method is called, it will wait to receive a packet with the specified
	 * subject, then it will return it.
	 * @param subject Packet subject to wait for.
	 * @return Packet waited for.
	 */
	public Packet waitForPacket(String subject) {
		while (true) {
			Utilities.sleep();
			if (received != null && received.getSubject().equals(subject)) {
				Packet toReturn = received;
				received = null;
				return toReturn;
			}
		}
	}
	
	/**
	 * Constantly updates <strong>received</strong>.
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
