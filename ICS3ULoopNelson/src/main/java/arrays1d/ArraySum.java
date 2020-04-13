package arrays1d;

import java.util.Random;

public class ArraySum {

	private int[] array = new int[50];

	public static void main(String[] args) {

		ArraySum arraySum = new ArraySum();
		arraySum.init();
		arraySum.print();
		int sum = arraySum.sum();
		System.out.println("Sum is " + sum);
	}

	// initialize the array elements to be random
	// integers between 0 and 50 inclusive
	public void init() {

		Random randomGenerator = new Random();
		int low = 0;
		int high = 51;

		for (int i = 0; i < array.length; ++i) {
			array[i] = randomGenerator.nextInt(high - low) + low;
		}
	}

	public void print() {
		// print out the array
		for (int i = 0; i < array.length; ++i) {
			System.out.println("Array[" + i + "] = " + array[i]);
		}
	}

	// calculate the sum of the numbers in the array
	// and return the sum
	public int sum() {
		int sum = 0;
		// use a for loop to calculate sum
		for (int i = 0; i < array.length; ++i) {
			sum = sum + array[i];
		}

		return sum;

	}

}
