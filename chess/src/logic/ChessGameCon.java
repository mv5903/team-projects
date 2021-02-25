package logic;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.Board;


public class ChessGameCon extends JPanel {

	static King a = new King(false);
	
<<<<<<< Updated upstream
	static IntializeBoard b = new IntializeBoard();
=======
	static IntializeBoard t1 = new IntializeBoard();
>>>>>>> Stashed changes
	
	static Scanner scan = new Scanner(System.in);
	
	public static JLabel[][] spaces = new JLabel[8][8];
	
	public ChessGameCon() {
		setBounds(25, 30, 650, 650);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
		setLayout(new GridLayout(8, 8, 5, 5));
		// hi
		// Spaces
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
		setLayout(new GridLayout(8, 8, 5, 5));
		// Spaces
	
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
				
				
				
				
				
				add(spaces[i][j]);
			}
			
			
		}
		
	
	IntializeBoard.createPieces(IntializeBoard.rook);
		
<<<<<<< Updated upstream
=======
	t1.createPieces();
		
>>>>>>> Stashed changes
		Board.spaces[0][0].setIcon(new ImageIcon(new ImageIcon("Images/"+IntializeBoard.rook.get(1).getColor()+" "+IntializeBoard.rook.get(1).getIcon()+".png").getImage()
				.getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		
		
		
		
	}
}
