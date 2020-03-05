package loopexercises;

public class LetterCombinations {

	public static void main(String[] args) {

		int count = 0;

		for (int fl = 65; fl <= 90; ++fl) {
			for (int sl = fl + 1; sl <= 90; ++sl) {
				System.out.print((char) fl);
				System.out.print((char) sl);
				System.out.print(" ");
				count = count + 1;
			}
			System.out.print("count = " + count);
			System.out.println(" ");
		}

	}

}
