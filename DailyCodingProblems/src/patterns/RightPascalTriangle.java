package patterns;

import java.util.Scanner;

/*
 * 
 
n=5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
public class RightPascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Approach1(n);
		Approach2(n);
		sc.close();
	}

	private static void Approach1(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++)
					System.out.print("* ");
			} else {
				for (int j = 0; j <= (2 * n - 1) - i; j++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Approach2(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				for (int j = 0; j <= i; j++)
					System.out.print("* ");
			} else {
				for (int j = n; j > i - n + 1; j--)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
