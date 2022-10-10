package patterns;

import java.util.Scanner;
/*
 
5
1
11
101
1001
10001

* 
 */

public class BinaryTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pattern ");
		int n = sc.nextInt();

		// patternPrint(n);
		patternPrintUpdated(n);
		sc.close();
	}

	private static void patternPrintUpdated(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print((j == 0 || j == i) ? 1 : 0);
			System.out.println();
		}
	}

	private static void patternPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				if (j == 0 || j == i)
					System.out.print(1);
				else
					System.out.print(0);

			System.out.println();
		}
	}
}
