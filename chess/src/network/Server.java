package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server extends Thread {
	
	protected String servername, username;
	protected int port;
	
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
		new Server(args[0], Integer.parseInt(args[1]), args[2]).start();
	}
	
	public Server(String servername, int port, String username) {
		this.servername = servername;
		this.port = port;
		this.username = username;
	}
	
	public void run() {
		try {
			client = new Socket(servername, port);
			output = new ObjectOutputStream(client.getOutputStream());
			output.flush();
			input = new ObjectInputStream(client.getInputStream());
			output.writeObject(new Packet("Init", "Init"));
			new MessageListener().start();
		} catch (IOException e) {
			
		}
	}

}
