package forloops;

public class NestedLoop {

	public static void main(String[] args) {

		for (int j = 1; j < 5; ++j) {
			for (int i = 1; i < 5; ++i) {
				System.out.print("(" + j + "," + i + ")");
			}
			System.out.println(" ");
		}

	}

}
