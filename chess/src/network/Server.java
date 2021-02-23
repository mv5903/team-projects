package network;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server extends Thread {
	
	private String servername, username;
	private int port;
	
	private ObjectInputStream dis;
	private ObjectOutputStream dos;
	private Socket client;
	private Packet received;
	

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

}
