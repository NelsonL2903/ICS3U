package printing;

public class PrintingIntegers {

	public static void main(String[] args) {

		int x = 20;
		int y = 22;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x + y = " + x + y);

		System.out.print("x + y = ");
		System.out.println(x + y);

		System.out.println("x + y = " + (x + y));

		/*
		 * println prints the text on a line, but then all following code will be
		 * printed on the following line, so if you have a lot of code using println it
		 * will all go on its own line. print will print the text on the same line, so
		 * all the code will show up on the same line. On another note, if you attempt
		 * to print both string and integers, then the integers will be converted to
		 * string values as integers can be converted to string values but string values
		 * can not be converted to integers. Also, because the integers will convert to
		 * string values, they will not work in equations, unless the equation is
		 * surrounded by brackets.
		 */
	}

}
