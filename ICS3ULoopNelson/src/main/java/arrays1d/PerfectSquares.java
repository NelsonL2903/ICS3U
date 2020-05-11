package arrays1d;

public class PerfectSquares {

	public static void main(String[] args) {

		int[] myArray = new int[50];

		for (int i = 0; i < myArray.length; ++i) {
			myArray[i] = i * i;
			System.out.println("myArray[" + i + "] = " + myArray[i]);
		}
	}

}
