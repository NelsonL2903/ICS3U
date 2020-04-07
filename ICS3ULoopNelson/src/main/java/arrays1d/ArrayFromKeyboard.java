package arrays1d;

import java.util.Scanner;

public class ArrayFromKeyboard {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] myArray = new int[6];

		System.out.println("Please enter 5 integers, one at a time");

		for (int i = 1; i < myArray.length; ++i) {
			myArray[i] = keyboard.nextInt();

		}

		for (int j = 1; j < 6; ++j)
			System.out.print("myArray[" + (j) + "] = " + myArray[j] + " ");

	}
}
