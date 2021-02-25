package logic;

import javax.swing.JLabel;

public class Pawn extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	 public Pawn(boolean isColor) {
		 super(isColor);
			
			Icon = "Pawn";

	}



	public String toString() {
		return Icon;
	}
}
