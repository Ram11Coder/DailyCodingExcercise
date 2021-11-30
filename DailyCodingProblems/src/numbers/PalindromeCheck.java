package numbers;

/**
 * 
 * Take a 2 or 3 digit input number, reverse it and add it to the original
 * number until the obtained number is a palindrome or 5 iterations are
 * completed. Input : n = 32 Output : 55 23 + 32 = 55 which is a palindrome.
 * Input : 39 Output : 363
 * 
 */
public class PalindromeCheck {

	public static void numberCheck(long n) {
		long rev_num = 0L;
		while (n <= 4294967295l) {
			rev_num = reverseNumber(n);
			n += rev_num;

			if (check_palindrome(n)) {
				System.out.println(" is a palindrome number");
				System.out.println("Palindrome number is "+n);

				break;
			}
			if (n > 4294967295l) {
				System.out.print(" is not palindome");
				break;
			}

		}
	}

	static boolean check_palindrome(long n) {

		if (n == reverseNumber(n))
			return true;

		return false;
	}

	private static long reverseNumber(long n) {
		long sum = 0;
		while (n > 0) {
			sum = sum * 10 + n % 10;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
      //case 1:195

		// case 2: 196
		long n = 195;
		System.out.print(n);
		numberCheck(n);

	}
}
