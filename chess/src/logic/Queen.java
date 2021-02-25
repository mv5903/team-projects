package logic;

import javax.swing.JLabel;

public class Queen extends Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Queen(String color, boolean isColor) {		
		super("Queen", color, isColor);
	}


	public String toString() {
		return Icon;
	}
}