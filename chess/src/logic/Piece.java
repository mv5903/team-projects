package logic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Piece {
<<<<<<< Updated upstream
=======
	private String Icon;
	
	private String Color;
>>>>>>> Stashed changes
	
	public String Icon;

	public String Color;

	public boolean isColor;
	
<<<<<<< Updated upstream
	public Piece(boolean isColor) {
		
		
		
=======
	public Piece(ImageIcon Icon, ImageIcon color) {
>>>>>>> Stashed changes
		this.isColor = isColor;
		Color = isColor ? "White": "Black";
	}




	public String getIcon() {
		return Icon;
	}



	public void setIcon(String icon) {
		Icon = icon;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}
}
