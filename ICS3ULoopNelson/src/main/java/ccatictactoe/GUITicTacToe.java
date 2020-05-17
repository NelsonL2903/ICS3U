package ccatictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUITicTacToe extends JPanel implements MouseListener, ActionListener {

	static int[][] board = new int[3][3];
	static int attempt = 0;

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(new Color(31, 21, 1));
		g2d.fillRect(525, 0, 10, 300);

		g2d.setColor(new Color(31, 21, 1));
		g2d.fillRect(425, 0, 10, 300);

		g2d.setColor(new Color(31, 21, 1));
		g2d.fillRect(325, 100, 300, 10);

		g2d.setColor(new Color(31, 21, 1));
		g2d.fillRect(325, 200, 300, 10);

		switch (board[0][0]) {
		case 1:
			g2d.drawLine(335, 5, 415, 95);
			g2d.drawLine(335, 95, 415, 5);
			break;
		case 2:
			g.drawOval(335, 10, 80, 80);
		}

		switch (board[0][1]) {
		case 1:
			g2d.drawLine(440, 5, 520, 95);
			g2d.drawLine(440, 95, 520, 5);
			break;
		case 2:
			g.drawOval(440, 10, 80, 80);
		}

		switch (board[0][2]) {
		case 1:
			g2d.drawLine(545, 5, 625, 95);
			g2d.drawLine(545, 95, 625, 5);
			break;
		case 2:
			g.drawOval(545, 10, 80, 80);
		}

		switch (board[1][0]) {
		case 1:
			g2d.drawLine(335, 110, 415, 200);
			g2d.drawLine(335, 200, 415, 110);
			break;
		case 2:
			g.drawOval(335, 115, 80, 80);
		}

		switch (board[1][1]) {
		case 1:
			g2d.drawLine(440, 110, 520, 200);
			g2d.drawLine(440, 200, 520, 110);
			break;
		case 2:
			g.drawOval(440, 115, 80, 80);
		}

		switch (board[1][2]) {
		case 1:
			g2d.drawLine(545, 110, 625, 200);
			g2d.drawLine(545, 200, 625, 110);
			break;
		case 2:
			g.drawOval(545, 115, 80, 80);
		}

		switch (board[2][0]) {
		case 1:
			g2d.drawLine(335, 210, 415, 300);
			g2d.drawLine(335, 300, 415, 210);
			break;
		case 2:
			g.drawOval(335, 215, 80, 80);
		}

		switch (board[2][1]) {
		case 1:
			g2d.drawLine(440, 210, 520, 300);
			g2d.drawLine(440, 300, 520, 210);
			break;
		case 2:
			g.drawOval(440, 215, 80, 80);
		}

		switch (board[2][2]) {
		case 1:
			g2d.drawLine(545, 210, 625, 300);
			g2d.drawLine(545, 300, 625, 210);
			break;
		case 2:
			g.drawOval(545, 215, 80, 80);
		}

		GUITicTacToe gttt = new GUITicTacToe();
		if (gttt.cwc() == false && gttt.clc() == false && gttt.dc() == false) {
			g2d.drawString("Please don't maximize the window", 385, 325);
			g2d.drawString("Click the square where you would like to play", 355, 340);
			g2d.drawString("If you're click does not register, please click again", 345, 355);
		} else if (gttt.clc()) {
			g2d.drawString("You won! Congrats!", 330, 325);
			g2d.drawString("Click the button if you would like to play again", 355, 340);
		} else if (gttt.cwc()) {
			g2d.drawString("You lost! Good try", 430, 325);
			g2d.drawString("Click the button if you would like to play again", 355, 340);
		} else if (gttt.dc()) {
			g2d.drawString("It's a draw! Good game!", 415, 325);
			g2d.drawString("Click the button if you would like to play again", 355, 340);
		}

		String attempts = "Attempt #" + attempt;
		Font attemptFont = new Font("ComicSans", Font.BOLD, 25);
		g2d.setFont(attemptFont);
		g2d.drawString(attempts, 750, 150);

		if ((board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
				|| (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)) {
			g2d.drawLine(300, 50, 660, 50);
		} else if ((board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1)
				|| (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2)) {
			g2d.drawLine(300, 155, 660, 155);
		} else if ((board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
				|| (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2)) {
			g2d.drawLine(300, 255, 660, 255);

		} else if ((board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1)
				|| (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2)) {
			g2d.drawLine(375, 0, 375, 305);
		} else if ((board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1)
				|| (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2)) {
			g2d.drawLine(480, 0, 480, 305);
		} else if ((board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1)
				|| (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2)) {
			g2d.drawLine(585, 0, 585, 305);

		} else if ((board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1)
				|| (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2)) {
			g2d.drawLine(320, 0, 635, 305);
		} else if ((board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1)
				|| (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2)) {
			g2d.drawLine(325, 305, 635, 0);
		}

	}

	public static void main(String[] args) {

		GUITicTacToe gttt = new GUITicTacToe();

		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gttt);
		frame.setSize(1000, 550);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.addMouseListener(gttt);

		JLabel title = new JLabel("Nelson's Tic Tac Toe!", SwingConstants.CENTER);
		title.setPreferredSize(new Dimension(300, 100));
		title.setFont(new Font("ComicSans", Font.BOLD, 25));
		frame.getContentPane().add(title, BorderLayout.NORTH);

		JButton pa = new JButton("Play again");
		frame.getContentPane().add(pa, BorderLayout.SOUTH);
		pa.addActionListener(gttt);

		gttt.cb();

	}

	public void cft() {
		if (board[0][0] == 1 || board[0][2] == 1 || board[2][0] == 1 || board[2][2] == 1) {
			board[1][1] = 2;
		} else if (board[0][1] == 1 || board[1][0] == 1 || board[1][2] == 1 || board[2][1] == 1) {
			board[1][1] = 2;
		} else if (board[1][1] == 1) {
			board[2][0] = 2;
		}

	}

	public boolean pwc() {
		if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 0) {
			board[2][0] = 2;
			return true;
		} else if (board[0][0] == 0 && board[1][0] == 2 && board[2][0] == 2) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 2 && board[1][0] == 0 && board[2][0] == 2) {
			board[1][0] = 2;
			return true;

		} else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 0) {
			board[2][1] = 2;
			return true;
		} else if (board[0][1] == 0 && board[1][1] == 2 && board[2][1] == 2) {
			board[0][1] = 2;
			return true;
		} else if (board[0][1] == 2 && board[1][1] == 0 && board[2][1] == 2) {
			board[1][1] = 2;
			return true;

		} else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[0][2] == 0 && board[1][2] == 2 && board[2][2] == 2) {
			board[0][2] = 2;
			return true;
		} else if (board[0][2] == 2 && board[1][2] == 0 && board[2][2] == 2) {
			board[1][2] = 2;
			return true;

		} else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[0][0] == 0 && board[0][1] == 2 && board[0][2] == 2) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 2 && board[0][1] == 0 && board[0][2] == 2) {
			board[0][1] = 2;
			return true;

		} else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 0) {
			board[1][2] = 2;
			return true;
		} else if (board[1][0] == 0 && board[1][1] == 2 && board[1][2] == 2) {
			board[1][0] = 2;
			return true;
		} else if (board[1][0] == 2 && board[1][1] == 0 && board[1][2] == 2) {
			board[1][1] = 2;
			return true;

		} else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[2][0] == 0 && board[2][1] == 2 && board[2][2] == 2) {
			board[2][0] = 2;
			return true;
		} else if (board[2][0] == 2 && board[2][1] == 0 && board[2][2] == 2) {
			board[2][1] = 2;
			return true;

		} else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[0][0] == 0 && board[1][1] == 2 && board[2][2] == 2) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 2 && board[1][1] == 0 && board[2][2] == 2) {
			board[1][1] = 2;
			return true;

		} else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[2][0] == 0 && board[1][1] == 2 && board[0][2] == 2) {
			board[2][0] = 2;
			return true;
		} else if (board[2][0] == 2 && board[1][1] == 0 && board[0][2] == 2) {
			board[1][1] = 2;
			return true;
		}

		return false;
	}

	public boolean owc() {

		if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 0) {
			board[2][0] = 2;
			return true;
		} else if (board[0][0] == 0 && board[1][0] == 1 && board[2][0] == 1) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 1 && board[1][0] == 0 && board[2][0] == 1) {
			board[1][0] = 2;
			return true;

		} else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 0) {
			board[2][1] = 2;
			return true;
		} else if (board[0][1] == 0 && board[1][1] == 1 && board[2][1] == 1) {
			board[0][1] = 2;
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 0 && board[2][1] == 1) {
			board[1][1] = 2;
			return true;

		} else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[0][2] == 0 && board[1][2] == 1 && board[2][2] == 1) {
			board[0][2] = 2;
			return true;
		} else if (board[0][2] == 1 && board[1][2] == 0 && board[2][2] == 1) {
			board[1][2] = 2;
			return true;

		} else if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[0][0] == 0 && board[0][1] == 1 && board[0][2] == 1) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 1 && board[0][1] == 0 && board[0][2] == 1) {
			board[0][1] = 2;
			return true;

		} else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 0) {
			board[1][2] = 2;
			return true;
		} else if (board[1][0] == 0 && board[1][1] == 1 && board[1][2] == 1) {
			board[1][0] = 2;
			return true;
		} else if (board[1][0] == 1 && board[1][1] == 0 && board[1][2] == 1) {
			board[1][1] = 2;
			return true;

		} else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[2][0] == 0 && board[2][1] == 1 && board[2][2] == 1) {
			board[2][0] = 2;
			return true;
		} else if (board[2][0] == 1 && board[2][1] == 0 && board[2][2] == 1) {
			board[2][1] = 2;
			return true;

		} else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		} else if (board[0][0] == 0 && board[1][1] == 1 && board[2][2] == 1) {
			board[0][0] = 2;
			return true;
		} else if (board[0][0] == 1 && board[1][1] == 0 && board[2][2] == 1) {
			board[1][1] = 2;
			return true;

		} else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[2][0] == 0 && board[1][1] == 1 && board[0][2] == 1) {
			board[2][0] = 2;
			return true;
		} else if (board[2][0] == 1 && board[1][1] == 0 && board[0][2] == 1) {
			board[1][1] = 2;
			return true;
		}

		return false;
	}

	public boolean swc() {
		if (board[0][1] == 1 && board[2][0] == 1 && board[0][0] == 0 && board[0][2] == 0 && board[1][0] == 0) {
			board[0][0] = 2;
			return true;

		} else if (board[0][0] == 1 && board[1][2] == 1 && board[0][2] == 0 && board[0][1] == 0 && board[2][2] == 0) {
			board[0][2] = 2;
			return true;

		} else if (board[0][2] == 1 && board[2][1] == 1 && board[2][2] == 0 && board[1][2] == 0 && board[2][0] == 0) {
			board[2][2] = 2;
			return true;

		} else if (board[1][0] == 1 && board[2][2] == 1 && board[2][0] == 0 && board[0][0] == 0 && board[2][1] == 0) {
			board[2][0] = 2;
			return true;

		} else if (board[2][0] == 1 && board[0][2] == 1 && board[1][2] == 0 && board[2][1] == 0 && board[2][2] == 0) {
			board[1][2] = 2;
			return true;

		} else if (board[0][0] == 1 && board[1][0] == 0 && board[2][2] == 1 && board[2][1] == 0 && board[2][0] == 0) {
			board[1][0] = 2;
			return true;

		} else if (board[2][0] == 1 && board[1][2] == 1 && board[2][2] == 0 && board[2][1] == 0 && board[0][2] == 0) {
			board[2][2] = 2;
			return true;

		} else if (board[0][0] == 1 && board[2][1] == 1 && board[2][0] == 0 && board[1][0] == 0 && board[2][2] == 0) {
			board[2][0] = 2;
			return true;

		} else if (board[1][0] == 1 && board[0][2] == 1 && board[0][0] == 0 && board[0][1] == 0 && board[2][0] == 0) {
			board[0][0] = 2;
			return true;

		} else if (board[0][1] == 1 && board[2][2] == 1 && board[0][2] == 0 && board[0][0] == 0 && board[1][2] == 0) {
			board[0][2] = 2;
			return true;

		} else if (board[1][0] == 1 && board[0][1] == 1 && board[0][0] == 0 && board[2][0] == 0 && board[0][2] == 0) {
			board[0][0] = 2;
			return true;

		} else if (board[0][1] == 1 && board[1][2] == 1 && board[0][2] == 0 && board[0][0] == 0 && board[2][2] == 0) {
			board[0][2] = 2;
			return true;

		} else if (board[2][1] == 1 && board[1][2] == 1 && board[2][2] == 0 && board[2][0] == 0 && board[0][2] == 0) {
			board[2][2] = 2;
			return true;

		} else if (board[1][0] == 1 && board[2][1] == 1 && board[2][0] == 0 && board[0][0] == 0 && board[2][2] == 0) {
			board[2][0] = 2;
			return true;

		} else if (board[2][0] == 1 && board[0][2] == 1 && board[1][0] == 0 && board[0][0] == 0 && board[0][1] == 0) {
			board[1][0] = 2;
			return true;

		} else if (board[0][0] == 1 && board[2][2] == 1 && board[1][2] == 0 && board[0][1] == 0 && board[0][2] == 0) {
			board[1][2] = 2;
			return true;

		} else if (board[0][0] == 0 && board[1][1] == 1 && board[0][2] == 1 && board[0][1] == 0 && board[1][0] == 0) {
			board[0][0] = 2;
			return true;
		}

		return false;
	}

	public boolean clc() {

		if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
			return true;
		} else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
			return true;
		} else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
			return true;

		} else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
			return true;
		} else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
			return true;

		} else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
			return true;
		} else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
			return true;
		}
		return false;
	}

	public boolean cwc() {
		if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
			return true;
		} else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
			return true;
		} else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
			return true;

		} else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
			return true;
		} else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
			return true;
		} else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
			return true;

		} else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
			return true;
		} else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) {
			return true;
		}
		return false;
	}

	public boolean dc() {
		if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 && board[1][0] != 0 && board[1][1] != 0
				&& board[1][2] != 0 && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0) {
			return true;
		}
		return false;
	}

	public boolean rc() {
		if (board[1][0] == 1 && board[1][1] == 2 && board[1][2] == 1 && board[0][0] == 0) {
			board[0][0] = 2;
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 2 && board[2][1] == 1 && board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[0][0] == 2 && board[0][1] == 0 && board[0][2] == 1 && board[1][0] == 1 && board[1][1] == 1
				&& board[1][2] == 2 && board[2][0] == 2 && board[2][1] == 0 && board[2][2] == 1) {
			board[0][1] = 2;
			return true;
		} else if (board[0][0] == 2 && board[0][1] == 1 && board[0][2] == 2 && board[1][0] == 0 && board[1][1] == 1
				&& board[1][2] == 0 && board[2][0] == 1 && board[2][1] == 2 && board[2][2] == 1) {
			board[1][2] = 2;
			return true;
		} else if (board[0][0] == 1 && board[0][1] == 2 && board[0][2] == 1 && board[1][0] == 0 && board[1][1] == 1
				&& board[1][2] == 0 && board[2][0] == 2 && board[2][1] == 1 && board[2][2] == 2) {
			board[1][0] = 2;
			return true;
		} else if (board[0][0] == 1 && board[0][1] == 0 && board[0][2] == 2 && board[1][0] == 2 && board[1][1] == 1
				&& board[1][2] == 1 && board[2][0] == 1 && board[2][1] == 0 && board[2][2] == 2) {
			board[2][1] = 2;
			return true;
		}
		return false;
	}

	public boolean fc() {
		if (board[0][0] == 0) {
			board[0][0] = 2;
			return true;
		} else if (board[0][1] == 0) {
			board[0][1] = 2;
			return true;
		} else if (board[0][2] == 0) {
			board[0][2] = 2;
			return true;
		} else if (board[1][0] == 0) {
			board[1][0] = 2;
			return true;
		} else if (board[1][1] == 0) {
			board[1][1] = 2;
			return true;
		} else if (board[1][2] == 0) {
			board[1][2] = 2;
			return true;
		} else if (board[2][0] == 0) {
			board[2][0] = 2;
			return true;
		} else if (board[2][1] == 0) {
			board[2][1] = 2;
			return true;
		} else if (board[2][2] == 0) {
			board[2][2] = 2;
			return true;
		}
		return false;
	}

	public void cb() {
		board[0][0] = 0;
		board[0][1] = 0;
		board[0][2] = 0;
		board[1][0] = 0;
		board[1][1] = 0;
		board[1][2] = 0;
		board[2][0] = 0;
		board[2][1] = 0;
		board[2][2] = 0;
		attempt = attempt + 1;
		repaint();
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {
		GUITicTacToe gttt = new GUITicTacToe();
		boolean space = false;
		do {
			if (gttt.cwc() == false && gttt.clc() == false && gttt.dc() == false)
				if (e.getX() >= 339 && e.getX() <= 429 && e.getY() >= 138 && e.getY() <= 228 && board[0][0] == 0) {
					board[0][0] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 443 && e.getX() <= 532 && e.getY() >= 131 && e.getY() <= 229
						&& board[0][1] == 0) {
					board[0][1] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 542 && e.getX() <= 632 && e.getY() >= 131 && e.getY() <= 228
						&& board[0][2] == 0) {
					board[0][2] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 335 && e.getX() <= 432 && e.getY() >= 241 && e.getY() <= 330
						&& board[1][0] == 0) {
					board[1][0] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 443 && e.getX() <= 532 && e.getY() >= 240 && e.getY() <= 330
						&& board[1][1] == 0) {
					board[1][1] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 543 && e.getX() <= 631 && e.getY() >= 240 && e.getY() <= 330
						&& board[1][2] == 0) {
					board[1][2] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 334 && e.getX() <= 431 && e.getY() >= 341 && e.getY() <= 428
						&& board[2][0] == 0) {
					board[2][0] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 443 && e.getX() <= 532 && e.getY() >= 340 && e.getY() <= 428
						&& board[2][1] == 0) {
					board[2][1] = 1;
					space = true;
					repaint();
				} else if (e.getX() >= 543 && e.getX() <= 628 && e.getY() >= 341 && e.getY() <= 429
						&& board[2][2] == 0) {
					board[2][2] = 1;
					space = true;
					repaint();
				}
		} while (space == false);

		if (board[0][0] + board[0][1] + board[0][2] + board[1][0] + board[1][1] + board[1][2] + board[2][0]
				+ board[2][1] + board[2][2] == 1) {
			gttt.cft();
			repaint();
		} else if (gttt.cwc() == false && gttt.clc() == false && gttt.dc() == false) {
			if (gttt.pwc() == false) {
				if (gttt.owc() == false) {
					if (gttt.swc() == false) {
						if (gttt.rc() == false) {
							gttt.fc();
						}
					}
				}
			}
			repaint();
		}

	}

	public void actionPerformed(ActionEvent e) {
		GUITicTacToe gttt = new GUITicTacToe();
		gttt.cb();
		repaint();
	}

}
