package logic;
import javax.swing.JLabel;

public class Spaces {
	private Piece piece;
	private int x, y;
	private JLabel input;
	
		public Spaces(int x, int y, JLabel input, Piece piece) {
			this.setX(x);
			this.setY(y);
			this.setPiece(piece);
		}

		public Piece getPiece() {
			return this.piece;
		}

		public void setPiece(Piece piece) {
			this.piece = piece;
		}

		public int getX() {
			return this.x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return this.y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public JLabel getInput() {
			return input;
		}

		public void setInput(JLabel input) {
			this.input = input;
		}
		
}
