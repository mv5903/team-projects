package logic;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Board;

public class IntializeBoard {

	static Spaces[][] board;
	
	
	static ArrayList<Rook> rook = new ArrayList<Rook>();
	
	static ArrayList<Knight> knight = new ArrayList<Knight>();
	
	static ArrayList<Bishop> bishop = new ArrayList<Bishop>();
	
	static ArrayList<King> king = new ArrayList<King>();
	
	static ArrayList<Queen> queen = new ArrayList<Queen>();
	
	static ArrayList<Pawn> pawn = new ArrayList<Pawn>();
	
	
	
	
	public IntializeBoard() {
		startingBoard();
	}

	public JLabel getSpace(int x, int y) throws IndexOutOfBoundsException {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return Board.spaces[x][y];
	}

	public void startingBoard() {
		
		Board.spaces[0][0].setIcon(new ImageIcon(new ImageIcon("Images/"+rook1.getColor()+" "+rook1.getIcon()+".png").getImage()
				.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		
		Board.spaces[0][1].setIcon(new ImageIcon(new ImageIcon("Images/"+rook.getColor()+" "+rook.getIcon()+".png").getImage()
				.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
	
	}
	
	public void createPieces() {
		for(int i = 0; i < 2; i++) {
			Rook r1 = new Rook(true);
			Rook r2 = new Rook(false);
			rook.add(r1);
			rook.add(r2);
			
			Knight k1 = new Knight(true);
			Knight k2 = new Knight(false);
			knight.add(k1);
			knight.add(k2);
			
			Bishop b1 = new Bishop(true);
			Bishop b2 = new Bishop(false);
			rook.add(b1);
			rook.add(b2);
			
		
		}
	}
}