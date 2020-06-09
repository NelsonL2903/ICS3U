package ccatictactoe;

import java.util.Random;
import java.util.Scanner;

//creates random outcomes of this tic tac toe game and prints out a statement declaring the result of the 
//game to ensure that there are no outcomes where the computer would lose. This class also prints out the board 
//after each turn so if a bug is found it easier to locate and fix.
public class TicTacToeCheck {

	// nine variables represent the nine squares of the board
	String TL = " ";
	String TM = " ";
	String TR = " ";
	String ML = " ";
	String MM = " ";
	String MR = " ";
	String BL = " ";
	String BM = " ";
	String BR = " ";

	static Scanner keyboard = new Scanner(System.in);
	Random answer = new Random();

	public static void main(String[] args) {
		TicTacToeCheck tttc = new TicTacToeCheck();

		do {
			// clears the game board
			tttc.cb();
			// selects a random position for the player to play
			tttc.pt();

			// the computer's first turn
			tttc.cft();

			// this is looped to repeat the process of finding new outcomes
			do {
				tttc.pt();

				// the computer's Personal Win Check. Checks to see if the computer is in a
				// situation where it may win the game next turn.
				if (tttc.pwc() == false) {
					// The computer's Opponent Win Check. Checks to see if the opponent is in a
					// position where they may win next turn, and if so prevent them from doing so
					if (tttc.owc() == false) {
						// The computer's Situational Win Check. Checks to see if the opponent is in a
						// situation where they could set themselves up to win in two turns
						if (tttc.swc() == false) {
							// the computer's Random Check. Checks a few specific but random scenarios where
							// the computer may lose
							if (tttc.rc() == false) {
								// Computer's Final Check. if no other checks run true, plays its turn in a
								// random spot
								tttc.fc();
							}
						}
					}
				}
				// Continues to loop the player's and computer's turns as long as the game has
				// not finished
			} while (tttc.wc() == false && tttc.dc() == false);

			// prints out the game board
			tttc.pb();

		} while (true);

	}

	// selects a random position for the player to play
	public void pt() {

		// prints the board
		System.out.println("    ");
		System.out.print(TL + " | ");
		System.out.print(TM + " | ");
		System.out.println(TR);
		System.out.println("---------");
		System.out.print(ML + " | ");
		System.out.print(MM + " | ");
		System.out.println(MR);
		System.out.println("---------");
		System.out.print(BL + " | ");
		System.out.print(BM + " | ");
		System.out.println(BR);
		// determines a random square to play
		boolean uc = false;
		do {

			int low = 1;
			int high = 10;
			int rand;
			rand = answer.nextInt(high - low) + low;
			if (rand == 1 && TL.equals(" ")) {
				TL = "X";
				uc = true;
			} else if (rand == 2 && TM.equals(" ")) {
				TM = "X";
				uc = true;
			} else if (rand == 3 && TR.equals(" ")) {
				TR = "X";
				uc = true;
			} else if (rand == 4 && ML.equals(" ")) {
				ML = "X";
				uc = true;
			} else if (rand == 5 && MM.equals(" ")) {
				MM = "X";
				uc = true;
			} else if (rand == 6 && MR.equals(" ")) {
				MR = "X";
				uc = true;
			} else if (rand == 7 && BL.equals(" ")) {
				BL = "X";
				uc = true;
			} else if (rand == 8 && BM.equals(" ")) {
				BM = "X";
				uc = true;
			} else if (rand == 9 && BR.equals(" ")) {
				BR = "X";
				uc = true;
			}

			// if the position is not blank then it will loop and find a new position
		} while (uc == false);

	}

	// the computer's first turn
	public void cft() {
		if (TL.equals("X") || TR.equals("X") || BL.equals("X") || BR.equals("X")) {
			MM = "O";
		} else if (TM.equals("X") || ML.equals("X") || MR.equals("X") || BM.equals("X")) {
			MM = "O";
		} else if (MM.equals("X")) {
			BL = "O";
		}

	}

	// the computer's Personal Win Check. Checks to see if the computer is in a
	// situation where it may win the game next turn.
	public boolean pwc() {
		if (TL.equals("O") && ML.equals("O") && BL.equals(" ")) {
			BL = "O";
			return true;
		} else if (TL.equals(" ") && ML.equals("O") && BL.equals("O")) {
			TL = "O";
			return true;
		} else if (TL.equals("O") && ML.equals(" ") && BL.equals("O")) {
			ML = "O";
			return true;

		} else if (TM.equals("O") && MM.equals("O") && BM.equals(" ")) {
			BM = "O";
			return true;
		} else if (TM.equals(" ") && MM.equals("O") && BM.equals("O")) {
			TM = "O";
			return true;
		} else if (TM.equals("O") && MM.equals(" ") && BM.equals("O")) {
			MM = "O";
			return true;

		} else if (TR.equals("O") && MR.equals("O") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (TR.equals(" ") && MR.equals("O") && BR.equals("O")) {
			TR = "O";
			return true;
		} else if (TR.equals("O") && MR.equals(" ") && BR.equals("O")) {
			MR = "O";
			return true;

		} else if (TL.equals("O") && TM.equals("O") && TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (TL.equals(" ") && TM.equals("O") && TR.equals("O")) {
			TL = "O";
			return true;
		} else if (TL.equals("O") && TM.equals(" ") && TR.equals("O")) {
			TM = "O";
			return true;

		} else if (ML.equals("O") && MM.equals("O") && MR.equals(" ")) {
			MR = "O";
			return true;
		} else if (ML.equals(" ") && MM.equals("O") && MR.equals("O")) {
			ML = "O";
			return true;
		} else if (ML.equals("O") && MM.equals(" ") && MR.equals("O")) {
			MM = "O";
			return true;

		} else if (BL.equals("O") && BM.equals("O") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (BL.equals(" ") && BM.equals("O") && BR.equals("O")) {
			BL = "O";
			return true;
		} else if (BL.equals("O") && BM.equals(" ") && BR.equals("O")) {
			BM = "O";
			return true;

		} else if (TL.equals("O") && MM.equals("O") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (TL.equals(" ") && MM.equals("O") && BR.equals("O")) {
			TL = "O";
			return true;
		} else if (TL.equals("O") && MM.equals(" ") && BR.equals("O")) {
			MM = "O";
			return true;

		} else if (BL.equals("O") && MM.equals("O") && TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (BL.equals(" ") && MM.equals("O") && TR.equals("O")) {
			BL = "O";
			return true;
		} else if (BL.equals("O") && MM.equals(" ") && TR.equals("O")) {
			MM = "O";
			return true;
		}

		return false;
	}

	// The computer's Opponent Win Check. Checks to see if the opponent is in a
	// position where they may win next turn, and if so prevent them from doing so
	public boolean owc() {
		if (TL.equals("X") && ML.equals("X") && BL.equals(" ")) {
			BL = "O";
			return true;
		} else if (TL.equals(" ") && ML.equals("X") && BL.equals("X")) {
			TL = "O";
			return true;
		} else if (TL.equals("X") && ML.equals(" ") && BL.equals("X")) {
			ML = "O";
			return true;

		} else if (TM.equals("X") && MM.equals("X") && BM.equals(" ")) {
			BM = "O";
			return true;
		} else if (TM.equals(" ") && MM.equals("X") && BM.equals("X")) {
			TM = "O";
			return true;
		} else if (TM.equals("X") && MM.equals(" ") && BM.equals("X")) {
			MM = "O";
			return true;

		} else if (TR.equals("X") && MR.equals("X") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (TR.equals(" ") && MR.equals("X") && BR.equals("X")) {
			TR = "O";
			return true;
		} else if (TR.equals("X") && MR.equals(" ") && BR.equals("X")) {
			MR = "O";
			return true;

		} else if (TL.equals("X") && TM.equals("X") && TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (TL.equals(" ") && TM.equals("X") && TR.equals("X")) {
			TL = "O";
			return true;
		} else if (TL.equals("X") && TM.equals(" ") && TR.equals("X")) {
			TM = "O";
			return true;

		} else if (ML.equals("X") && MM.equals("X") && MR.equals(" ")) {
			MR = "O";
			return true;
		} else if (ML.equals(" ") && MM.equals("X") && MR.equals("X")) {
			ML = "O";
			return true;
		} else if (ML.equals("X") && MM.equals(" ") && MR.equals("X")) {
			MM = "O";
			return true;

		} else if (BL.equals("X") && BM.equals("X") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (BL.equals(" ") && BM.equals("X") && BR.equals("X")) {
			BL = "O";
			return true;
		} else if (BL.equals("X") && BM.equals(" ") && BR.equals("X")) {
			BM = "O";
			return true;

		} else if (TL.equals("X") && MM.equals("X") && BR.equals(" ")) {
			BR = "O";
			return true;
		} else if (TL.equals(" ") && MM.equals("X") && BR.equals("X")) {
			TL = "O";
			return true;
		} else if (TL.equals("X") && MM.equals(" ") && BR.equals("X")) {
			MM = "O";
			return true;

		} else if (BL.equals("X") && MM.equals("X") && TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (BL.equals(" ") && MM.equals("X") && TR.equals("X")) {
			BL = "O";
			return true;
		} else if (BL.equals("X") && MM.equals(" ") && TR.equals("X")) {
			MM = "O";
			return true;
		}

		return false;
	}

	// The computer's Situational Win Check. Checks to see if the opponent is in a
	// situation where they could set themselves up to win in two turns
	public boolean swc() {
		if (TM.equals("X") && BL.equals("X") && TL.equals(" ") && TR.equals(" ") && ML.equals(" ")) {
			TL = "O";
			return true;

		} else if (TL.equals("X") && MR.equals("X") && TR.equals(" ") && TM.equals(" ") && BR.equals(" ")) {
			TR = "O";
			return true;

		} else if (TR.equals("X") && BM.equals("X") && BR.equals(" ") && MR.equals(" ") && BL.equals(" ")) {
			BR = "O";
			return true;

		} else if (ML.equals("X") && BR.equals("X") && BL.equals(" ") && TL.equals(" ") && BM.equals(" ")) {
			BL = "O";
			return true;

		} else if (BL.equals("X") && TR.equals("X") && MR.equals(" ") && BM.equals(" ") && BR.equals(" ")) {
			MR = "O";
			return true;

		} else if (TL.equals("X") && ML.equals(" ") && BR.equals("X") && BM.equals(" ") && BL.equals(" ")) {
			ML = "O";
			return true;

		} else if (BL.equals("X") && MR.equals("X") && BR.equals(" ") && BM.equals(" ") && TR.equals(" ")) {
			BR = "O";
			return true;

		} else if (TL.equals("X") && BM.equals("X") && BL.equals(" ") && ML.equals(" ") && BR.equals(" ")) {
			BL = "O";
			return true;

		} else if (ML.equals("X") && TR.equals("X") && TL.equals(" ") && TM.equals(" ") && BL.equals(" ")) {
			TL = "O";
			return true;

		} else if (TM.equals("X") && BR.equals("X") && TR.equals(" ") && TL.equals(" ") && MR.equals(" ")) {
			TR = "O";
			return true;

		} else if (ML.equals("X") && TM.equals("X") && TL.equals(" ") && BL.equals(" ") && TR.equals(" ")) {
			TL = "O";
			return true;

		} else if (TM.equals("X") && MR.equals("X") && TR.equals(" ") && TL.equals(" ") && BR.equals(" ")) {
			TR = "O";
			return true;

		} else if (BM.equals("X") && MR.equals("X") && BR.equals(" ") && BL.equals(" ") && TR.equals(" ")) {
			BR = "O";
			return true;

		} else if (ML.equals("X") && BM.equals("X") && BL.equals(" ") && TL.equals(" ") && BR.equals(" ")) {
			BL = "O";
			return true;

		} else if (BL.equals("X") && TR.equals("X") && ML.equals(" ") && TL.equals(" ") && TM.equals(" ")) {
			ML = "O";
			return true;

		} else if (TL.equals("X") && BR.equals("X") && MR.equals(" ") && TM.equals(" ") && TR.equals(" ")) {
			MR = "O";
			return true;

		} else if (TL.equals(" ") && MM.equals("X") && TR.equals("X") && TM.equals(" ") && ML.equals(" ")) {
			TL = "O";
			return true;
		}

		return false;
	}

	// Win Check. checks to see if the computer is in a position to win next turn
	// and if so, wins.
	public boolean wc() {
		if (TL.equals("X") && TM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");
			return true;
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("X")) {
			System.out.println("You have won!");
			return true;
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");
			return true;

		} else if (TL.equals("X") && ML.equals("X") && BL.equals("X")) {
			System.out.println("You have won!");
			return true;
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("X")) {
			System.out.println("You have won!");
			return true;
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");
			return true;

		} else if (TL.equals("X") && MM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");
			return true;
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");
			return true;

		} else if (TL.equals("O") && TM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");
			return true;

		} else if (TL.equals("O") && ML.equals("O") && BL.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");
			return true;

		} else if (TL.equals("O") && MM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
			return true;
		}
		return false;
	}

	// Draw Check. checks to see if game has ended in a draw
	public boolean dc() {
		if (!TL.equals(" ") && !TM.equals(" ") && !TR.equals(" ") && !ML.equals(" ") && !MM.equals(" ")
				&& !MR.equals(" ") && !BL.equals(" ") && !BM.equals(" ") && !BR.equals(" ")) {
			System.out.println("It's a draw! Good game!");
			return true;
		}
		return false;
	}

	// the computer's Random Check. Checks a few specific but random scenarios where
	// the computer may lose
	public boolean rc() {
		if (ML.equals("X") && MM.equals("O") && MR.equals("X") && TL.equals(" ")) {
			TL = "O";
			return true;
		} else if (TM.equals("X") && MM.equals("O") && BM.equals("X") && TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (TL.equals("O") && TM.equals(" ") && TR.equals("X") && ML.equals("X") && MM.equals("X")
				&& MR.equals("O") && BL.equals("O") && BM.equals(" ") && BR.equals("X")) {
			TM = "O";
			return true;
		} else if (TL.equals("O") && TM.equals("X") && TR.equals("O") && ML.equals(" ") && MM.equals("X")
				&& MR.equals(" ") && BL.equals("X") && BM.equals("O") && BR.equals("X")) {
			MR = "O";
			return true;
		} else if (TL.equals("X") && TM.equals("O") && TR.equals("X") && ML.equals(" ") && MM.equals("X")
				&& MR.equals(" ") && BL.equals("O") && BM.equals("X") && BR.equals("O")) {
			ML = "O";
			return true;
		} else if (TL.equals("X") && TM.equals(" ") && TR.equals("O") && ML.equals("O") && MM.equals("X")
				&& MR.equals("X") && BL.equals("X") && BM.equals(" ") && BR.equals("O")) {
			BM = "O";
			return true;
		}

		return false;
	}

	// prints out the game board
	public void pb() {
		System.out.print(TL + " | ");
		System.out.print(TM + " | ");
		System.out.println(TR);
		System.out.println("---------");
		System.out.print(ML + " | ");
		System.out.print(MM + " | ");
		System.out.println(MR);
		System.out.println("---------");
		System.out.print(BL + " | ");
		System.out.print(BM + " | ");
		System.out.println(BR);
	}

	// clears the game board and sets all squares to blank
	public void cb() {
		TL = " ";
		TM = " ";
		TR = " ";
		ML = " ";
		MM = " ";
		MR = " ";
		BL = " ";
		BM = " ";
		BR = " ";
	}

	// Computer's Final Check. if no other checks run true, plays its turn in a
	// random spot
	public boolean fc() {
		if (TL.equals(" ")) {
			TL = "O";
			return true;
		} else if (TM.equals(" ")) {
			TM = "O";
			return true;
		} else if (TR.equals(" ")) {
			TR = "O";
			return true;
		} else if (ML.equals(" ")) {
			ML = "O";
			return true;
		} else if (MM.equals(" ")) {
			MM = "O";
			return true;
		} else if (MR.equals(" ")) {
			MR = "O";
			return true;
		} else if (BL.equals(" ")) {
			BL = "O";
			return true;
		} else if (BM.equals(" ")) {
			BM = "O";
			return true;
		} else if (BR.equals(" ")) {
			BR = "O";
			return true;
		}
		return false;
	}

}
