package counting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AllOperations {

	public static void main(String[] args) {

		String response = "";
		Scanner keyboard = new Scanner(System.in);

		do {

			System.out.println("What operation would you like to do? Please capitalize the first letter");
			String operation = keyboard.nextLine();

			if (operation.equals("Addition")) {
				System.out.println("What number would you like to start with?");
				int starter = keyboard.nextInt();
				System.out.println("By what number would you like to go up?");
				int add = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				int amount = keyboard.nextInt();
				keyboard.nextLine();
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
				keyboard.nextLine();
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
			} else if (operation.equals("Multiplication")) {
				System.out.println("What number would you like to start with?");
				int starter = keyboard.nextInt();
				System.out.println("By what number would you like multiply by?");
				int multiply = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				int amount = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;
				System.out.println(starter);
				do {
					try {
						TimeUnit.MILLISECONDS.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = count + 1;
					starter = starter * multiply;
					System.out.println(starter);
				} while ((count + 1) < amount);

			} else if (operation.equals("Division")) {
				System.out.println("What number would you like to start with?");
				int starter = keyboard.nextInt();
				System.out.println("By what number would you like to divide by?");
				int divide = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				int amount = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;
				System.out.println(starter);
				do {
					try {
						TimeUnit.MILLISECONDS.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = count + 1;
					starter = starter / divide;
					System.out.println(starter);
				} while ((count + 1) < amount);

			}
			System.out.println("Would you like to go again? Please respond with a capital letter");
			response = keyboard.nextLine();

		} while (response.equals("Yes"));

	}
}