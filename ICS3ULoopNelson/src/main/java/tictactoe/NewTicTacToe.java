package tictactoe;

import java.util.Scanner;

public class NewTicTacToe {

	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		NewTicTacToe gameboard = new NewTicTacToe();
		gameboard.printboard();
		System.out.println("Where would you like to play? For example: [0][2]");
		

	}

	public void printboard() {
		int[][] board = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
	}

}
