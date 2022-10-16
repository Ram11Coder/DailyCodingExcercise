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
		sc.close();
	}
}
