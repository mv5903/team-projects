package logic;

import javax.swing.JLabel;

public  class King extends Piece{
	private boolean castlingStatus = false;
	private JLabel King;
	public King(boolean color, JLabel King) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public boolean getCastlingStatus() {
		return castlingStatus;
	}

	public void setCastlingStatus(boolean castlingStatus) {
		this.castlingStatus = castlingStatus;
	}
	
	private boolean validCastling(ChessBoard chessBoard, Tile start, tile end) {
		
		
		if (isCastlingStatus()) {
			return false;
		}
	}
	//Available 
	public boolean canCastle(Spaces start, Spaces end) {
		//Validates if the king can castle with the starting and ending positions
	}

	public boolean canMove(JLabel chessBoard, Spaces start, Spaces end) {
		if (end.getPiece().isColor() == this.isColor()) {
			return false;
		}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY()) - end.getY();
		return x*y == 2;
	}

}
