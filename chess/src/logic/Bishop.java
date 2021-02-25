package logic;

import javax.swing.JLabel;

public class Bishop extends Piece {

	public String Icon;
	
	public String Color;

	public boolean isColor;

	public Bishop(boolean isColor) {		
		super(isColor);
		
		Icon = "Bishop";
	}


	public String toString() {
		return Icon;
	}

}
