package logic;

import javax.swing.JLabel;

public class Knight extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	public Knight(boolean isColor) {		
		super(isColor);
		
		Icon = "Knight";
<<<<<<< Updated upstream
=======
		
		
		
		this.isColor = isColor;
		Color = isColor ? "White": "Black";

	}

	public void setIcon(String icon) {
		
		Icon = icon;
>>>>>>> Stashed changes
	}


	public String toString() {
		return Icon;
	}

}
	
	