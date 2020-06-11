package ccatictactoe;

import java.util.Random;

/*
 * chooses a random square for the user to play
 */
public class RandomUserInput {

	public void randui(int[][] board) {

		Random answer = new Random();
		int low = 0;
		int high = 3;
		int randrow;
		int randcolumn;
		boolean space = false;
		do {
			// chooses a random spot
			randrow = answer.nextInt(high - low) + low;
			randcolumn = answer.nextInt(high - low) + low;
			// if that spot is blank then the user plays there, if not the code is looped
			// and a new spot is found
			if (board[randrow][randcolumn] == 0) {
				board[randrow][randcolumn] = 1;
				space = true;
			}
		} while (space == false);

	}

}
