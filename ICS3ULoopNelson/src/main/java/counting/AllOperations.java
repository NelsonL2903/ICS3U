package counting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AllOperations {

	public static void main(String[] args) {

		System.out.println("What operation would you like to do? Please capitalize the first letter");
		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();

		if (operation.equals("Addition")) {
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
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count = count + 1;
				starter = starter + add;
				System.out.println(starter);
			} while ((count + 1) < amount);

		} else if (operation.equals("Subtraction")) {
			System.out.println("What number would you like to start with?");
			int starter = keyboard.nextInt();
			System.out.println("By what number would you like to go down?");
			int subtract = keyboard.nextInt();
			System.out.println("How many numbers would you like to print");
			int amount = keyboard.nextInt();
			int count = 0;
			System.out.println(starter);
			do {
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count = count + 1;
				starter = starter - subtract;
				System.out.println(starter);
			} while ((count + 1) < amount);
		}

	}
}