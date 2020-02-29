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
		
		nttt.doit();
		
		nttt.cft();
		
		nttt.doit();
		
		nttt.pwc();
		nttt.owc();
		nttt.swc();
		nttt.rc();
		nttt.wc();
		nttt.dc();
		
		nttt.doit();
		
		nttt.pwc();
		nttt.owc();
		nttt.swc();
		nttt.rc();
		nttt.wc();
		nttt.dc();
		
		nttt.doit();
		
		nttt.pwc();
		nttt.owc();
		nttt.swc();
		nttt.rc();
		nttt.wc();
		nttt.dc();
		
		nttt.doit();
		
		nttt.pwc();
		nttt.owc();
		nttt.swc();
		nttt.rc();
		nttt.wc();
		nttt.dc();
		
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

	public void cft() {	
	if (TL.equals("X") || TR.equals("X") || BL.equals("X") || BR.equals("X")) {
			MM = "O";
		} else if (TM.equals("X") || ML.equals("X") || MR.equals("X") || BM.equals("X")) {
			MM = "O";
		} else if (MM.equals("X")) {
			BL = "O";
		}

		System.out.println("---------");
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
	
	public void pwc() {
		if (TL.equals("O") && ML.equals("O") && BL.equals(" ")) {
			BL = "O";
		} else if (TL.equals(" ") && ML.equals("O") && BL.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && ML.equals(" ") && BL.equals("O")) {
			ML = "O";

		} else if (TM.equals("O") && MM.equals("O") && BM.equals(" ")) {
			BM = "O";
		} else if (TM.equals(" ") && MM.equals("O") && BM.equals("O")) {
			TM = "O";
		} else if (TM.equals("O") && MM.equals(" ") && BM.equals("O")) {
			MM = "O";

		} else if (TR.equals("O") && MR.equals("O") && BR.equals(" ")) {
			BR = "O";
		} else if (TR.equals(" ") && MR.equals("O") && BR.equals("O")) {
			TR = "O";
		} else if (TR.equals("O") && MR.equals(" ") && BR.equals("O")) {
			MR = "O";

		} else if (TL.equals("O") && TM.equals("O") && TR.equals(" ")) {
			TR = "O";
		} else if (TL.equals(" ") && TM.equals("O") && TR.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && TM.equals(" ") && TR.equals("O")) {
			TM = "O";

		} else if (ML.equals("O") && MM.equals("O") && MR.equals(" ")) {
			MR = "O";
		} else if (ML.equals(" ") && MM.equals("O") && MR.equals("O")) {
			ML = "O";
		} else if (ML.equals("O") && MM.equals(" ") && MR.equals("O")) {
			MM = "O";

		} else if (BL.equals("O") && BM.equals("O") && BR.equals(" ")) {
			BR = "O";
		} else if (BL.equals(" ") && BM.equals("O") && BR.equals("O")) {
			BL = "O";
		} else if (BL.equals("O") && BM.equals(" ") && BR.equals("O")) {
			BM = "O";

		} else if (TL.equals("O") && MM.equals("O") && BR.equals(" ")) {
			BR = "O";
		} else if (TL.equals(" ") && MM.equals("O") && BR.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && MM.equals(" ") && BR.equals("O")) {
			MM = "O";

		} else if (BL.equals("O") && MM.equals("O") && TR.equals(" ")) {
			TR = "O";
		} else if (BL.equals(" ") && MM.equals("O") && TR.equals("O")) {
			BL = "O";
		} else if (BL.equals("O") && MM.equals(" ") && TR.equals("O")) {
			MM = "O";
		}
	}
	
	public void owc() {
		if (TL.equals("X") && ML.equals("X") && BL.equals(" ")) {
			BL = "O";
		} else if (TL.equals(" ") && ML.equals("X") && BL.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && ML.equals(" ") && BL.equals("X")) {
			ML = "O";
		
		} else if (TM.equals("X") && MM.equals("X") && BM.equals(" ")) {
			BM = "O";
		} else if (TM.equals(" ") && MM.equals("X") && BM.equals("X")) {
			TM = "O";
		} else if (TM.equals("X") && MM.equals(" ") && BM.equals("X")) {
			MM = "O";
	
		} else if (TR.equals("X") && MR.equals("X") && BR.equals(" ")) {
			BR = "O";
		} else if (TR.equals(" ") && MR.equals("X") && BR.equals("X")) {
			TR = "O";
		} else if (TR.equals("X") && MR.equals(" ") && BR.equals("X")) {
			MR = "O";
	
		
		
		} else if (TL.equals("X") && TM.equals("X") && TR.equals(" ")) {
			TR = "O";
		} else if (TL.equals(" ") && TM.equals("X") && TR.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && TM.equals(" ") && TR.equals("X")) {
			TM = "O";
		
		} else if (ML.equals("X") && MM.equals("X") && MR.equals(" ")) {
			MR = "O";
		} else if (ML.equals(" ") && MM.equals("X") && MR.equals("X")) {
			ML = "O";
		} else if (ML.equals("X") && MM.equals(" ") && MR.equals("X")) {
			MM = "O";
	
		} else if (BL.equals("X") && BM.equals("X") && BR.equals(" ")) {
			BR = "O";
		} else if (BL.equals(" ") && BM.equals("X") && BR.equals("X")) {
			BL = "O";
		} else if (BL.equals("X") && BM.equals(" ") && BR.equals("X")) {
			BM = "O";
		
		
		
		} else if (TL.equals("X") && MM.equals("X") && BR.equals(" ")) {
			BR = "O";
		} else if (TL.equals(" ") && MM.equals("X") && BR.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && MM.equals(" ") && BR.equals("X")) {
			MM = "O";
		
		} else if (BL.equals("X") && MM.equals("X") && TR.equals(" ")) {
			TR = "O";
		} else if (BL.equals(" ") && MM.equals("X") && TR.equals("X")) {
			BL = "O";
		} else if (BL.equals("X") && MM.equals(" ") && TR.equals("X")) {
			MM = "O";
		}
	}
	
	public void swc() {
		if (TM.equals("X") && BL.equals("X") && TL.equals(" ")) {
			TL = "O";

		} else if (TL.equals("X") && MR.equals("X") && TR.equals(" ")) {
			TR = "O";

		} else if (TR.equals("X") && BM.equals("X") && BR.equals(" ")) {
			BR = "O";

		} else if (ML.equals("X") && BR.equals("X") && BL.equals(" ")) {
			BL = "O";

		} else if (BL.equals("X") && TR.equals("X") && MR.equals(" ")) {
			MR = "O";

		} else if (TL.equals("X") && ML.equals(" ") && BR.equals("X")) {
			ML = "O";

		} else if (BL.equals("X") && MR.equals("X") && BR.equals(" ")) {
			BR = "O";

		} else if (TL.equals("X") && BM.equals("X") && BL.equals(" ")) {
			BL = "O";

		} else if (ML.equals("X") && TR.equals("X") && TL.equals(" ")) {
			TL = "O";

		} else if (TM.equals("X") && BR.equals("X") && TR.equals(" ")) {
			TR = "O";

		} else if (ML.equals("X") && TM.equals("X") && TL.equals(" ")) {
			TL = "O";

		} else if (TM.equals("X") && MR.equals("X") && TR.equals(" ")) {
			TR = "O";

		} else if (BM.equals("X") && MR.equals("X") && BR.equals(" ")) {
			BR = "O";

		} else if (ML.equals("X") && BM.equals("X") && BL.equals(" ")) {
			BL = "O";
		}
	}
	
	public void wc() {
		if (TL.equals("X") && TM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("X")) {
			System.out.println("You have won!");
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("X") && ML.equals("X") && BL.equals("X")) {
			System.out.println("You have won!");
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("X")) {
			System.out.println("You have won!");
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("X") && MM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("O") && TM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");

		} else if (TL.equals("O") && ML.equals("O") && BL.equals("O")) {
			System.out.println("Computer has won!");
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("O")) {
			System.out.println("Computer has won!");
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");

		} else if (TL.equals("O") && MM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
		}
	}
	
	public void dc() {
		if (!TL.equals(" ") && !TM.equals(" ") && !TR.equals(" ") && !ML.equals(" ") && !MM.equals(" ")
				&& !MR.equals(" ") && !BL.equals(" ") && !BM.equals(" ") && !BR.equals(" ")) {
			System.out.println("It's a draw! Good game!");
		}
	}
	
	public void rc() {
		if (ML.equals("X") && MM.equals("O") && MR.equals("X") && TL.equals(" ")) {
			TL = "O";
		} else if (TM.equals("X") && MM.equals("O") && BM.equals("X") && TR.equals(" ")) {
			TR = "O";
		}
	}
}
