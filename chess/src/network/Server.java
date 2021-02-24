package network;

public class Server {
	public static void main(String[] args) {
		
	}
<<<<<<< HEAD
	
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

=======
>>>>>>> branch 'main' of https://github.com/mv5903/team-projects.git
}
