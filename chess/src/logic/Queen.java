package logic;

import javax.swing.JLabel;

public  class Queen extends Piece{
	
	private JLabel Queen;
	
	public Queen (boolean color, JLabel Queen) {
		super(color);
		this.Queen = Queen;
		
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

	public JLabel getQueen() {
		return Queen;
	}

	public void setQueen(JLabel queen) {
		Queen = queen;
	}
	
	
}
