package logic;

import javax.swing.JLabel;

public abstract class Piece {
	private boolean captured = false, color = false;
	
	public Piece(boolean color) {
		this.setColor(color);
	}
	
	//Identifies the status of a piece. Whether it's captured or not
	public boolean isCaptured() {
		return captured;
	}
	
	//Identifies the color of the user. Whether it's black or white
	public boolean isColor() {
		return color;
	}
	
	//Decides if a piece is captured
	public void setCaptured(boolean captured) {
		this.captured = captured;
	}
	//Decodes what color the user is
	public void setColor(boolean color) {
		this.color = color;
	}
	
	public abstract boolean canMove(JLabel chessBoard, Spaces start, Spaces end);

	
}
