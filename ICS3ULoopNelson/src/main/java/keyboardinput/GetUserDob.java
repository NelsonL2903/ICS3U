package keyboardinput;

import java.util.Scanner;

public class GetUserDob {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, what's your first name?");
		String firstname = keyboard.nextString();
		int myint = keyboard.nextInt();
		System.out.println("you typed " + myint);

	}

}
