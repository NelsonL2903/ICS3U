package ccatictactoe;

public class EveryPossibilityEver {

	int tlcount = 0;
	int tmcount = 0;
	int trcount = 0;
	int mlcount = 0;
	int mmcount = 0;
	int mrcount = 0;
	int blcount = 0;
	int bmcount = 0;
	int brcount = 0;

	int tlcount2 = 0;
	int tmcount2 = 0;
	int trcount2 = 0;
	int mlcount2 = 0;
	int mmcount2 = 0;
	int mrcount2 = 0;
	int blcount2 = 0;
	int bmcount2 = 0;
	int brcount2 = 0;
	int[][] board;

	public EveryPossibilityEver(int[][] board) {
		this.board = board;
	}

	public void allgames() {

		EveryPossibilityEver epe = new EveryPossibilityEver();

		for (int overall = 0; overall < 945; ++overall) {
			if (board[0][0] == 0 && tlcount < 105) {
				board[0][0] = 1;
				tlcount = tlcount + 1;
				epe.turn2();
			} else if (board[0][1] == 0 && tmcount < 105) {
				board[0][1] = 1;
				tmcount = tmcount + 1;

			} else if (board[0][2] == 0 && trcount < 105) {
				board[0][2] = 1;
				trcount = trcount + 1;
			} else if (board[1][0] == 0 && mlcount < 105) {
				board[1][0] = 1;
				mlcount = mlcount + 1;
			} else if (board[1][1] == 0 && mmcount < 105) {
				board[1][1] = 1;
				mmcount = mmcount + 1;
			} else if (board[1][2] == 0 && mrcount < 105) {
				board[1][2] = 1;
				mrcount = mrcount + 1;
			} else if (board[2][0] == 0 && blcount < 105) {
				board[2][0] = 1;
				blcount = blcount + 1;
			} else if (board[2][1] == 0 && bmcount < 105) {
				board[2][1] = 1;
				bmcount = bmcount + 1;
			} else if (board[2][2] == 0 && brcount < 105) {
				board[2][2] = 1;
				brcount = brcount + 1;
			}
		}

	}

	public void turn2(int[][] board) {

		for (int turntwo = 0; turntwo < 105; ++turntwo) {

			if (board[0][0] == 0 && tlcount2 < 15) {
				board[0][0] = 1;
				tlcount2 = tlcount2 + 1;
			} else if (board[0][1] == 0 && tmcount2 < 15) {
				board[0][1] = 1;
				tmcount2 = tmcount2 + 1;
			} else if (board[0][2] == 0 && trcount2 < 15) {
				board[0][2] = 1;
				trcount2 = trcount2 + 1;
			} else if (board[1][0] == 0 && mlcount2 < 15) {
				board[1][0] = 1;
				mlcount2 = mlcount2 + 1;
			} else if (board[1][1] == 0 && mmcount2 < 15) {
				board[1][1] = 1;
				mmcount2 = mmcount2 + 1;
			} else if (board[1][2] == 0 && mrcount2 < 15) {
				board[1][2] = 1;
				mrcount2 = mrcount2 + 1;
			} else if (board[2][0] == 0 && blcount2 < 15) {
				board[2][0] = 1;
				blcount2 = blcount2 + 1;
			} else if (board[2][1] == 0 && bmcount2 < 15) {
				board[2][1] = 1;
				bmcount2 = bmcount2 + 1;
			} else if (board[2][2] == 0 && brcount2 < 15) {
				board[2][2] = 1;
				brcount2 = brcount2 + 1;
			}

		}
	}

}
