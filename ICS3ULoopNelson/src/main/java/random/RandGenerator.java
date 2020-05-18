package random;

import java.util.Random;

public class RandGenerator {

	int low = 1;
	int high = 10;
	int rand;
	Random randGen = new Random();

	public static void main(String[] args) {

		RandGenerator rg = new RandGenerator();

		rg.run(100000);

	}

	void run(int N) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; ++i) {
			rand = randGen.nextInt(high - low) + low;

			max = Math.max(max, rand);
			min = Math.min(min, rand);
		}

		System.out.println("max is " + max);
		System.out.println("min is " + min);

	}
}
