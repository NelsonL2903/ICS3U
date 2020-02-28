package tictactoe;

public class OpponentWinCheck {

	public static void main(String[] args) {
		
		if (TL.equals("X") && ML.equals("X") && BL.equals("/")) {
			BL = "O";
		} else if (TL.equals("/") && ML.equals("X") && BL.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && ML.equals("/") && BL.equals("X")) {
			ML = "O";
		
		} else if (TM.equals("X") && MM.equals("X") && BM.equals("/")) {
			BM = "O";
		} else if (TM.equals("/") && MM.equals("X") && BM.equals("X")) {
			TM = "O";
		} else if (TM.equals("X") && MM.equals("/") && BM.equals("X")) {
			MM = "O";
	
		} else if (TR.equals("X") && MR.equals("X") && BR.equals("/")) {
			BR = "O";
		} else if (TR.equals("/") && MR.equals("X") && BR.equals("X")) {
			TR = "O";
		} else if (TR.equals("X") && MR.equals("/") && BR.equals("X")) {
			MR = "O";
	
		
		
		} else if (TL.equals("X") && TM.equals("X") && TR.equals("/")) {
			TR = "O";
		} else if (TL.equals("/") && TM.equals("X") && TR.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && TM.equals("/") && TR.equals("X")) {
			TM = "O";
		
		} else if (ML.equals("X") && MM.equals("X") && MR.equals("/")) {
			MR = "O";
		} else if (ML.equals("/") && MM.equals("X") && MR.equals("X")) {
			ML = "O";
		} else if (ML.equals("X") && MM.equals("/") && MR.equals("X")) {
			MM = "O";
	
		} else if (BL.equals("X") && BM.equals("X") && BR.equals("/")) {
			BR = "O";
		} else if (BL.equals("/") && BM.equals("X") && BR.equals("X")) {
			BL = "O";
		} else if (BL.equals("X") && BM.equals("/") && BR.equals("X")) {
			BM = "O";
		
		
		
		} else if (TL.equals("X") && MM.equals("X") && BR.equals("/")) {
			BR = "O";
		} else if (TL.equals("/") && MM.equals("X") && BR.equals("X")) {
			TL = "O";
		} else if (TL.equals("X") && MM.equals("/") && BR.equals("X")) {
			MM = "O";
		
		} else if (BL.equals("X") && MM.equals("X") && TR.equals("/")) {
			TR = "O";
		} else if (BL.equals("/") && MM.equals("X") && TR.equals("X")) {
			BL = "O";
		} else if (BL.equals("X") && MM.equals("/") && TR.equals("X")) {
			MM = "O";
		}

	}

}
