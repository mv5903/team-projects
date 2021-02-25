package gui;

import java.awt.*;

import javax.swing.*;

import logic.Rook;
import logic.Rook;
public class Board extends JPanel {

	public static JLabel[][] spaces = new JLabel[8][8]; // first box is numbers // second box is letter // Example
														// jlabels[0][1] refers to the space b1.
	boolean isWhite = true;
	// jlabels[0][1] refers to the space b1.

	Board() {
		// Panel Containing all the spaces
		setBounds(25, 30, 650, 650);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
		setLayout(new GridLayout(8, 8, 5, 5));
		// hi
		// Spaces
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
		setLayout(new GridLayout(8, 8, 5, 5));
		// Spaces
		int counter1 = 8;
		int counter2 = 1;
		for (int i = 0; i < spaces.length; i++) {
			for (int j = 0; j < spaces[i].length; j++) {
				spaces[i][j] = new JLabel();
				spaces[i][j].setOpaque(true);
				spaces[i][j].setForeground(Color.BLACK);
				spaces[i][j].setFont(new Font("ComicSans", Font.PLAIN, 20));
				spaces[i][j].setVerticalAlignment(JLabel.CENTER);
				spaces[i][j].setHorizontalAlignment(JLabel.CENTER);
				if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
					spaces[i][j].setBackground(new Color(245, 243, 155));
				} else {
					spaces[i][j].setBackground(new Color(168, 94, 60));
				}
				if (isWhite) { // white's point of view
//					if (i == 7) {
//						char[] letters = {'A','B','C','D','E','F','G','H'};
//						if (j == 0) {
//							spaces[i][j].setText("<html>1<br>" + "<br>" + Character.toString(letters[j]) +"</html>");
//						} else{
//							spaces[i][j].setText("<html><br>" + "<br>"+ Character.toString(letters[j]) +"</html>");
//						}
//					}
					// adding temporary pieces
					if (i == 6) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White Pawn.png").getImage()
								.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
					} else if (i == 1) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black Pawn.png").getImage()
								.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
					} else if (i == 0 && j == 0 || i == 0 && j == 7) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black Rook.png").getImage()
								.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
					} else if (i == 7 && j == 0 || i == 7 && j == 7) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White Rook.png").getImage()
								.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
					} else if (i == 7 && j == 3) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White Queen.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 0 && j == 3) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black Queen.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 0 && j == 4) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black King.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 7 && j == 4) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White King.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 0 && j == 1 || i == 0 && j == 6) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black Knight.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 7 && j == 1 || i == 7 && j == 6) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White Knight.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 0 && j == 2 || i == 0 && j == 5) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/Black Bishop.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					} else if (i == 7 && j == 2 || i == 7 && j == 5) {
						spaces[i][j].setIcon(new ImageIcon(new ImageIcon("Images/White Bishop.png").getImage()
								.getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
					}
//					if (j == 0 && i != 7) {
//						spaces[i][j].setText(Integer.toString(counter1));
//					}
				} else { // black's point of view
//					if (i == 7) {
//						char[] letters = {'H','G','F','E','D','C','B','A'};
//						if (j == 0) {
//							spaces[i][j].setText("<html>8<br>" + "<br>_____" + Character.toString(letters[j]) +"</html>");
//						} else {
//							spaces[i][j].setText("<html><br>" + "<br>_____"+ Character.toString(letters[j]) +"</html>");
//						}
//					}
//					if (j == 0 && i != 7) {
//						spaces[i][j].setText(Integer.toString(counter2));
//					}
				}

				add(spaces[i][j]);
			}
			counter1--;
			counter2++;
		}
	}
}
