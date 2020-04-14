package arrays1d;

import java.util.Random;

public class ArrayMean {

	private int[] array = new int[50];

	public static void main(String[] args) {
		ArrayMean arrayMean = new ArrayMean();
		arrayMean.init();
		arrayMean.print();
		double mean = arrayMean.mean();
		System.out.println("Mean is " + mean);
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

	// calculate the sum of the numbers in the array
	// and return the sum
	public int sum() {
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			sum = sum + array[i];

		}
		System.out.println("Sum is " + sum);
		return sum;
	}

	public double mean() {
		double sum = sum();
		double arraylength = array.length;

		// divide the sum by the array length to
		// compute the mean.
		// you will need to cast the two integers in the division
		// operation into double values
		double mean = sum / arraylength;
		return mean;
	}

}
