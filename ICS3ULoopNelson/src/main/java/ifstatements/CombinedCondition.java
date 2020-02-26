package ifstatements;

public class CombinedCondition {

	public static void main(String[] args) {

		int bar = 12;
		boolean foo = true;
		if (bar < 5 && foo == false) {
			System.out.println("1");
		} else if (5 <= bar && bar < 8 && foo == false) {
			System.out.println("2");
		} else if (8 <= bar && bar < 10 && foo == true) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}

	}

}
