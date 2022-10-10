package patterns;

import java.util.Scanner;

/*

5

*   *
 * * 
  *  
 * * 
*   *


*/
public class CrossPattern {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pattern : ");
		int n = ScannerUtil.getScanner().nextInt();
		// printPattern(n);
		printPatternUpdate(n);
		ScannerUtil.close();
	}

	private static void printPatternUpdate(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((j == i || j == n - i - 1) ? "*" : " ");
			System.out.println();
		}
	}

	private static void printPattern(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
