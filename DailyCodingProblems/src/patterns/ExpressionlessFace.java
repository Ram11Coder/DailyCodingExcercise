package patterns;
/*
n=5
*_*****_*****_*
**_****_****_**
***_***_***_***
****_**_**_****
*****_*_*_*****

*/

public class ExpressionlessFace {
	public static void main(String[] args) {
		int n = 5;

		// firstApproach(n);
		betterApproach(n);
	}

	static void betterApproach(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 0, val = (n * 2) + 5; j < val; j++)
				System.out.print((j == i || j == val / 2 || j == val - i - 1) ? "_" : "*");
			System.out.println();
		}

	}

	private static void firstApproach(int n) {
		for (int i = 0; i < n; i++) {
			patten1(i);
			System.out.print("_");
			patten2(i, n);
			System.out.print("_");
			patten2(i, n);
			System.out.print("_");
			patten1(i);
			System.out.println();
		}

	}

	static void patten2(int i, int n) {
		for (int j = i; j < n; j++)
			System.out.print("*");
	}

	static void patten1(int i) {
		for (int j = 0; j <= i; j++)
			System.out.print("*");
	}
}
