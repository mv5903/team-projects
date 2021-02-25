package logic;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Board;

public class Rook extends Piece{

	public String Icon;

	public String Color;

	public boolean isColor;

	public Rook(boolean isColor) {		
		super(isColor);
		
		Icon = "Rook";
	}


	public String toString() {
		return Icon;
	}

}
