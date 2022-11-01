package patterns;

import java.util.Scanner;

public class Pattern5 {

/*

 Enter the number : 5

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1

 */

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	Bruteforce(n);

		// Optimal Solution
		solution(n);
		sc.close();
	}

	private static void Bruteforce(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");

			for (int k = 0; k <= i; k++)
				System.out.print(NCRFormula(i, k) + " ");

			System.out.println();
		}
	}

	static int NCRFormula(int n, int r) {
		return (fact(n) / (fact(n - r) * fact(r)));
	}

	static int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * fact(n - 1);
	}

	public static void solution(int num) {

		for (int n = 0; n < num; n++) {

			for (int i = 0; i < i - n - 1; i++)
				System.out.print(" ");

			int val = 1;
			for (int r = 0; r <= n; r++) {
				System.out.print(val + " ");
				val = val * (n - r) / (r + 1);
			}
			System.out.println();
		}
	}
}
