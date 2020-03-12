package ccatictactoe;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandQuickCheck {

	static Scanner keyboard = new Scanner(System.in);
	int[][] board = new int[3][3];

	public static void main(String[] args) {

		ArrayRandQuickCheck aqc = new ArrayRandQuickCheck();

		do {
			aqc.cb();

			aqc.pt();

			aqc.cft();

			do {
				aqc.pt();

				if (aqc.pwc() == false) {
					if (aqc.owc() == false) {
						if (aqc.swc() == false) {
							if (aqc.rc() == false) {
								aqc.fc();
							}
						}
					}
				}
			} while (aqc.wc() == false && aqc.dc() == false);

		} while (true);

	}

	public void pt() {
		boolean cc = false;
		do {
			Random answerR = new Random();
			int lowR = 0;
			int highR = 3;
			int row;
			row = answerR.nextInt(highR - lowR) + lowR;
			Random answerC = new Random();
			int lowC = 0;
			int highC = 3;
			int column;
			column = answerC.nextInt(highC - lowC) + lowC;
			if (board[row][column] == 0) {
				board[row][column] = 1;
				cc = true;
			} else {
				cc = false;
			}

		} while (cc == false);

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
			System.out.println("You have won!");
			return true;
		} else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
			System.out.println("You have won!");
			return true;
		} else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
			System.out.println("You have won!");
			return true;

		} else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
			System.out.println("You have won!");
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
			System.out.println("You have won!");
			return true;
		} else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
			System.out.println("You have won!");
			return true;

		} else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
			System.out.println("You have won!");
			return true;
		} else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
			System.out.println("You have won!");
			return true;

		} else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
			System.out.println("Computer has won!");
			return true;
		} else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
			System.out.println("Computer has won!");
			return true;
		} else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
			System.out.println("Computer has won!");
			return true;

		} else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
			System.out.println("Computer has won!");
			return true;
		} else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
			System.out.println("Computer has won!");
			return true;
		} else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
			System.out.println("Computer has won!");
			return true;

		} else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
			System.out.println("Computer has won!");
			return true;
		} else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) {
			System.out.println("Computer has won!");
			return true;
		}
		return false;
	}

	public boolean dc() {
		if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 && board[1][0] != 0 && board[1][1] != 0
				&& board[1][2] != 0 && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0) {
			System.out.println("It's a draw! Good game!");
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

}
