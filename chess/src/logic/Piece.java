package logic;

public abstract class Piece {
	
	public String icon, color;
	public boolean isColor;
	
	public Piece(String type, boolean isColor) {
		this.isColor = isColor;
		color = isColor ? "White": "Black";
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
