package ccatictactoe;

import java.util.Random;
import java.util.Scanner;

public class ArrayTTTCheck {

	static Scanner keyboard = new Scanner(System.in);
	int[][] board = new int[3][3];

	public static void main(String[] args) {
		ArrayTTTCheck atttc = new ArrayTTTCheck();

		do {
			atttc.cb();

			atttc.printboard();
			atttc.pt();

			atttc.cft();

			do {
				atttc.printboard();
				atttc.pt();

				if (atttc.pwc() == false) {
					if (atttc.owc() == false) {
						if (atttc.swc() == false) {
							if (atttc.rc() == false) {
								atttc.fc();
							}
						}
					}
				}
			} while (atttc.wc() == false && atttc.dc() == false);

			atttc.printboard();

			System.out.println("Would you like to play again?");

		} while (true);

	}

	public void printboard() {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

	public void pt() {
		boolean cc = false;
		do {
			System.out.println("Where would you like to play? Please enter the column number, 1, 2, or 3");
			Random answerR = new Random();
			int lowR = 0;
			int highR = 2;
			int row;
			row = answerR.nextInt(highR - lowR) + lowR;
			System.out.println("Please enter the row number, 1, 2 or 3");
			Random answerC = new Random();
			int lowC = 0;
			int highC = 2;
			int column;
			column = answerC.nextInt(highC - lowC) + lowC;
			if (board[row][column] == 0) {
				board[row][column] = 1;
				cc = true;
			} else {
				System.out.println("Please input another coordinate, and make sure it is blank");
				cc = false;
			}

		} while (cc = false);

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
			board[0][0] = 1;
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 2 && board[2][1] == 1 && board[0][2] == 0) {
			board[0][2] = 1;
			return true;
		} else if (board[0][0] == 2 && board[0][1] == 0 && board[0][2] == 1 && board[1][0] == 1 && board[1][1] == 1
				&& board[1][2] == 2 && board[2][0] == 2 && board[2][1] == 0 && board[2][2] == 1) {
			board[0][1] = 1;
			return true;
		} else if (board[0][0] == 2 && board[0][1] == 1 && board[0][2] == 2 && board[1][0] == 0 && board[1][1] == 1
				&& board[1][2] == 0 && board[2][0] == 1 && board[2][1] == 2 && board[2][2] == 1) {
			board[1][2] = 1;
			return true;
		} else if (board[0][0] == 1 && board[0][1] == 2 && board[0][2] == 1 && board[1][0] == 0 && board[1][1] == 1
				&& board[1][2] == 0 && board[2][0] == 2 && board[2][1] == 1 && board[2][2] == 2) {
			board[1][0] = 1;
			return true;
		} else if (board[0][0] == 1 && board[0][1] == 0 && board[0][2] == 2 && board[1][0] == 2 && board[1][1] == 1
				&& board[1][2] == 1 && board[2][0] == 1 && board[2][1] == 0 && board[2][2] == 2) {
			board[2][1] = 1;
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
