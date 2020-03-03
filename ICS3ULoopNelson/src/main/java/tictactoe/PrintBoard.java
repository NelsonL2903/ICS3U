package tictactoe;

public class PrintBoard {

	private final int horizontalCharacters = 19;
	private final String horizontalChar = "-";
	private final String verticalChar = "|";
	private final int boardWidth = 3;
	private final int boardHeight = 3;
	private final int spacesInSquare = 5;

	public static void main(String[] args) {
		PrintBoard printBoard = new PrintBoard();
		printBoard.print();
	}

	/*
	 * print out a tic tac toe board
	 */
	private void print() {
		// call horizontalLine() and verticalLine() as appropriate
		for (int i = 0; i < boardHeight; ++i) {
			horizontalLine();
			verticalLine();
		}
		horizontalLine();
	}

	/*
	 * print out the horizontal line for one row of the tictactoe board
	 */
	private void horizontalLine() {
		// make use of the variable horizontalCharacters and horizontalChar
		for (int i = 0; i < horizontalCharacters; ++i) {
			System.out.print(horizontalChar);
		}
		System.out.println(" ");
	}

	/*
	 * print out the vertical line for one row of the tictactoe board
	 */
	private void verticalLine() {
		// make use of the variable boardWidth, verticalChar, and spacesInSquare
		for (int i = 0; i <= boardWidth; ++i) {
			System.out.print(verticalChar);
			for (int j = 0; j < spacesInSquare; ++j) {
				System.out.print(" ");

			}
		}
		System.out.println(" ");
	}

}
