package tictactoe;

public class SituationalWinCheck {

	public static void main(String[] args) {

		if (TM.equals("X") && BL.equals("X") && TL.equals("/")) {
			TL = "O";

		} else if (TL.equals("X") && MR.equals("X") && TR.equals("/")) {
			TR = "O";

		} else if (TR.equals("X") && BM.equals("X") && BR.equals("/")) {
			BR = "O";

		} else if (ML.equals("X") && BR.equals("X") && BL.equals("/")) {
			BL = "O";

		} else if (BL.equals("X") && TR.equals("X") && MR.equals("/")) {
			MR = "O";

		} else if (TL.equals("X") && ML.equals("/") && BR.equals("X")) {
			ML = "O";

		} else if (BL.equals("X") && MR.equals("X") && BR.equals("/")) {
			BR = "O";

		} else if (TL.equals("X") && BM.equals("X") && BL.equals("/")) {
			BL = "O";

		} else if (ML.equals("X") && TR.equals("X") && TL.equals("/")) {
			TL = "O";

		} else if (TM.equals("X") && BR.equals("X") && TR.equals("/")) {
			TR = "O";

		} else if (ML.equals("X") && TM.equals("X") && TL.equals("/")) {
			TL = "O";

		} else if (TM.equals("X") && MR.equals("X") && TR.equals("/")) {
			TR = "O";

		} else if (BM.equals("X") && MR.equals("X") && BR.equals("/")) {
			BR = "O";

		} else if (ML.equals("X") && BM.equals("X") && BL.equals("/")) {
			BL = "O";
		}

	}

}
