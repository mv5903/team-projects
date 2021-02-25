package logic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

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
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		JFrame testFrame = new JFrame();
		testFrame.setMinimumSize(new Dimension(1200, 750));
		testFrame.getContentPane().setBackground(Color.BLACK);
		testFrame.setTitle("Chess");
		testFrame.setLocationRelativeTo(null);
		testFrame.setLayout(null);
		testFrame.setResizable(false);
		
		ChessGameCon a = new ChessGameCon();
		
		testFrame.add(a);
		
		testFrame.pack();
		
		testFrame.setVisible(true);
		
		
	
		
		
	
		
	
	}
	
	
}
