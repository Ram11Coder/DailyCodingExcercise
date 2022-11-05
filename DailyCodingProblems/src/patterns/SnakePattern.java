package patterns;

/**
 * Given N. print the following snake pattern (say N = 4). condition: must not
 * use arrays ( 1D array or 2D array like Matrix ).
 * 
 * 1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13
 * 
 * 
 */
public class SnakePattern {
	public static void main(String[] args) {

		int n = 4, val = 0;
		firstApproach(n, val);
		System.out.println();
		secondApproach(n, val);

	}

	private static void secondApproach(int n, int val) {

		for (int i = 1; i <= 4; i++) {
			if (i != 1)
				val += n;
			for (int j = 1; j <= 4; j++) {
				if (i % 2 == 1)
					System.out.print(++val + " ");
				else
					System.out.print(val-- + " ");
			}
			System.out.println();
		}

	}

	private static void firstApproach(int n, int val) {

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {

				for (int j = 1; j <= n; j++) {
					System.out.print(++val + " ");
				}
			} else {
				val += n;
				int t = val;
				for (int j = n; j >= 1; j--)
					System.out.print(t-- + " ");
			}
			System.out.println();
		}
	}
}
