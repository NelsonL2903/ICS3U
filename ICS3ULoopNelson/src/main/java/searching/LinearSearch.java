package searching;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		// get arraySize from keyboard
		System.out.println("Please input the size of the array");
		Scanner keyboard = new Scanner(System.in);
		int arraySize = keyboard.nextInt();

		int[] array = new int[arraySize];

		LinearSearch ls = new LinearSearch();
		ls.initializeRandom(array);
		ls.dump(array);

		System.out.println("Please enter the integer, between 1 and 100, you would like to search for");
		int searchInt = keyboard.nextInt();
		// get searchInt from keyboard

		int idx = ls.find(array, searchInt);
		if (idx == -1) {
			System.out.println(searchInt + " not found in array.");
		} else {
			System.out.println(searchInt + " found in array at index = " + idx);
		}
	}

	public void initializeRandom(int[] array) {
		// initialize array to random integers
		// between 0 and array.length
		for (int i = 1; i <= array.length - 1; ++i) {
			Random answer = new Random();
			int rand;
			int low = 1;
			int high = 101;
			rand = answer.nextInt(high - low) + low;
			array[i] = rand;
		}
	}

	// look for searchInt in array.
	// return index of searchInt in array
	// otherwise return -1 if searchInt is not in array
	public int find(int[] array, int searchInt) {
		// initialize
		int index = -1;
		for (int i = 0; i < array.length; ++i) {
			if (searchInt == array[i]) {
				index = i;
			} else {
				index = -1;

			}
			return index;
		}

		// loop through array
		// search for searchInt

	}

	// print out the array
	public void dump(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		System.out.println();

	}

}
