package logic;

import javax.swing.JLabel;

public class Knight extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	public Knight(String color, boolean isColor) {		
		super("Knight", color, isColor);
	}


	public String toString() {
		return Icon;
	}

}
	
	