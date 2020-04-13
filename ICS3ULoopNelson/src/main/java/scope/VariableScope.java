package scope;

public class VariableScope {

	// What does scope mean?
	/*
	 * scope refers to the accessibility of a variable, what can access it, and
	 * where it is visible.
	 */

	private int var1; // What does private mean with respect to variables?
	/*
	 * if a variable is private, that means that only this class may access it
	 */
	public int var2; // What does public mean with respect to variables?
	/*
	 * if a variable is public, that means that the whole package may access it
	 */

	public static void main(String[] args) {
		VariableScope variScope = new VariableScope();
		variScope.methodOne();
		variScope.methodTwo();

		// Is var1 visible here?
		var1 = 14;
		// var1 is not visible here because while it is a private variable and declared
		// outside of
		// a method, it is not accessible as it is within a static field, and the
		// variable was
		// declared in a non-static field

		// Is var2 visible here?
		var2 = 55;
		// var2 is not visible here because while it is a public variable and declared
		// outside of
		// a method, it is not accessible as it is within a static field, and the
		// variable was
		// declared in a non-static field

		// What is wrong with this statement?
		private int var3 = 555;
		// The statement is wrong because the variable is declared in a method, which
		// means it is
		// only accessible and visible within the method, so it can't be public or
		// private as it
		// can only be accessed within the method
	}

	public void methodOne() {
		int abc = 1;
		for (int i = 0; i < 10; ++i) {
			boolean xxx = true;
		}

		// Is xxx visible here?
		xxx = false;
		// xxx is not visible here as it was declared within brackets {} so it may only
		// be
		// accessed within those brackets

		// Is var1 visible here?
		var1 = 42;
		// var1 is visible here because it was declared outside of a method and it is
		// within
		// the same class

		// Is var2 visible here?
		var2 = 123;
		// var2 is visible here because it was declared outside of a method and it is
		// within
		// the same package
	}

	private void methodTwo() {
		double xyz = 2.718;

		// Is xxx visible here?
		xxx = true;
		// xxx is not visible here as it was declared within a different method and
		// within brackets

		for (int i = 0; i < 20; ++i) {
			// Is xyz visible here?
			xyz = xyz * i;
			// xyz is visible here as it was declared within the same method
		}

		// Is var1 visible here?
		var1 = 18;
		// var1 is visible here because it was declared outside of a method and it is
		// within
		// the same class

		// Is var2 visible here?
		var2 = 234;
		// var2 is visible here because it was declared outside of a method and it is
		// within
		// the same package

	}

}
