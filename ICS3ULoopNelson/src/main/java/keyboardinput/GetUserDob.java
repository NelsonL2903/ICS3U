package keyboardinput;

import java.util.Scanner;

public class GetUserDob {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, what's your first name?");
		String firstname = keyboard.nextLine();
		System.out.println("Hi " + firstname + "! What's your last name?");
		String lastname = keyboard.nextLine();
		System.out.println("Nice to meet you " + firstname + " " + lastname
				+ "! What's your birth year? Please input as an integer");
		int year = keyboard.nextInt();
		System.out.println("What's your birth month? Please input as an integer");
		int month = keyboard.nextInt();
		System.out.println("What's your day of birth? Please input as an integer");
		int day = keyboard.nextInt();
		System.out.println("Thank you " + firstname + " " + lastname + "!"
				+ " I now know all your personal information! You were born on " + year + "/" + month + "/" + day);

	}

}
