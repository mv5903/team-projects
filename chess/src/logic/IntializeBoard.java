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
		createPieces();
		// white rooks
		Board.spaces[0][0].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(0).getColor() + " " + rook.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][7].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(0).getColor() + " " + rook.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// black rooks
		Board.spaces[7][0].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(1).getColor() + " " + rook.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][7].setIcon(
				new ImageIcon(new ImageIcon("Images/" + rook.get(1).getColor() + " " + rook.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white knights
		Board.spaces[0][1].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(0).getColor() + " " + knight.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][6].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(0).getColor() + " " + knight.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// black knights
		Board.spaces[7][1].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(1).getColor() + " " + knight.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][6].setIcon(new ImageIcon(
				new ImageIcon("Images/" + knight.get(1).getColor() + " " + knight.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white bishops
		Board.spaces[0][2].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(0).getColor() + " " + bishop.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[0][5].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(0).getColor() + " " + bishop.get(0).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// black bishops
		Board.spaces[7][2].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(1).getColor() + " " + bishop.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		Board.spaces[7][5].setIcon(new ImageIcon(
				new ImageIcon("Images/" + bishop.get(1).getColor() + " " + bishop.get(1).getIcon() + ".png").getImage()
						.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white queen
		Board.spaces[0][3].setIcon(
				new ImageIcon(new ImageIcon("Images/" + queen.get(0).getColor() + " " + queen.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// black queen
		Board.spaces[7][3].setIcon(
				new ImageIcon(new ImageIcon("Images/" + queen.get(1).getColor() + " " + queen.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// white king
		Board.spaces[0][4].setIcon(
				new ImageIcon(new ImageIcon("Images/" + king.get(0).getColor() + " " + king.get(0).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// black king
		Board.spaces[7][4].setIcon(
				new ImageIcon(new ImageIcon("Images/" + king.get(1).getColor() + " " + king.get(1).getIcon() + ".png")
						.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));

		// pawns
		for (int i = 0; i < 7; i++) {
			Board.spaces[1][i].setIcon(
					new ImageIcon(new ImageIcon("Images/" + pawn.get(0).getColor() + " " + pawn.get(0).getIcon() + ".png")
							.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
			Board.spaces[6][i].setIcon(
					new ImageIcon(new ImageIcon("Images/" + pawn.get(1).getColor() + " " + pawn.get(1).getIcon() + ".png")
							.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		}

	}

	public void createPieces() {
		for (int i = 0; i < 2; i++) {
			Rook r1 = new Rook(true);
			Rook r2 = new Rook(false);
			rook.add(r1);
			rook.add(r2);

			Knight n1 = new Knight(true);
			Knight n2 = new Knight(false);
			knight.add(n1);
			knight.add(n2);

			Bishop b1 = new Bishop(true);
			Bishop b2 = new Bishop(false);
			bishop.add(b1);
			bishop.add(b2);

			Queen q1 = new Queen(true);
			Queen q2 = new Queen(false);
			queen.add(q1);
			queen.add(q2);

			King k1 = new King(true);
			King k2 = new King(false);
			king.add(k1);
			king.add(k2);

			Pawn p1 = new Pawn(true);
			Pawn p2 = new Pawn(false);
			pawn.add(p1);
			pawn.add(p2);

		}
	}
}
