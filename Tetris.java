package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Controls
 * Arrows rotate piece
 * P key pauses game
 * D key drops piece one line down
 * Spacebar drop piece all the way down
 */
public class Tetris extends JFrame {
	//Sets up the board and statusbar
	JLabel statusbar;
	
	public Tetris() {
		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		Board board = new Board(this);
		add(board);
		//Initiates game
		board.start();
		
		setSize(200, 400);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JLabel getStatusBar() {
		return statusbar;
	}
	
	public static void main(String[] args) {
		Tetris game = new Tetris();
		game.setLocationRelativeTo(null);
		game.setVisible(true);
	}
}
