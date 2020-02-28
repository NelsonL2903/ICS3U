package tictactoe;

public class WinCheck {

	public static void main(String[] args) {

		if (TL.equals("X") && TM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("X")) {
			System.out.println("You have won!");
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("X") && ML.equals("X") && BL.equals("X")) {
			System.out.println("You have won!");
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("X")) {
			System.out.println("You have won!");
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("X") && MM.equals("X") && BR.equals("X")) {
			System.out.println("You have won!");
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("X")) {
			System.out.println("You have won!");

		} else if (TL.equals("O") && TM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");

		} else if (TL.equals("O") && ML.equals("O") && BL.equals("O")) {
			System.out.println("Computer has won!");
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("O")) {
			System.out.println("Computer has won!");
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");

		} else if (TL.equals("O") && MM.equals("O") && BR.equals("O")) {
			System.out.println("Computer has won!");
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("O")) {
			System.out.println("Computer has won!");
		}

	}

}
