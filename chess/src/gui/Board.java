package gui;

import java.awt.*;

import javax.swing.*;

public class Board extends JPanel {
	JLabel[][] spaces = new JLabel[8][8];  //first box is numbers // second box is letter // Example jlabels[0][1] refers to the space b1.
	Board() {
		//Panel Containing all the spaces
		setBounds(25,30,650,650);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.WHITE,  10, true));
		setLayout(new GridLayout(8,8,5,5));
		
		//Spaces
		for (int i = 0; i < spaces.length; i++) {
			for (int j = 0; j < spaces[i].length; j++) {
				spaces[i][j] = new JLabel();
				spaces[i][j].setOpaque(true);
				if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
					spaces[i][j].setBackground(new Color(245, 243, 155));
				} else {
					spaces[i][j].setBackground(new Color(168,94,60));
				}
				add(spaces[i][j]);
			}
		}
	}
}
