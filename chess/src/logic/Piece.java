package logic;

public abstract class Piece {
	
	public String icon, color;
	public boolean isWhite;
	
	public Piece(String type, boolean isWhite) {
		this.isWhite = isWhite;
		color = isWhite ? "White": "Black";
		icon = type;
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
