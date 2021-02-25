package logic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Piece {
	private static ImageIcon Icon;
	
	private static ImageIcon Color;
	

	
	public Piece(ImageIcon Icon, ImageIcon color) {
		Piece.Icon = Icon;
		
		Piece.Color = color;
	}



	public static ImageIcon getIcon() {
		return Icon;
	}



	public static void setIcon(ImageIcon icon) {
		Icon = icon;
	}



	public static ImageIcon getColor() {
		return Color;
	}



	public static void setColor(ImageIcon color) {
		Color = color;
	}
	
	
	
	
}
