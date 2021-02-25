package logic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.Board;

/**
 * Main class for all logic
 * @author matt
 *
 */
public class Main {
	
	static Rook b = new Rook(false);
	
	public static void main(String[] args) {
		
		
		JFrame jew = new JFrame();
		jew.setMinimumSize(new Dimension(1200, 750));
		jew.getContentPane().setBackground(Color.BLACK);
		jew.setTitle("Chess");
		jew.setLocationRelativeTo(null);
		jew.setLayout(null);
		jew.setResizable(false);
		
		ChessGameCon a = new ChessGameCon();
		
		jew.add(a);
		
		jew.pack();
		
		jew.setVisible(true);
		
		
		
	
		
	
	}
	
	
}
