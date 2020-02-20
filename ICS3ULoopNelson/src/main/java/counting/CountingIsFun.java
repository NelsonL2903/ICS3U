package counting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CountingIsFun {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What number would you like to start with?");
		int starter = keyboard.nextInt();
		System.out.println("By what number would you like to go up?");
		int add = keyboard.nextInt();
		System.out.println("How many numbers would you like to print");
		int amount = keyboard.nextInt();
		int count = 0;
		System.out.println(starter);
		do {
			try {
				TimeUnit.MILLISECONDS.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count = count + 1;
			starter = starter + add;
			System.out.println(starter);
		} while ((count + 1) < amount);

	}
}