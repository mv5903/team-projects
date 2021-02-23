package network;

import java.io.Serializable;

public class Packet implements Serializable {

	private static final long serialVersionUID = 3312694270831044679L;
	
	private String subject;
	private Object message;
	
	public Packet(String subject, Object message) {
		this.subject = subject;
		this.message = message;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public Object getMessage() {
		return message;
	}

	public String toString() {
		return String.format("Subject: %s\nMessage: %s", subject, message);
	}
}
