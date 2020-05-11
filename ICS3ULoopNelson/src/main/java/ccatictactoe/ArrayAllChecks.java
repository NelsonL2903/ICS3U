package ccatictactoe;

public class ArrayAllChecks {

	static int[][] board = new int[3][3];

	public static void main(String[] args) {

		ArrayAllChecks AAC = new ArrayAllChecks();
		RandomUserInput RUI = new RandomUserInput();
		int[] array = new int[131];

		AAC.initarray(array);

		do {
			AAC.cb();

			RUI.randui(board);

			AAC.cft();

			do {
				RUI.randui(board);

				if (AAC.pwc() == false) {
					if (AAC.owc() == false) {
						if (AAC.swc() == false) {
							if (AAC.rc() == false) {
								AAC.fc();
							}
						}
					}
				}
			} while (AAC.cwc() == false && AAC.clc() == false && AAC.dc() == false);

			int outcome;
			outcome = (board[2][2] * 1) + (board[2][1] * 10) + (board[2][0] * 100) + (board[1][2] * 1000)
					+ (board[1][1] * 10000) + (board[1][0] * 100000) + (board[0][2] * 1000000)
					+ (board[0][1] * 10000000) + (board[0][0] * 100000000);

			if (AAC.search(array, outcome) == -1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == 0) {
						array[i] = outcome;
						System.out.println("Outcome " + (i + 1) + ": " + array[i]);
						break;
					}
				}
				if (AAC.clc()) {
					System.out.println("Computer has lost");
				} else if (AAC.cwc()) {
					System.out.println("Computer has won");
				} else if (AAC.dc()) {
					System.out.println("It's a draw");
				}
			}
		} while (true);
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
	}

	public void initarray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = 0;
		}
	}

	public int search(int[] array, int outcome) {
		int sc = -1;
		for (int i = 0; i < array.length; ++i) {
			if (outcome == array[i]) {
				sc = 1;
				break;
			} else {
				sc = -1;
			}

		}
		return sc;
	}

}
