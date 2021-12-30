package recursion;

public class PrintPattern {
	public static void main(String[] args) {
		int n = 16;
		/**
		 * if number positive then subtract 5 if number negative or zero then add 5
		 * until reach n
		 */
		pattern(n, n, false);
	}

	private static void pattern(int n, int res, boolean flag) {
		if (n == res && flag) {
			System.out.print(res);
			return;
		}
		if (n > 0 && !flag) {
			System.out.print(n + " ");
			pattern(n - 5, res, flag);
		} else if (n <= 0 || flag) {
			flag = true;
			System.out.print(n + " ");
			pattern(n + 5, res, flag);
		}
	}
}
