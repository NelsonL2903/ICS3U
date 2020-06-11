package ccatictactoe;

import java.util.Scanner;

/*
 * gets input from the player on where they would like to play
 */
public class UserInput {

	Scanner keyboard = new Scanner(System.in);

	public void playerturn(int[][] board) {

		boolean cc = false;
		do {
			// gets input from the player
			System.out.println("Where would you like to play? Please enter the column number, 1, 2, or 3");
			int column = keyboard.nextInt() - 1;
			System.out.println("Please enter the row number, 1, 2 or 3");
			int row = keyboard.nextInt() - 1;
			if (row < 3 && row > -1 && column < 3 && column > -1) {
				// if square is blank, the player plays there
				if (board[row][column] == 0) {
					board[row][column] = 1;
					cc = true;
				} else {
					System.out.println("Please input another coordinate, and make sure it is blank");
					cc = false;
				}
			} else {
				System.out.println("Please input another coordinate, and make sure it is blank");
				cc = false;
			}
			// loops if the square is not blank, or the coordinates are not valid
		} while (cc == false);

	}

}