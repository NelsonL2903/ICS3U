package ccatictactoe;

import java.util.Random;

public class RandomUserInput {

	public void randui(int[][] board) {

		Random answer = new Random();
		int low = 0;
		int high = 3;
		int randrow;
		int randcolumn;
		boolean space = false;
		do {
			randrow = answer.nextInt(high - low) + low;
			randcolumn = answer.nextInt(high - low) + low;
			if (board[randrow][randcolumn] == 0) {
				board[randrow][randcolumn] = 1;
				space = true;
			}
		} while (space == false);

	}

}
