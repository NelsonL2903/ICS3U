package random;

import java.util.Random;

public class RandomChars {

	int N = 20;
	char[] charArray = new char[N];

	public static void main(String[] args) {

		RandomChars randomChars = new RandomChars();

		randomChars.initialize();
		randomChars.print();

	}

	// print out the charArray
	private void print() {
// put code here
	}

	// set the elements of charArray to a random
	// char between 'A' and 'Z'
	private void initialize() {

		Random randomGenerator = new Random();
		int low = 65;
		int high = 91;

		for (int i = 0; i < charArray.length; ++i) {
			charArray[i] = (char) (randomGenerator.nextInt(high - low) + low);
			System.out.println("Array[" + i + "] = " + charArray[i]);
		}
	}

}
