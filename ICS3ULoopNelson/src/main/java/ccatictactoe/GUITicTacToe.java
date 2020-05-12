package ccatictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUITicTacToe extends JPanel implements MouseListener {

	static int[][] board = new int[3][3];

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

	}

	public static void main(String[] args) {

		GUITicTacToe gttt = new GUITicTacToe();
		gttt.cb();

		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gttt);
		frame.setSize(1000, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.addMouseListener(gttt);

		JLabel title = new JLabel("Nelson's Tic Tac Toe!", SwingConstants.CENTER);
		title.setPreferredSize(new Dimension(300, 100));
		title.setFont(new Font("Comic Sans", Font.BOLD, 25));
		frame.getContentPane().add(title, BorderLayout.NORTH);

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

	public boolean wc() {

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

		} else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
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
		board[0][0] = 1;
		repaint();
	}

}
