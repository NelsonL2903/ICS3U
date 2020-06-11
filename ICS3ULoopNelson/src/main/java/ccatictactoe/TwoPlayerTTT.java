package ccatictactoe;

import java.util.Scanner;

/*
 * two player game of tic tac toe
 */
public class TwoPlayerTTT {

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

	public static void main(String[] args) {

		TwoPlayerTTT twop = new TwoPlayerTTT();
		String answer;

		do {
			// clears the board
			twop.cb();

			do {
				// if the game is not yet over, will run the method for player 1's turn
				if (twop.igwc() == false && twop.igdc() == false) {
					// gets input from player 1 on where they would like to play, and plays there
					twop.pt1();
				}

				// if the game is not yet over, will run the method for player 2's turn
				if (twop.igwc() == false && twop.igdc() == false) {
					// gets input from player 2 on where they would like to play, and plays there
					twop.pt2();
				}

				// continues to loop as long as the game is not yet over, allowing the players
				// to continue to take their turns
			} while (twop.wc() == false && twop.dc() == false);

			// prints out the game board
			twop.pb();

			// will start a new game if the player would like to
			System.out.println("Would you like to play again?");
			answer = keyboard.nextLine();
		} while (answer.equals("Yes") || answer.equals("yes") || answer.equals("YES") || answer.equals("y")
				|| answer.equals("Y"));

	}

	// Win Check. checks to see if someone has won the game, prints a statement
	// declaring the outcome
	public boolean wc() {
		if (TL.equals("X") && TM.equals("X") && TR.equals("X")) {
			System.out.println("Player One has won!");
			return true;
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("X")) {
			System.out.println("Player One has won!");
			return true;
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("X")) {
			System.out.println("Player One has won!");
			return true;

		} else if (TL.equals("X") && ML.equals("X") && BL.equals("X")) {
			System.out.println("Player One has won!");
			return true;
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("X")) {
			System.out.println("Player One has won!");
			return true;
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("X")) {
			System.out.println("Player One has won!");
			return true;

		} else if (TL.equals("X") && MM.equals("X") && BR.equals("X")) {
			System.out.println("Player One has won!");
			return true;
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("X")) {
			System.out.println("Player One has won!");
			return true;

		} else if (TL.equals("O") && TM.equals("O") && TR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;

		} else if (TL.equals("O") && ML.equals("O") && BL.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;

		} else if (TL.equals("O") && MM.equals("O") && BR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("O")) {
			System.out.println("Player Two has won!");
			return true;
		}
		return false;
	}

	// In Game Win Check, checks to see if anyone has won the game yet. Does not
	// print out a statement
	public boolean igwc() {
		if (TL.equals("X") && TM.equals("X") && TR.equals("X")) {
			return true;
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("X")) {
			return true;
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("X")) {
			return true;

		} else if (TL.equals("X") && ML.equals("X") && BL.equals("X")) {
			return true;
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("X")) {
			return true;
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("X")) {
			return true;

		} else if (TL.equals("X") && MM.equals("X") && BR.equals("X")) {
			return true;
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("X")) {
			return true;

		} else if (TL.equals("O") && TM.equals("O") && TR.equals("O")) {
			return true;
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("O")) {
			return true;
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("O")) {
			return true;

		} else if (TL.equals("O") && ML.equals("O") && BL.equals("O")) {
			return true;
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("O")) {
			return true;
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("O")) {
			return true;

		} else if (TL.equals("O") && MM.equals("O") && BR.equals("O")) {
			return true;
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("O")) {
			return true;
		}
		return false;
	}

	// Draw Check. checks to see if game has ended in a draw. Prints out a statement
	public boolean dc() {
		if (!TL.equals(" ") && !TM.equals(" ") && !TR.equals(" ") && !ML.equals(" ") && !MM.equals(" ")
				&& !MR.equals(" ") && !BL.equals(" ") && !BM.equals(" ") && !BR.equals(" ")) {
			System.out.println("It's a draw! Good game!");
			return true;
		}
		return false;
	}

	// In Game Draw Check. checks to see if game has ended in a draw. Does not print
	// out a statement
	public boolean igdc() {
		if (!TL.equals(" ") && !TM.equals(" ") && !TR.equals(" ") && !ML.equals(" ") && !MM.equals(" ")
				&& !MR.equals(" ") && !BL.equals(" ") && !BM.equals(" ") && !BR.equals(" ")) {
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

	// clears the game board
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

	// gets input from player 1 on where they would like to play, and plays there
	public void pt1() {

		// prints out the game board
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
		boolean uc = false;
		System.out.println("Player One, where would you like to play? For example: Top Left = TL");
		do {
			System.out.println("Please choose a blank square, or make sure your format is correct");
			String place1 = keyboard.nextLine();
			if (place1.equals("TL") && TL.equals(" ")) {
				TL = "X";
				uc = true;
			} else if (place1.equals("TM") && TM.equals(" ")) {
				TM = "X";
				uc = true;
			} else if (place1.equals("TR") && TR.equals(" ")) {
				TR = "X";
				uc = true;
			} else if (place1.equals("ML") && ML.equals(" ")) {
				ML = "X";
				uc = true;
			} else if (place1.equals("MM") && MM.equals(" ")) {
				MM = "X";
				uc = true;
			} else if (place1.equals("MR") && MR.equals(" ")) {
				MR = "X";
				uc = true;
			} else if (place1.equals("BL") && BL.equals(" ")) {
				BL = "X";
				uc = true;
			} else if (place1.equals("BM") && BM.equals(" ")) {
				BM = "X";
				uc = true;
			} else if (place1.equals("BR") && BR.equals(" ")) {
				BR = "X";
				uc = true;
			}
			// will loop if the chosen square is not blank, or if format is incorrect
		} while (uc == false);

	}

	// gets input from player 2 on where they would like to play, and plays there
	public void pt2() {

		// prints out the game board
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
		boolean uc = false;
		System.out.println("Player Two, where would you like to play? For example: Top Left = TL");
		do {
			System.out.println("Please choose a blank square, or make sure your format is correct");
			String place1 = keyboard.nextLine();
			if (place1.equals("TL") && TL.equals(" ")) {
				TL = "O";
				uc = true;
			} else if (place1.equals("TM") && TM.equals(" ")) {
				TM = "O";
				uc = true;
			} else if (place1.equals("TR") && TR.equals(" ")) {
				TR = "O";
				uc = true;
			} else if (place1.equals("ML") && ML.equals(" ")) {
				ML = "O";
				uc = true;
			} else if (place1.equals("MM") && MM.equals(" ")) {
				MM = "O";
				uc = true;
			} else if (place1.equals("MR") && MR.equals(" ")) {
				MR = "O";
				uc = true;
			} else if (place1.equals("BL") && BL.equals(" ")) {
				BL = "O";
				uc = true;
			} else if (place1.equals("BM") && BM.equals(" ")) {
				BM = "O";
				uc = true;
			} else if (place1.equals("BR") && BR.equals(" ")) {
				BR = "O";
				uc = true;
			}
			// will loop if the chosen square is not blank, or if format is incorrect
		} while (uc == false);

	}

}
