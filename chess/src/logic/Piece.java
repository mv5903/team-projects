package logic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Piece {

	public String Icon;

	public String Color;

	public boolean isColor;

	public Piece(String Icon, String color, boolean isColor) {

		this.Icon = Icon;

		this.isColor = isColor;
		Color = isColor ? "White" : "Black";
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
