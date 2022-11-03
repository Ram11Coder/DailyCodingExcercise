package patterns;

import java.util.Scanner;

/*
n=5

    *
   ***
  *****
 *******
*********
 *******
  ***** 
   *** 
    *

*/
public class DiamondShapepattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 2 * n - 1;
		for (int i = 0; i < k; i++) {
			if (i < n) {
				for (int j = 0; j < n - i - 1; j++)
					System.out.print(" ");

				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print("*");

			} else {
				for (int j = n; j <= i; j++)
					System.out.print(" ");

				for (int j = k; j > 2 * (i - n + 1); j--)
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
