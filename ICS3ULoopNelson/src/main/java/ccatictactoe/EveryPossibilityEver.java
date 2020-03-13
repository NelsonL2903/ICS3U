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

	int tlcount3 = 0;
	int tmcount3 = 0;
	int trcount3 = 0;
	int mlcount3 = 0;
	int mmcount3 = 0;
	int mrcount3 = 0;
	int blcount3 = 0;
	int bmcount3 = 0;
	int brcount3 = 0;

	int tlcount4 = 0;
	int tmcount4 = 0;
	int trcount4 = 0;
	int mlcount4 = 0;
	int mmcount4 = 0;
	int mrcount4 = 0;
	int blcount4 = 0;
	int bmcount4 = 0;
	int brcount4 = 0;

	int overall = 0;

	int[][] board;

	public EveryPossibilityEver(int[][] board) {
		this.board = board;

	}

	public void allgames() {

		if (board[0][0] == 0 && tlcount < 105 && wc() == false && dc() == false) {
			board[0][0] = 1;
			tlcount = tlcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[0][1] == 0 && tmcount < 105 && wc() == false && dc() == false) {
			board[0][1] = 1;
			tmcount = tmcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[0][2] == 0 && trcount < 105 && wc() == false && dc() == false) {
			board[0][2] = 1;
			trcount = trcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[1][0] == 0 && mlcount < 105 && wc() == false && dc() == false) {
			board[1][0] = 1;
			mlcount = mlcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[1][1] == 0 && mmcount < 105 && wc() == false && dc() == false) {
			board[1][1] = 1;
			mmcount = mmcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[1][2] == 0 && mrcount < 105 && wc() == false && dc() == false) {
			board[1][2] = 1;
			mrcount = mrcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[2][0] == 0 && blcount < 105 && wc() == false && dc() == false) {
			board[2][0] = 1;
			blcount = blcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[2][1] == 0 && bmcount < 105 && wc() == false && dc() == false) {
			board[2][1] = 1;
			bmcount = bmcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		} else if (board[2][2] == 0 && brcount < 105 && wc() == false && dc() == false) {
			board[2][2] = 1;
			brcount = brcount + 1;
			if (wc() == true || dc() == true) {
				allgames();
			}
		}
	}

	public void turn2() {

		if (board[0][0] == 0 && tlcount2 < 15 && wc() == false && dc() == false) {
			board[0][0] = 1;
			tlcount2 = tlcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[0][1] == 0 && tmcount2 < 15 && wc() == false && dc() == false) {
			board[0][1] = 1;
			tmcount2 = tmcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[0][2] == 0 && trcount2 < 15 && wc() == false && dc() == false) {
			board[0][2] = 1;
			trcount2 = trcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[1][0] == 0 && mlcount2 < 15 && wc() == false && dc() == false) {
			board[1][0] = 1;
			mlcount2 = mlcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[1][1] == 0 && mmcount2 < 15 && wc() == false && dc() == false) {
			board[1][1] = 1;
			mmcount2 = mmcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[1][2] == 0 && mrcount2 < 15 && wc() == false && dc() == false) {
			board[1][2] = 1;
			mrcount2 = mrcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[2][0] == 0 && blcount2 < 15 && wc() == false && dc() == false) {
			board[2][0] = 1;
			blcount2 = blcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[2][1] == 0 && bmcount2 < 15 && wc() == false && dc() == false) {
			board[2][1] = 1;
			bmcount2 = bmcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		} else if (board[2][2] == 0 && brcount2 < 15 && wc() == false && dc() == false) {
			board[2][2] = 1;
			brcount2 = brcount2 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn3();
			}
		}

	}

	public void turn3() {

		if (board[0][0] == 0 && tlcount3 < 3 && wc() == false && dc() == false) {
			board[0][0] = 1;
			tlcount3 = tlcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[0][1] == 0 && tmcount3 < 3 && wc() == false && dc() == false) {
			board[0][1] = 1;
			tmcount3 = tmcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[0][2] == 0 && trcount3 < 3 && wc() == false && dc() == false) {
			board[0][2] = 1;
			trcount3 = trcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[1][0] == 0 && mlcount3 < 3 && wc() == false && dc() == false) {
			board[1][0] = 1;
			mlcount3 = mlcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[1][1] == 0 && mmcount3 < 3 && wc() == false && dc() == false) {
			board[1][1] = 1;
			mmcount3 = mmcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[1][2] == 0 && mrcount3 < 3 && wc() == false && dc() == false) {
			board[1][2] = 1;
			mrcount3 = mrcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[2][0] == 0 && blcount3 < 3 && wc() == false && dc() == false) {
			board[2][0] = 1;
			blcount3 = blcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[2][1] == 0 && bmcount3 < 3 && wc() == false && dc() == false) {
			board[2][1] = 1;
			bmcount3 = bmcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		} else if (board[2][2] == 0 && brcount3 < 3 && wc() == false && dc() == false) {
			board[2][2] = 1;
			brcount3 = brcount3 + 1;
			if (wc() == true || dc() == true) {
				allgames();
			} else {
				turn4();
			}
		}

	}

	public void turn4() {

		if (board[0][0] == 0 && tlcount4 < 1 && wc() == false && dc() == false) {
			board[0][0] = 1;
			tlcount4 = tlcount4 + 1;
		} else if (board[0][1] == 0 && tmcount4 < 1 && wc() == false && dc() == false) {
			board[0][1] = 1;
			tmcount4 = tmcount4 + 1;
		} else if (board[0][2] == 0 && trcount4 < 1 && wc() == false && dc() == false) {
			board[0][2] = 1;
			trcount4 = trcount4 + 1;
		} else if (board[1][0] == 0 && mlcount4 < 1 && wc() == false && dc() == false) {
			board[1][0] = 1;
			mlcount4 = mlcount4 + 1;
		} else if (board[1][1] == 0 && mmcount4 < 1 && wc() == false && dc() == false) {
			board[1][1] = 1;
			mmcount4 = mmcount4 + 1;
		} else if (board[1][2] == 0 && mrcount4 < 1 && wc() == false && dc() == false) {
			board[1][2] = 1;
			mrcount4 = mrcount4 + 1;
		} else if (board[2][0] == 0 && blcount4 < 1 && wc() == false && dc() == false) {
			board[2][0] = 1;
			blcount4 = blcount4 + 1;
		} else if (board[2][1] == 0 && bmcount4 < 1 && wc() == false && dc() == false) {
			board[2][1] = 1;
			bmcount4 = bmcount4 + 1;
		} else if (board[2][2] == 0 && brcount4 < 1 && wc() == false && dc() == false) {
			board[2][2] = 1;
			brcount4 = brcount4 + 1;
		}

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

}
