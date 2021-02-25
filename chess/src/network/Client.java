package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Listener implements Constants, Serializable {

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
		/*
		try {
			new Client(args[0], args[1]).start();
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Illegal Arguments");
		}
		*/
		Client c = new Client("mattvandenberg.com", "matt");
		c.start();
		Utilities.sleep();
		System.out.println(c.waitForPacket("sup"));
		System.out.println(c.waitForPacket("second packet"));
		c.sendPacket(new Packet("three", true));
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
}
