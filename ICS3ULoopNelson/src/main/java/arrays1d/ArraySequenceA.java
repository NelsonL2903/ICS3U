package arrays1d;

public class ArraySequenceA {

	public static void main(String[] args) {

		String[] myArray = new String[11];

		for (int i = 1; i < myArray.length; ++i) {
			myArray[i] = "A";
			for (int j = 1; j < i; ++j) {
				myArray[i] = myArray[i] + "A";
			}
			System.out.println("myArray[" + i + "] = " + myArray[i]);
		}

	}
}
