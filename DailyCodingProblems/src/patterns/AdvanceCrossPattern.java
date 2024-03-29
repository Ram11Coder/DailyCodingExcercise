package patterns;

import java.util.Scanner;

/**

5

*   *   *
 * * * * 
  *   *  
 * * * * 
*   *   *

*
*/

public class AdvanceCrossPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//input should be greater than 2, to get the correct pattern
		int n = sc.nextInt();
		if (n <= 2) {
			System.out.println("Please enter the value greater than 2");
			sc.close();
			return;
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {
				if (j == i || j == n - i - 1 || j == n + i - 1  || j == 2 * n - i - 2 )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		sc.close();
	}
}
