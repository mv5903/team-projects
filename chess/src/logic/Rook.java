package logic;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Board;


public class Rook  {

	public String Icon;
	
	public String Color;
	
	public boolean isColor;

	 public Rook(boolean isColor) {
	
		
		Icon = "Rook";
		
		
		
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
