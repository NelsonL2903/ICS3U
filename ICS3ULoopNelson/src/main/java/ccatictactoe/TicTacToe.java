package ccatictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Tic Tac Toe!");
		System.out.println("   |   |   ");
		System.out.println("-----------");
		System.out.println("   |   |   ");
		System.out.println("-----------");
		System.out.println("   |   |   ");
		System.out.println("Would you like to play first or second? Please enter as a number");
		int order = keyboard.nextInt();
		keyboard.nextLine();
		if (order == 2) {
			System.out.println("   |   | X ");
			System.out.println("-----------");
			System.out.println("   |   |   ");
			System.out.println("-----------");
			System.out.println("   |   |   ");
			System.out.println("Where would you like to play? For example: Top Left = TL");
			String first = keyboard.nextLine();
			if (first.equals("ML")) {
				System.out.println("   |   | X ");
				System.out.println("-----------");
				System.out.println(" O | X |   ");
				System.out.println("-----------");
				System.out.println("   |   |   ");
				System.out.println("Where would you like to play? For example: Top Left = TL");
				String second = keyboard.nextLine();
				if (second.equals("BL")) {
					System.out.println(" X |   | X ");
					System.out.println("-----------");
					System.out.println(" O | X |   ");
					System.out.println("-----------");
					System.out.println(" O |   |   ");
					System.out.println("Where would you like to play? For example: Top Left = TL");
					String third = keyboard.nextLine();
					if (third.equals("TM")) {
						System.out.println(" X | O | X ");
						System.out.println("-----------");
						System.out.println(" O | X |   ");
						System.out.println("-----------");
						System.out.println(" O |   | X ");
						System.out.println("Yay! I have won!");
					} else {
						System.out.println(" X | X | X ");
						System.out.println("-----------");
						System.out.println(" O | X |   ");
						System.out.println("-----------");
						System.out.println(" O |   | O ");
						System.out.println("Yay! I have won!");
					}

				}
			} else if (first.equals("TM")) {
				System.out.println("   | O | X ");
				System.out.println("-----------");
				System.out.println("   | X |   ");
				System.out.println("-----------");
				System.out.println("   |   |   ");
				System.out.println("Where would you like to play? For example: Top Left = TL");
				String second = keyboard.nextLine();
				if (second.equals("BL")) {
					System.out.println("   | O | X ");
					System.out.println("-----------");
					System.out.println("   | X |   ");
					System.out.println("-----------");
					System.out.println(" O |   | X ");
					System.out.println("Where would you like to play? For example: Top Left = TL");
					String third = keyboard.nextLine();
					if (third.equals("TL")) {
						System.out.println(" O | O | X ");
						System.out.println("-----------");
						System.out.println("   | X | X ");
						System.out.println("-----------");
						System.out.println(" O |   | X ");
						System.out.println("Yay! I have won!");
					} else {
						System.out.println(" X | O | X ");
						System.out.println("-----------");
						System.out.println("   | X | O ");
						System.out.println("-----------");
						System.out.println(" O |   | X ");
						System.out.println("Yay! I have won!");
					}
				}

			}
		}
	}
}