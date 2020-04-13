package scope;

public class VariableScope {

	// What does scope mean?

	private int var1; // What does private mean with respect to variables?
	public int var2; // What does public mean with respect to variables?

	public static void main(String[] args) {
		VariableScope variScope = new VariableScope();
		variScope.methodOne();
		variScope.methodTwo();

		// Is var1 visible here?
		var1 = 14;

		// Is var2 visible here?
		var2 = 55;

		// What is wrong with this statement?
		private int var3 = 555;
	}

	public void methodOne() {
		int abc = 1;
		for (int i = 0; i < 10; ++i) {
			boolean xxx = true;
		}

		// Is xxx visible here?
		xxx = false;

		// Is var1 visible here?
		var1 = 42;

		// Is var2 visible here?
		var2 = 123;
	}

	private void methodTwo() {
		double xyz = 2.718;

		// Is xxx visible here?
		xxx = true;

		for (int i = 0; i < 20; ++i) {
			// Is xyz visible here?
			xyz = xyz * i;
		}

		// Is var1 visible here?
		var1 = 18;

		// Is var2 visible here?
		var2 = 234;

	}

}
