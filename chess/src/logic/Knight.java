package logic;

import javax.swing.JLabel;

public class Knight extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	public Knight(boolean isColor) {		
		super(isColor);
		
		Icon = "Knight";
	}


	public String toString() {
		return Icon;
	}

}
	
	