package arrays1d;

import java.util.Random;

public class Extrema {

	private int[] array = new int[50];

	public static void main(String[] args) {

		Extrema extrema = new Extrema();
		extrema.init();
		extrema.print();
		int min = extrema.min();
		System.out.println("minimum is " + min);
		int max = extrema.max();
		System.out.println("maximum is " + max);
	}

	// initialize the array elements to be random
	// integers between 0 and 50
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

	// find maximum value in array
	public int max() {
		// initialize max value to smallest possible integer
		int max = Integer.MIN_VALUE;
		// loop through the array, update max value
		// if current array element > max
		for (int i = 0; i < array.length; ++i) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// find minimum value in array
	public int min() {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; ++i) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
