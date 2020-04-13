package random;

import java.util.Random;

public class RandomInt {

	public static void main(String[] args) {

		int[] myArray = new int[20];

		Random randomGenerator = new Random();
		int low = -40;
		// The low integer states the lowest number that the random number may be
		int high = 36;
		// The high integer states the number that the random integer can not be, acting
		// as a limit

		for (int i = 0; i < myArray.length; ++i) {
			myArray[i] = randomGenerator.nextInt(high - low) + low;
			System.out.println("Array[" + i + "] = " + myArray[i]);
		}

	}

}
