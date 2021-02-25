package logic;

import javax.swing.JLabel;

public class Pawn extends Piece{
	
	private JLabel Pawn;
	
	
	public Pawn(boolean color, JLabel Pawn) {
		super(color);
		this.Pawn = Pawn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(JLabel chessBoard, Spaces start, Spaces end) {
		// TODO Auto-generated method stub
		if( end.getPiece().isColor() == this.isColor()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getX());
		
		int y = Math.abs(start.getY()) - end.getY();
		
		return x*y == 2;
	}

	public JLabel getPawn() {
		return Pawn;
	}

	public void setPawn(JLabel pawn) {
		Pawn = pawn;
	}
	
	


}
