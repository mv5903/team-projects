package logic;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.Board;


public class ChessGameCon extends JPanel {

	
	public ChessGameCon() {
		setBounds(25, 30, 650, 650);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10, true));
		setLayout(new GridLayout(8, 8, 5, 5));
		// Spaces
	
		for (int i = 0; i < Board.spaces.length; i++) {
			for (int j = 0; j < Board.spaces[i].length; j++) {
				Board.spaces[i][j] = new JLabel();
				Board.spaces[i][j].setOpaque(true);
				Board.spaces[i][j].setForeground(Color.BLACK);
				Board.spaces[i][j].setFont(new Font("ComicSans", Font.PLAIN, 20));
				Board.spaces[i][j].setVerticalAlignment(JLabel.CENTER);
				Board.spaces[i][j].setHorizontalAlignment(JLabel.CENTER);
				if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
					Board.spaces[i][j].setBackground(new Color(245, 243, 155));
				} else {
					Board.spaces[i][j].setBackground(new Color(168, 94, 60));
				}
		
				add(Board.spaces[i][j]);
			}
			
			
		}
	
		IntializeBoard.startingBoard();

	
	
		
		
		
		
		
	}
	
	
}
