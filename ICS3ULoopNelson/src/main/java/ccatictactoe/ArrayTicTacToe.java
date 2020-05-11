package ccatictactoe;

import java.util.Scanner;

public class ArrayTicTacToe {

	static Scanner keyboard = new Scanner(System.in);
	static int[][] board = new int[3][3];

	public static void main(String[] args) {

		ArrayTicTacToe gameboard = new ArrayTicTacToe();
		UserInput pt = new UserInput();
		String answer;
		int attempt = 1;

		do {
			System.out.println("Attempts: " + attempt);
			gameboard.cb();

			gameboard.printboard();
			pt.playerturn(board);

			gameboard.cft();

			do {
				gameboard.printboard();
				pt.playerturn(board);

				if (gameboard.pwc() == false) {
					if (gameboard.owc() == false) {
						if (gameboard.swc() == false) {
							if (gameboard.rc() == false) {
								gameboard.fc();
							}
						}
					}
				}
			} while (gameboard.wc() == false && gameboard.dc() == false);
			attempt = attempt + 1;

			gameboard.printboard();

			System.out.println("Would you like to play again?");
			keyboard.nextLine();
			answer = keyboard.nextLine();

		} while (answer.equals("Yes") || answer.equals("yes") || answer.equals("YES") || answer.equals("y")
				|| answer.equals("Y"));

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
