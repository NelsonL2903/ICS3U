package arrays1d;

import java.util.Random;
import java.util.Scanner;

public class LinearStringSearch {

	String[] array;
	int stringLength = 5;

	public static void main(String[] args) {

		// Create a new instance of the class LinearStringSearch.
		LinearStringSearch ls = new LinearStringSearch();

		// Create a keyboard scanner
		Scanner keyboard = new Scanner(System.in);

		// Grab the next integer from the keyboard
		System.out.println("Please input the size of the array");
		int N = keyboard.nextInt();

		// consume the new line character
		keyboard.nextLine();

		// call the initializeRandom method
		ls.initializeRandom(N);

		// print out the string array
		ls.dump();

		// get the string to search for from the keyboard
		System.out.println("Please enter the string you would like to search for");
		String searchString = keyboard.nextLine();

		// Call the find method of the LinearStringSearch class.
		// Put the return value of the find method into
		// the variable idx.
		int idx = ls.find(searchString);
		if (idx == -1) {
			System.out.println(searchString + " not found in array.");
		} else {
			System.out.println(searchString + " found in array at index = " + idx);
		}

		int whileidx = ls.findWhile(searchString);
		if (whileidx == -1) {
			System.out.println("While loop: " + searchString + " not found in array.");
		} else {
			System.out.println("While loop: " + searchString + " found in array at index = " + idx);
		}
	}

	/*
	 * Create an array of strings. Set the array elements to be random strings of
	 * length stringLength, consisting of the characters A to Z.
	 */
	private void initializeRandom(int N) {
		array = new String[N];
		Random ran = new Random();
		for (int i = 0; i < array.length; ++i) {
			String randomString = "";
			for (int j = 0; j < ran.nextInt(stringLength) + 1; ++j) {
				char c = (char) (ran.nextInt(26) + 65);
				// The number 65 indicates the lowest number that the random number may be,
				// while the number 26 indicates the range of what the random number can be,
				// in this case, the random number may be anything from 65, to 65 + 26 (which is
				// 91).
				randomString += c;
			}
			array[i] = randomString;
		}
	}

	private int find(String searchString) {
		// Put your code to search the array here.
		// The code will look very similar to the integer array search
		// remember, to test if two strings are equal you need to use
		// String aString = "what"
		// String bString = "ever"
		// if (aString.equals(bString)) {
		// do stuff
		// }
		int index = -1;
		for (int i = 0; i < array.length; ++i) {
			if (array[i].equals(searchString)) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		return index;
	}

	private void dump() {
		for (int i = 0; i < array.length; ++i) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

	}

	private int findWhile(String searchString) {

		int index = -1;
		int i = 0;

		while (i < array.length) {
			if (searchString.equals(array[i])) {
				index = i;
				break;
			} else {
				index = -1;
			}
			i = i + 1;
		}

		return index;
	}

}
