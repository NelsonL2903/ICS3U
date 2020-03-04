package dowhileloops;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		boolean loopflag = false;
		String answer = "NelsonIsAmazing";
		String guess;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess the password!");
		do {
			guess = keyboard.nextLine();
			if (!answer.equals(guess)) {
				System.out.println("Try again!");
				loopflag = false;
			} else {
				System.out.println("Yay! You guessed it!");

			}
		} while (loopflag == false);

	}

}
