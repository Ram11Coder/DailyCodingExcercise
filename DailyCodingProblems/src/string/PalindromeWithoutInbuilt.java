package string;

/**
 * Find whether the given number is palindrome or not.
 *  Don’t use arrays or strings
 */
public class PalindromeWithoutInbuilt {

	public static void main(String[] args) {
		System.out.println(palindrome(12321));
		System.out.println(palindrome(1221));
		System.out.println(palindrome(1321));
		System.out.println(palindrome(1));
		System.out.println(palindrome(22));
		System.out.println(palindrome(23));
		System.out.println(palindrome(0));
		System.out.println(palindrome(9));
	}

	private static boolean palindrome(int n) {
		// int len = String.valueOf(n).length();
		if (n >= 0 && n < 10)
			return true;

		int len = (int) (Math.log10(n) + 1);
		int start, end, i = 1;

		while (i < len) {
			start = (n / ((int) Math.pow(10, len - i)));
			end = n % 10;
			// System.out.println("Start " + start + " End " + end);
			if (start != end)
				return false;

			n = n % ((int) Math.pow(10, len - i));
			n = n / 10;
			i += 2;
		}
		return true;
	}

}
