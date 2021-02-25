package logic;

import javax.swing.JLabel;

public  class Bishop extends Piece{

	
	private JLabel Bishop;
	
	public Bishop(boolean color, JLabel Bishop) {
		super(color);
		this.Bishop = Bishop;
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

	public JLabel getBishop() {
		return Bishop;
	}

	public void setBishop(JLabel bishop) {
		Bishop = bishop;
	}
	
	


}
