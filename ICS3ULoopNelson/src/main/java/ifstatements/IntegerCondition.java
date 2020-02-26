package ifstatements;

public class IntegerCondition {

	public static void main(String[] args) {

		int foo = 22;
		if (foo < 0) {
			System.out.println("foo is negative");
		} else if (0 <= foo & foo < 10) {
			System.out.println("foo is equal to or greater than zero but less than 10");
		} else if (foo >= 10) {
			System.out.println("foo is equal to or greater than 10");
		}

	}

}
