package tictactoe;

import java.util.Scanner;

public class NewerTicTacToe {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		NewerTicTacToe gameboard = new NewerTicTacToe();
		String TL = "0";
		String TM = "0";
		String TR = "0";
		String ML = "0";
		String MM = "0";
		String MR = "0";
		String BL = "0";
		String BM = "0";
		String BR = "0";
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
		}System.out.print(TL);
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
	
