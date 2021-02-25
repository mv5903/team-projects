package logic;

import javax.swing.JLabel;

public  class Bishop {

	public String Icon;
	
	public String Color;

	public boolean isColor;

	 public Bishop(boolean isColor) {

		
		Icon = "King";
		
		
		
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

	public String getColor() {
		return Color;
	}



	public String toString() {
		return Icon;
	}

}
