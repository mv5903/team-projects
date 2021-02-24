package logic;

public abstract class King extends Piece{
	private boolean castlingStatus = false;
	
	public King(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public boolean isCastlingStatus() {
		return castlingStatus;
	}

	public void setCastlingStatus(boolean castlingStatus) {
		this.castlingStatus = castlingStatus;
	}
	
	
	
	private boolean validCastling (ChessBoard chessBoard, Tile start, tile end) {
		
		
		if(this.isCastlingStatus()) {
			return false;
		}
	}
	//Available 
	public boolean isCastlingAvailable(Tile start, Tile end) {
		//Validates if the king can castle with the starting and ending positions
	}

	@Override
	public boolean canMove(ChessBoard chessBoard, Tile start, tile end) {
		// TODO Auto-generated method stub
		return false;
	}
}
