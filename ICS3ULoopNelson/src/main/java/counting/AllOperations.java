package counting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AllOperations {

	public static void main(String[] args) {

		String response = "";
		Scanner keyboard = new Scanner(System.in);

		do {

			System.out.println("What operation would you like to do?");
			System.out.println("Options:");
			System.out.println("Addition");
			System.out.println("Subtraction");
			System.out.println("Multiplication");
			System.out.println("Division");
			System.out.println("Exponent");
			System.out.println("Square root");
			System.out.println("Please make sure to capitalize the first letter");
			String operation = keyboard.nextLine();

			if (operation.equals("Addition")) {
				System.out.println("What number would you like to start with?");
				double starter = keyboard.nextInt();
				System.out.println("By what number would you like to go up?");
				double add = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
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
				double starter = keyboard.nextInt();
				System.out.println("By what number would you like to go down?");
				double subtract = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
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
				double starter = keyboard.nextInt();
				System.out.println("By what number would you like multiply by?");
				double multiply = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
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
				double starter = keyboard.nextInt();
				System.out.println("By what number would you like to divide by?");
				double divide = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
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

			} else if (operation.equals("Exponent")) {
				System.out.println("What number would you like to start with?");
				double starter = keyboard.nextInt();
				System.out.println("What number would you like to be your exponent?");
				double exponent = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
				System.out.println(starter);
				double result = starter;
				do {
					try {
						TimeUnit.MILLISECONDS.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = count + 1;
					result = Math.pow(result, exponent);
					System.out.println(result);
				} while ((count + 1) < amount);

			} else if (operation.equals("Square root")) {
				System.out.println("What number would you like to start with?");
				double starter = keyboard.nextInt();
				System.out.println("What number would you like to square root your number by?");
				double root = keyboard.nextInt();
				System.out.println("How many numbers would you like to print");
				double amount = keyboard.nextInt();
				keyboard.nextLine();
				double count = 0;
				System.out.println(starter);
				double result = starter;
				do {
					try {
						TimeUnit.MILLISECONDS.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count = count + 1;
					result = Math.pow(result, 1/root);
					System.out.println(result);
				} while ((count + 1) < amount);
			}

			System.out.println("Would you like to go again? Please respond with a capital letter");
			response = keyboard.nextLine();

		} while (response.equals("Yes"));

	}
}