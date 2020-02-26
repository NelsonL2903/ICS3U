package ifstatements;

public class StringCondition {

	public static void main(String[] args) {

		String state = "foobar";
		if (state.equals("foobar")) {
			System.out.println("state is foobar");
		} else if (state.equals("barfoo")) {
			System.out.println("state is reverse barfoo");
		} else {
			System.out.println("situation normal");
		}

	}

}
