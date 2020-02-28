package tictactoe;

import java.util.Scanner;

public class NewerTicTacToe {

	String TL = "/";
	String TM = "/";
	String TR = "/";
	String ML = "/";
	String MM = "/";
	String MR = "/";
	String BL = "/";
	String BM = "/";
	String BR = "/";

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		NewerTicTacToe nttt = new NewerTicTacToe();
		nttt.doit();

		nttt.pwc();
		nttt.owc();
		nttt.swc();
		nttt.wc();
		nttt.dc();
	}

	public void doit() {

		System.out.print(TL);
		System.out.print(TM);
		System.out.println(TR);
		System.out.print(ML);
		System.out.print(MM);
		System.out.println(MR);
		System.out.print(BL);
		System.out.print(BM);
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

		System.out.print(TL);
		System.out.print(TM);
		System.out.println(TR);
		System.out.print(ML);
		System.out.print(MM);
		System.out.println(MR);
		System.out.print(BL);
		System.out.print(BM);
		System.out.println(BR);

		if (TL.equals("X") || TR.equals("X") || BL.equals("X") || BR.equals("X")) {
			MM = "O";
		} else if (TM.equals("X") || ML.equals("X") || MR.equals("X") || BM.equals("X")) {
			MM = "O";
		} else if (MM.equals("X")) {
			BL = "O";
		}

		System.out.println("---");
		System.out.print(TL);
		System.out.print(TM);
		System.out.println(TR);
		System.out.print(ML);
		System.out.print(MM);
		System.out.println(MR);
		System.out.print(BL);
		System.out.print(BM);
		System.out.println(BR);

	}
}
