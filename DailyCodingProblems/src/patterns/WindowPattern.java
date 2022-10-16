package patterns;

import java.util.Scanner;

/**
 * 
 *
Enter the number :
5
* * * * * 
*   *   * 
* * * * * 
*   *   * 
* * * * * 

 *  
 */


public class WindowPattern {
	static void evenCheck(int n, int i, int j) {
		if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == (n / 2) || j == (n / 2) || i == ((n / 2) - 1)
				|| j == ((n / 2) - 1))
			System.out.print("* ");
		else
			System.out.print("  ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (n % 2 == 0)
					evenCheck(n, i, j);
				else
					oddCheck(n, i, j);

			}
			System.out.println();
		}
		sc.close();
	}

	static void oddCheck(int n, int i, int j) {
		if (n % 2 == 1 && i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == (n / 2) || j == (n / 2))
			System.out.print("* ");
		else
			System.out.print("  ");

	}
}
