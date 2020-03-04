package dowhileloops;

public class DoWhileLoops {

	public static void main(String[] args) {

		boolean loopflag = false;
		while (loopflag) {
			System.out.println("hey, do you even print?");
		}

		do {
			System.out.println("how many times does this print?");
		} while (loopflag);

		int i = 0;
		while (i < 10) {
			System.out.println("i is " + i);
			++i;
		}

		int j = 1;
		while (j > 0) {
			System.out.println("How do you stop this? " + j);
			j = j + 1;
		}

	}

}
