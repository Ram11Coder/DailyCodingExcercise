package patterns;

public class DoublesideStaircase {

	public static void main(String[] args) {
		int n = 10, c = 1;

		approach1(n, c);
		approach2(n / 2);
	}

	private static void approach2(int n) {
		for (int i = 1, c = 0; i <= 2 * n; i++) {

			for (int j = 0; j < n - c - 1; j++)
				System.out.print(" ");

			for (int k = 0; k <= c; k++)
				System.out.print("**");

			if (i % 2 == 0)
				c++;
			System.out.println();
		}

	}

	private static void approach1(int n, int c) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n / 2 - c; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * c; j++) {
				System.out.print("*");
			}
			if (i % 2 == 0)
				c++;
			System.out.println();

		}
	}

}
