package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Listener implements Constants, Serializable {

	private static final long serialVersionUID = -6963353887578937765L;
	protected ServerSocket socket;
	protected Socket client;
	
	public static void main(String[] args) {
		Server s = null;
		try {
			s = new Server();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.start();
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
		new MessageListener().start();
	}
	
	public void run() {
		try {
			client = socket.accept();
			System.out.println("Player connected!");
			input = new ObjectInputStream(client.getInputStream());
			output = new ObjectOutputStream(client.getOutputStream());
			output.flush();
		} catch (Exception e) {
			System.out.println("Something went wrong: \n" + e.getMessage());
		}
	}

}