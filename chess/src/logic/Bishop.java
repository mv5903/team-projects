package logic;

public abstract class Bishop extends Piece{

	public Bishop(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(ChessBoard chessBoard, Tile start, tile end) {
		
		return false;
	}

}
