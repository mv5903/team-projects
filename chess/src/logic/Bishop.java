package logic;

import javax.swing.JLabel;

public class Bishop extends Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Bishop(boolean isColor) {
		super("Bishop", isColor);
	}

	public String toString() {
		return Icon;
	}

}
