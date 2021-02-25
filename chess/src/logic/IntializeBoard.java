package logic;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Board;

public class IntializeBoard {

	static Spaces[][] board;
	
	
	public static ArrayList<Rook> rook = new ArrayList<Rook>();
	
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
		
		Board.spaces[0][0].setIcon(new ImageIcon(new ImageIcon("Images/"+rook.get(1).getColor()+" "+rook.get(1).getIcon()+".png").getImage()
				.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		
		
	
	}
	
	public static void createPieces(ArrayList<Rook> input) {
			
			Rook r1 = new Rook(true);
			Rook r2 = new Rook(false);
			input.add(r1);
			input.add(r2);
			
			rook = input;
			return input;
			
			/*Knight k1 = new Knight(true);
			Knight k2 = new Knight(false);
			knight.add(k1);
			knight.add(k2);
			
			Bishop b1 = new Bishop(true);
			Bishop b2 = new Bishop(false);
			bishop.add(b1);
			bishop.add(b2);
			return rook2;
			*/
		
		}
	}


