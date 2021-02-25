package logic;

import javax.swing.JLabel;

public class Pawn extends Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Pawn(boolean isColor) {
		super("Pawn", isColor);
	}

	public String toString() {
		return Icon;
	}
}
