package gui;

import java.awt.*;

import javax.swing.*;

public class ChessGameContainer extends JFrame {

	private static final long serialVersionUID = -3058720631459082916L;


	JLabel[] timeContainer = new JLabel[2], playerNames = new JLabel[2]; // a timer slot for each player //name for each player
	JTextArea movesPlayed = new JTextArea();
	JPanel[] capturedPieceContainer = new JPanel[2];
	ChessGameContainer() {
		Board board = new Board();
		
		//JFrame
		setMinimumSize(new Dimension(1200, 750));
		getContentPane().setBackground(Color.BLACK);
		setTitle("Chess");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		//timeContainer
		for (int i = 0; i < timeContainer.length; i++) {
			timeContainer[i] = new JLabel();
			timeContainer[i].setText("Time: (insert var)"); //placeholder
			timeContainer[i].setHorizontalAlignment(JLabel.CENTER);
			timeContainer[i].setForeground(Color.WHITE);
			timeContainer[i].setFont(new Font("ComicSans", Font.PLAIN, 18));
			timeContainer[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
			if (i == 0) {
				timeContainer[i].setBounds(700, 30, 200, 50);
			} else {
				timeContainer[i].setBounds(700, 550, 200, 50);
			}
			add(timeContainer[i]);
		}
		
		//Captured Pieces Container
		for (int i = 0; i < capturedPieceContainer.length; i++) {
			capturedPieceContainer[i] = new JPanel();
			capturedPieceContainer[i].setBackground(Color.BLACK);
			capturedPieceContainer[i].setFont(new Font("ComicSans", Font.PLAIN, 18));
			capturedPieceContainer[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
			if (i == 0) {
				capturedPieceContainer[i].setBounds(700, 105, 200, 50);
			} else {
				capturedPieceContainer[i].setBounds(700, 625, 200, 50);
			}
			add(capturedPieceContainer[i]);
		}
		
		
		//EXECUTE @ END
		add(board);
		pack();
		setVisible(true);
	}

}
