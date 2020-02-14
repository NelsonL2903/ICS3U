package keyboardinput;

import java.util.Scanner;

public class GetUserDobString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, what's your first name?");
		String firstname = keyboard.nextLine();
		System.out.println("Hi " + firstname + "! What's your last name?");
		String lastname = keyboard.nextLine();
		System.out.println("Nice to meet you " + firstname + " " + lastname
				+ "! What's your birth year? Please input as an integer");
		int year = keyboard.nextInt();
		System.out.println("What's your birth month? Please input as a word");
		keyboard.nextLine();
		String month = keyboard.nextLine();
		System.out.println("What's your day of birth? For example: Saturday the 8th");
		String day = keyboard.nextLine();
		System.out.println("Thank you " + firstname + " " + lastname + "!"
				+ " I now know all your personal information! You were born on " + month + ", " + day + ", " + year);
		/*
		 * My program runs as expected, the behaviour that I wanted was for the user to
		 * input information about themselves and for the program to process that
		 * information, and then print it back out in a sentence. After running the
		 * code, this is exactly the behaviour I got and my program turned out how I
		 * wanted it to.
		 */
	}

}
