package patterns;

import java.util.Scanner;

/*

Enter the number :
5
  *  
  *  
*****
  *  
  *  


*/

public class PlusPattern {
	// Better input odd number to get correct pattern
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == mid || i == mid)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
