package logic;

public class King extends Piece{
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
	
	
	public boolean canMove () {
		//A chess piece can't move if there is another piece of the same type
		
		
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
}
