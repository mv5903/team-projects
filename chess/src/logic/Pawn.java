package logic;

public abstract class Pawn extends Piece{

	public Pawn(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(ChessBoard chessBoard, Tile start, tile end) {
		// TODO Auto-generated method stub
		return false;
	}

}
