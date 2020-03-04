package dowhileloops;

import java.util.Scanner;

public class DoWhileLoop1 {

	public static void main(String[] args) {

		boolean loopflag = false;
		int answer = 29;
		int guess;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess the number!");
		do {
			guess = keyboard.nextInt();
			if (answer != guess) {
				System.out.println("Try again!");
				loopflag = false;
			} else {
				System.out.println("Yay! You guessed it!");

			}
		} while (loopflag == false);

	}

}
