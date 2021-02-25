package logic;

import javax.swing.JLabel;

import gui.Board;


public class Rook extends Piece {

	private JLabel Rook;

	public Rook(boolean color, JLabel Rook) {
		super(color);
		this.Rook = Rook; 
	}

	public boolean canMove(JLabel chessBoard, Spaces start, Spaces end) {
		if (end.getPiece().isColor() == this.isColor()) {
			return false;
		}	
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY()) - end.getY();
		return x*y == 2;
	}
	
	public JLabel getRook() {
		return Rook;
	}

	public void setRook(JLabel rook) {
		Rook = rook;
	}
	
}
