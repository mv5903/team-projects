package logic;

import javax.swing.JLabel;

public  class Knight extends Piece {
	
	private JLabel Knight;
	
	
	public Knight(boolean color, JLabel Knight) {
		super(color);
		this.Knight = Knight;
	}

	public boolean canMove(JLabel chessBoard, Spaces start, Spaces end) {
		if( end.getPiece().isColor() == this.isColor()) {
			return false;
		}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY()) - end.getY();
		return x*y == 2;
	}


	public JLabel getKnight() {
		return Knight;
	}


	public void setKnight(JLabel knight) {
		Knight = knight;
	}
	
	

}
	
	