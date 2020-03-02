package tictactoe;

import java.util.Scanner;

public class NewerTicTacToe {

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
		NewerTicTacToe nttt = new NewerTicTacToe();
		String answer;

	do {
		
		nttt.doit();

		nttt.cft();

	do {	
			nttt.doit();

		if (nttt.pwc() == false) {
			if (nttt.owc() == false) {
				if (nttt.swc() == false) {
					nttt.rc();
				}
			}
		}
	} while (nttt.wc() == false && nttt.dc() == false);

	nttt.cb();
	
	System.out.println("Would you like to play again? Please capitalize your answer");
	answer = keyboard.nextLine();
	} while (answer.equals("Yes"));
	
	}

	public void doit() {

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
		System.out.println("Where would you like to play? For example: Top Left = TL");
		String place1 = keyboard.nextLine();
		if (place1.equals("TL")) {
			TL = "X";
		} else if (place1.equals("TM")) {
			TM = "X";
		} else if (place1.equals("TR")) {
			TR = "X";
		} else if (place1.equals("ML")) {
			ML = "X";
		} else if (place1.equals("MM")) {
			MM = "X";
		} else if (place1.equals("MR")) {
			MR = "X";
		} else if (place1.equals("BL")) {
			BL = "X";
		} else if (place1.equals("BM")) {
			BM = "X";
		} else if (place1.equals("BR")) {
			BR = "X";
		}

	}

	public void cft() {
		if (TL.equals("X") || TR.equals("X") || BL.equals("X") || BR.equals("X")) {
			MM = "O";
		} else if (TM.equals("X") || ML.equals("X") || MR.equals("X") || BM.equals("X")) {
			MM = "O";
		} else if (MM.equals("X")) {
			BL = "O";
		}

	}

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

	public boolean dc() {
		if (!TL.equals(" ") && !TM.equals(" ") && !TR.equals(" ") && !ML.equals(" ") && !MM.equals(" ")
				&& !MR.equals(" ") && !BL.equals(" ") && !BM.equals(" ") && !BR.equals(" ")) {
			System.out.println("It's a draw! Good game!");
			return true;
		}
		return false;
	}

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
	
	public void cb() {
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
}
