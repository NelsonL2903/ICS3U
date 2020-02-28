package tictactoe;

public class PersonalWinCheck {

	public static void main(String[] args) {

		if (TL.equals("O") && ML.equals("O") && BL.equals("/")) {
			BL = "O";
		} else if (TL.equals("/") && ML.equals("O") && BL.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && ML.equals("/") && BL.equals("O")) {
			ML = "O";
		
		} else if (TM.equals("O") && MM.equals("O") && BM.equals("/")) {
			BM = "O";
		} else if (TM.equals("/") && MM.equals("O") && BM.equals("O")) {
			TM = "O";
		} else if (TM.equals("O") && MM.equals("/") && BM.equals("O")) {
			MM = "O";
	
		} else if (TR.equals("O") && MR.equals("O") && BR.equals("/")) {
			BR = "O";
		} else if (TR.equals("/") && MR.equals("O") && BR.equals("O")) {
			TR = "O";
		} else if (TR.equals("O") && MR.equals("/") && BR.equals("O")) {
			MR = "O";
	
		
		
		} else if (TL.equals("O") && TM.equals("O") && TR.equals("/")) {
			TR = "O";
		} else if (TL.equals("/") && TM.equals("O") && TR.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && TM.equals("/") && TR.equals("O")) {
			TM = "O";
		
		} else if (ML.equals("O") && MM.equals("O") && MR.equals("/")) {
			MR = "O";
		} else if (ML.equals("/") && MM.equals("O") && MR.equals("O")) {
			ML = "O";
		} else if (ML.equals("O") && MM.equals("/") && MR.equals("O")) {
			MM = "O";
	
		} else if (BL.equals("O") && BM.equals("O") && BR.equals("/")) {
			BR = "O";
		} else if (BL.equals("/") && BM.equals("O") && BR.equals("O")) {
			BL = "O";
		} else if (BL.equals("O") && BM.equals("/") && BR.equals("O")) {
			BM = "O";
		
		
		
		} else if (TL.equals("O") && MM.equals("O") && BR.equals("/")) {
			BR = "O";
		} else if (TL.equals("/") && MM.equals("O") && BR.equals("O")) {
			TL = "O";
		} else if (TL.equals("O") && MM.equals("/") && BR.equals("O")) {
			MM = "O";
		
		} else if (BL.equals("O") && MM.equals("O") && TR.equals("/")) {
			TR = "O";
		} else if (BL.equals("/") && MM.equals("O") && TR.equals("O")) {
			BL = "O";
		} else if (BL.equals("O") && MM.equals("/") && TR.equals("O")) {
			MM = "O";
		
	}

}
