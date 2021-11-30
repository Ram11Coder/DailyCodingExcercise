package recursion;

import java.util.Scanner;

/* Find the largest possible prime number with given no
Input
4691
Output:
9461
*/
public class FindLargestPrime {

	public static void main(String[] args) {
		System.out.println("Please enter the prime number :");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = Integer.parseInt(s);
		if (!isPrime(n)) {
			int res = primeChecker(s, 0, s.length() - 1, n);
			System.out.println("Large prime number for the given input is -> " + res);
		} else
			System.out.println("input is not a prime number!! ");

	}

	private static int primeChecker(String s, int l, int r, int n) {

		if (l == r) {
			return checkmaxPrime(s, n);
		} else {
			for (int i = l; i <= r; i++) {
				s = swap(s, l, i);
				n = primeChecker(s, l + 1, r, n);
				s = swap(s, l, i);
			}
		}
		return n;
	}

	private static int checkmaxPrime(String s, int max) {
		int n = Integer.parseInt(s);
		if (!isPrime(n))
			return (n >= max) ? n : max;

		return max;
	}

	private static boolean isPrime(int n) {

		for (int i = 2; i <= n / 4; i++)
			if (n % i == 0)
				return true;

		return false;
	}

	private static String swap(String s, int i, int r) {
		char[] carr = s.toCharArray();

		char temp = carr[i];
		carr[i] = carr[r];
		carr[r] = temp;

		return String.valueOf(carr);
	}
}
