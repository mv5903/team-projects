package logic;

import javax.swing.JLabel;

public class Queen extends Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Queen(boolean isColor) {		
		super(isColor);
		
		Icon = "Queen";
	}


	public String toString() {
		return Icon;
	}
}