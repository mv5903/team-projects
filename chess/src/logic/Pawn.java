package logic;

import javax.swing.JLabel;

public class Pawn extends Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Pawn(String color, boolean isColor) {
		super("Pawn", color, isColor);
	}

	public String toString() {
		return Icon;
	}
}
