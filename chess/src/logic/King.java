package logic;

import javax.swing.JLabel;

public class King extends Piece {
	public String Icon;

	public String Color;

	public boolean isColor;

	public King(String color, boolean isColor) {
		super("King", color, isColor);
	}

	public String toString() {
		return Icon;
	}

}
