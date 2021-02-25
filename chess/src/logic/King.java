package logic;


import javax.swing.JLabel;

public class King extends Piece{
	public String Icon;

	public String Color;

	public boolean isColor;

	public King(boolean isColor) {		
		super(isColor);
		
		Icon = "King";
	}
}