package logic;

import javax.swing.JLabel;

import gui.Board;


public class IntializeBoard {

	static Spaces [][] board;
	
	
		public IntializeBoard() {
			this.startingBoard();
		}
		
		public JLabel getSpace(int x, int y) throws Exception {
			if(x < 0 || x > 7 || y < 0 || y > 7) {
				throw new Exception("Index out of bounds");
			}
			
			return Board.spaces[x][y];
		
		}
		
		public void startingBoard() {
		
			//Initialize white heros 
		board[0][0] = new Spaces(0, 0, Board.spaces[0][0], new Rook(true, null));
		
			
		board[0][0] = new Spaces(0, 1, Board.spaces[0][1], new Knight(true, null));
		
		board[0][0] = new Spaces(0, 2, Board.spaces[0][2], new Bishop(true, null));
		
		board[0][0] = new Spaces(0, 3, Board.spaces[0][3], new King(true, null));
		
		board[0][0] = new Spaces(0, 4, Board.spaces[0][4], new Queen(true, null));
		
		board[0][0] = new Spaces(0, 5, Board.spaces[0][5], new Bishop(true, null));
		
		board[0][0] = new Spaces(0, 6, Board.spaces[0][6], new Knight(true, null));
		
		board[0][0] = new Spaces(0, 7, Board.spaces[0][7], new Rook(true, null));
		
		//Initialize white Pawns
		
		board[1][0] = new Spaces(1, 0, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 1, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 2, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 3, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 4, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 5, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 6, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(1, 7, Board.spaces[1][0], new Pawn(true, null));
		
		
		
		//Initialize Black heros
		board[0][0] = new Spaces(7, 0, Board.spaces[0][0], new Rook(false, null));
		
		
		board[0][0] = new Spaces(7, 1, Board.spaces[0][1], new Knight(false, null));
		
		board[0][0] = new Spaces(7, 2, Board.spaces[0][2], new Bishop(false, null));
		
		board[0][0] = new Spaces(7, 3, Board.spaces[0][3], new King(false, null));
		
		board[0][0] = new Spaces(7, 4, Board.spaces[0][4], new Queen(false, null));
		
		board[0][0] = new Spaces(7, 5, Board.spaces[0][5], new Bishop(false, null));
		
		board[0][0] = new Spaces(7, 6, Board.spaces[0][6], new Knight(false, null));
		
		board[0][0] = new Spaces(7, 7, Board.spaces[0][7], new Rook(false, null));
		
		//Initialize white Pawns
		
		board[1][0] = new Spaces(6, 0, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 1, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 2, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 3, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 4, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 5, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 6, Board.spaces[1][0], new Pawn(true, null));
		
		board[1][0] = new Spaces(6, 7, Board.spaces[1][0], new Pawn(true, null));
		
		
		
		//Intialize remaining spaces
		
		for(int i = 2; i < 6; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = new Spaces(i, j, Board.spaces[i][j], null);
			}
		}
		
	}
}
	