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
		createPieces();
		startingBoard();
	}

	public JLabel getSpace(int x, int y) throws IndexOutOfBoundsException {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return Board.spaces[x][y];
	}

	public static void startingBoard() {
		createPieces();
		// white rooks
		Board.spaces[7][7].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(0).getColor() + " " + rook.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][0].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(0).getColor() + " " + rook.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		// black rooks
		Board.spaces[0][7].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(1).getColor() + " " + rook.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][0].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(1).getColor() + " " + rook.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white knights
		Board.spaces[7][6].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(0).getColor() + " " + knight.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][1].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(0).getColor() + " " + knight.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		// black knights
		Board.spaces[0][6].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(1).getColor() + " " + knight.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][1].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(1).getColor() + " " + knight.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white bishops
		Board.spaces[7][5].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(0).getColor() + " " + bishop.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][2].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(0).getColor() + " " + bishop.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		// black bishops
		Board.spaces[0][2].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(1).getColor() + " " + bishop.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][5].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(1).getColor() + " " + bishop.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white queen
		Board.spaces[7][3].setIcon(
				new ImageIcon(new ImageIcon("Images/" + queen.get(0).getColor() + " " + queen.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		// black queen
		Board.spaces[0][3].setIcon(
				new ImageIcon(new ImageIcon("Images/" + queen.get(1).getColor() + " " + queen.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white king
		Board.spaces[7][4].setIcon(
				new ImageIcon(new ImageIcon("Images/" + king.get(0).getColor() + " " + king.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		// black king
		Board.spaces[0][4].setIcon(
				new ImageIcon(new ImageIcon("Images/" + king.get(1).getColor() + " " + king.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// pawns
		for (int i = 0; i <= 7; i++) {
			Board.spaces[6][i].setIcon(new ImageIcon(
					new ImageIcon("Images/" + pawn.get(0).getColor() + " " + pawn.get(0).getIcon() + ".png").getImage()
							.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
			Board.spaces[1][i].setIcon(new ImageIcon(
					new ImageIcon("Images/" + pawn.get(1).getColor() + " " + pawn.get(1).getIcon() + ".png").getImage()
							.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		}

	}

	public static void createPieces() {
		for (int i = 0; i < 2; i++) {
			boolean isWhite = i == 0;
			rook.add(new Rook(isWhite));
			knight.add(new Knight(isWhite));
			bishop.add(new Bishop(isWhite));
			queen.add(new Queen(isWhite));
			king.add(new King(isWhite));
			pawn.add(new Pawn(isWhite));
		}
	}
}
