package bases;

public class ConversionTable {

	public static void main(String[] args) {
		for (int i = 0; i < 256; ++i) {
			System.out.println(
					i + " decimal = " + Integer.toBinaryString(i) + " binary = " + Integer.toHexString(i) + " hex");
		}
	}

}
