package booleanfun;

import java.util.Scanner;

public class AreYouDumb {

	public static void main(String[] args) {
		System.out.println("Hi! What's your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		if (name.equals("Nelson")) {
			System.out.println("Wow! You're really cool!");
		} else {
			System.out.println("You're lame");
		}

	}

}
