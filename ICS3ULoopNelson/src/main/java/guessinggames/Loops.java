package guessinggames;

import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Guess a number between 1 and 10");
		Scanner keyboard = new Scanner(System.in);

		Random answer = new Random();
		int low = 1;
		int high = 10;
		int rand = answer.nextInt(high - low) + low;
		while (true) {
			int guess = keyboard.nextInt();
			if (guess == rand) {
				System.out.println("Yay! You guessed it!");
				break;
			} else if (guess != rand) {
				System.out.println("Haha you suck!! The number is " + rand);
			}
		}

		int guess = low - 1;
		while (guess != rand) {
			guess = keyboard.nextInt();
			if (guess == rand) {
				System.out.println("Yay! You guessed it!");
			} else if (guess != rand) {
				System.out.println("Haha you suck!! The number is " + rand);
			}
		}

		do {
			guess = keyboard.nextInt();
			if (guess == rand) {
				System.out.println("Yay! You guessed it!");
			} else if (guess != rand) {
				System.out.println("Haha you suck!! The number is " + rand);
			}
		} while (guess != rand);

	}

}
