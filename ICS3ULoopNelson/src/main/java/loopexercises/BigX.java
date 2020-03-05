package loopexercises;

public class BigX {

	public static void main(String[] args) {

		for (int i = 0; i < 7; ++i) {
			// spaces for left X
			for (int j = 0; j < i; ++j) {
				System.out.print(" ");
			}

			// print out the left X
			System.out.print("X");

			// spaces between left X and right X
			// spaces between two X characters has to decrease
			// each line
			for (int j = 0; j < 13 - 2 * i; ++j) {
				System.out.print(" ");
			}

			// print out the right X
			System.out.println("X");
		}

		// central x
		for (int j = 0; j < 7; ++j) {
			System.out.print(" ");
		}
		System.out.println("X");

		for (int i = 0; i < 7; ++i) {
			// spaces for left X
			for (int j = 0; j < 6 - i; ++j) {
				System.out.print(" ");
			}

			// print out the left X
			System.out.print("X");

			// spaces between left X and right X
			// spaces between two X characters has to decrease
			// each line
			for (int j = 0; j < 2 * i + 1; ++j) {
				System.out.print(" ");
			}

			// print out the right X
			System.out.println("X");
		}

	}

}
