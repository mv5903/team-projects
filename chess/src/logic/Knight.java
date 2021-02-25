package logic;


public class Knight extends Piece{
	
	public String Icon;

	public String Color;

	public boolean isColor;

	public Knight(boolean isColor) {		
		super(isColor);
	}


	public String toString() {
		return Icon;
	}

}
	
	