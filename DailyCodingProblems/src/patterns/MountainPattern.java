package patterns;

import java.util.Scanner;
/*
 * 
 
n=5


	*        *        *        *        *
   ***      ***      ***      ***      ***
  *****    *****    *****    *****    *****
 *******  *******  *******  *******  *******
*********************************************

*/

public class MountainPattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		for (int i = 0; i < n; i++) {

			for (int c = 0; c < n; c++) {
				if (c == 0) {
					for (j = 0; j < n - 1 - i; j++)
						System.out.print(" ");
				} else {
					for (int j1 = 0; j1 < 2 * j; j1++)
						System.out.print(" ");
				}
				for (int k = 0; k < 2 * i + 1; k++)
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
