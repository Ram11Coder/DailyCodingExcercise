package charpattern;

public class CharPattern {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int k = 1; k <= i; k++)
				System.out.print(c++);

			for (int k = 1; k <= i; k++)
				System.out.print(k);

			System.out.println();
		}

	}
}
