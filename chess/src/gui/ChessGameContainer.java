package gui;

import java.awt.*;

import javax.swing.*;

public class ChessGameContainer extends JFrame {
	ChessGameContainer() {
		Board board = new Board();
		setMinimumSize(new Dimension(1200, 750));
		getContentPane().setBackground(Color.BLACK);
		setTitle("Chess");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		add(board);
		pack();
		setVisible(true);
	}

}
