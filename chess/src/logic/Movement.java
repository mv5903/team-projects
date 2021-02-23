package logic;

public class Movement {
	private Player player;
	private Piece pieceCaptured;
	private Piece pieceMove;
	
	private Spaces start;
	private Spaces end;
	
	private boolean castlingMovement = false;
	
	
	public Movement (Player player, Spaces start, Spaces end) {
		this.player player;
		
		this.start = start;
		
		this.end = end;
		
		this.pieceMove = start.getPiece();
		
	}
	
	public boolean isCastling() {
		return this.castlingMovement;
	}
	
	
}
