package logic;

import javax.swing.JLabel;

public  class Knight {
	
	public String Icon;

	public String Color;

	public boolean isColor;

	 public Knight(boolean isColor) {

		
		Icon = "Knight";
		
		
		
		this.isColor = isColor;
		
		if(this.isColor == true) {
			Color = "White";
			
		}else {
			Color = "Black";
		}

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
	
	