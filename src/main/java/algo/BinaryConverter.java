package algo;

class BinaryConverter {

	public static String toBinaryString(int i) {
		char[] c = new char[8];
		int n = i, pos = 0;
		while (n > 1) {
			c[pos++] = (char) (n % 2);
			n = n / 2;
		}
		c[pos] = (char) n;
		return String.valueOf(c);
	}
}