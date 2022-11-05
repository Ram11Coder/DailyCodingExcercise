package patterns;

import java.util.Scanner;

/* Input : 4 
------4------
----4-3-4----
--4-3-2-3-4--
4-3-2-1-2-3-4
--4-3-2-3-4--
----4-3-4----
------4------*/
public class DashedPattern {
//Will optimize the code in future
	static void check(int n) {
		int k = 0, m = 2, val = 0, limit = 0;
//		if (n == 4) {
//			val = 1;
//		} else if (n > 4) {
//			val = (n - 3);
//		}
		val = (n == 4) ? 1 : (n - 3);
		limit = (3 * n) + val;
		for (int i = 0; i < (2 * n) - 1; i++) {
			int t = n;
			if (i <= n - 1) {

				for (int j = 0; j < limit; j++) {
					if (j >= (limit / 2) - k && j <= (limit / 2) + k) {

						if (j <= limit / 2) {
							System.out.print((j % 2 == 0) ? t-- : "-");
							if (j == limit / 2)
								t++;

						} else if (j > limit / 2) {
							System.out.print((j % 2 == 0) ? ++t : "-");
						}

					} else
						System.out.print("-");

				}
				System.out.println();
				k += 2;
			} else {
				t = n;
				for (int j = 0; j < limit; j++) {
					if (j >= m && j <= (limit) - m) {

						if (j <= limit / 2) {
							System.out.print((j % 2 == 0) ? t-- : "-");
							if (j == limit / 2)
								t++;

						} else if (j > limit / 2)
							System.out.print((j % 2 == 0) ? ++t : "-");

					} else
						System.out.print("-");
				}
				System.out.println();
				m += 2;
			}

		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			check(sc.nextInt());
		}
	}
}