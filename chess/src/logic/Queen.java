package logic;

import javax.swing.JLabel;

<<<<<<< Updated upstream
public class Queen extends Piece {
=======
public  class Queen {
	
	
public String Icon;

public String Color;

public boolean isColor;

 public Queen(boolean isColor) {

	
	Icon = "Queen";
	
	
	
	this.isColor = isColor;
	Color = isColor ? "White": "Black";

}

public void setIcon(String icon) {
	
	Icon = icon;
}
>>>>>>> Stashed changes

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