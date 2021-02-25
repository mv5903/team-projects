package logic;

public abstract class Piece {

	protected String icon, color;
	protected boolean isColor;

	public Piece(String Icon, boolean isColor) {
		this.icon = Icon;
		this.isColor = isColor;
		color = isColor ? "White" : "Black";
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
	
	public String toString() {
		return icon;
	}
}
