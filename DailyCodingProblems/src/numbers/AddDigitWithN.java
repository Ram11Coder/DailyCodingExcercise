package numbers;

/**
 * adding a digit to all the digits of a number eg digit=4, number = 2875, o/p=
 * 612119
 *
 */
public class AddDigitWithN {
	public static void main(String[] args) {

		int digit = 4, n = 2875;
		// int len=String.valueOf(n).length();
		int len = (int) Math.log10(n);
		int l = (int) Math.pow(10, len), r;

		while (n > 0) {
			r = n / l;
			n = n - r * l;
			System.out.print(r + digit + " ");
			l /= 10;

		}

	}
}
