package arrays1d;

import java.util.Random;

public class ArrayFrequency {

	private char[] array = new char[5000];
	private int[] frequency = new int[26];

	public static void main(String[] args) {

		ArrayFrequency arrayFrequency = new ArrayFrequency();
		arrayFrequency.initializearray();
		arrayFrequency.countLetters();
		arrayFrequency.print();
		int totalsum = arrayFrequency.frequencySum();
		arrayFrequency.checkFrequencySum(totalsum);

	}

	public void initializearray() {
		Random ran = new Random();
		for (int i = 0; i < array.length; ++i) {
			char arrayvalue = (char) (ran.nextInt(26) + 65);
			array[i] = arrayvalue;
		}
	}

	public void countLetters() {

		for (int i = 0; i < frequency.length; ++i) {
			frequency[i] = 0;
		}
		for (int i = 0; i < frequency.length; ++i) {
			for (int j = 0; j < array.length; ++j) {
				if (array[j] == ((char) (i + 65))) {
					frequency[i] = frequency[i] + 1;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < frequency.length; ++i) {
			System.out.println("Frequency of " + ((char) (i + 65)) + " = " + frequency[i]);
		}
	}

	public int frequencySum() {
		int sum = 0;
		for (int i = 0; i < frequency.length; ++i) {
			sum = sum + frequency[i];
		}
		return sum;
	}

	public void checkFrequencySum(int totalsum) {

		if (totalsum == 5000) {
			System.out.println("sum of the frequency array = " + totalsum + ", all is good.");
		} else {
			System.out.println("Sum of the frequency array = " + totalsum + ", something has gone wrong.");
		}
	}

}
