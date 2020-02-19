package guessinggames;

import java.util.Random;
import java.util.Scanner;

public class GameV2 {

	public static void main(String[] args) {
		System.out.println("Guess a number between 1 and 10");
		Scanner keyboard = new Scanner(System.in);

		Random answer = new Random();
		int low = 1;
		int high = 10;
		int rand;
		int guess;
		do {
			rand = answer.nextInt(high - low) + low;
			guess = keyboard.nextInt();
			if (guess == rand) {
				System.out.println("Yay! You guessed it!");
			} else if (guess != rand) {
				System.out.println("Haha you suck!! The number was " + rand);
				System.out.println("Guess a number between 1 and 10");
			}
		} while (guess != rand);

	}

}
