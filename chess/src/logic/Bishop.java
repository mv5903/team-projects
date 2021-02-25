package logic;

import javax.swing.JLabel;

public class Bishop extends Piece {
	
	public Bishop(boolean isColor) {		
		super(isColor);
		
		Icon = "Bishop";
	}


	public String toString() {
		return Icon;
	}

}
