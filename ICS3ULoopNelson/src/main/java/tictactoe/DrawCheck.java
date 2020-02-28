package tictactoe;

public class DrawCheck {

	int x;

	public static void main(String[] args) {
		DrawCheck dc = new DrawCheck();
		dc.meth1();
		dc.meth2();

	}

	private void meth1() {
		if (!TL.equals("/") && !TM.equals("/") && !TR.equals("/") && !ML.equals("/") && !MM.equals("/")
				&& !MR.equals("/") && !BL.equals("/") && !BM.equals("/") && !BR.equals("/")) {
			System.out.println("It's a draw! Good game!");
		}

		x = 5;
	}

	private void meth2() {
		System.out.println(x);
	}

}
