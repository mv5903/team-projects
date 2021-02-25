package logic;

import javax.swing.JLabel;

public class Pawn extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	 public Pawn(boolean isColor) {
<<<<<<< Updated upstream
		 super(isColor);
			
			Icon = "Pawn";
=======

		
		Icon = "Pawn";
		
		
		
		this.isColor = isColor;
		Color = isColor ? "White": "Black";

	}

	public void setIcon(String icon) {
		
		Icon = icon;
	}

	public void setColor(String color) {
		
		Color = color;
	}

	public String getIcon() {
		return Icon;
	}
>>>>>>> Stashed changes

	}



	public String toString() {
		return Icon;
	}
}
