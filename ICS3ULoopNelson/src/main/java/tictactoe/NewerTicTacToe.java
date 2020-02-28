package tictactoe;

import java.util.Scanner;

public class NewerTicTacToe {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		NewerTicTacToe gameboard = new NewerTicTacToe();
		String TL = "/";
		String TM = "/";
		String TR = "/";
		String ML = "/";
		String MM = "/";
		String MR = "/";
		String BL = "/";
		String BM = "/";
		String BR = "/";
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
		String placex = keyboard.nextLine();
		if (placex.equals("TL")) {
			TL = "X";
		} else if (placex.equals("TM")){
			TM = "X";
		} else if (placex.equals("TR")){
			TR = "X";
		} else if (placex.equals("ML")){
			ML = "X";
		} else if (placex.equals("MM")){
			MM = "X";
		} else if (placex.equals("MR")){
			MR = "X";
		} else if (placex.equals("BL")){
			BL = "X";
		} else if (placex.equals("BM")){
			BM = "X";
		} else if (placex.equals("BR")){
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
			BL = "X";
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
	
