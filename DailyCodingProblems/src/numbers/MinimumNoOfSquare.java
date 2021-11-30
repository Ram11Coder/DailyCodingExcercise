package numbers;

import java.util.Scanner;

/*
 * Find the minimum number of times required to represent a number as sum of squares.
12 = 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 
    1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 
12 = 2^2 + 2^2 + 2^2
12 = 3^2 + 1^2 + 1^2 + 1^2
 
Input: 12
Output: min: 3
*/
public class MinimumNoOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		int n;
		while (true) {
			System.out.println("Enter the number");
			n = sc.nextInt();
			if (primeChecker(n))
				solver(n);
			else
				System.out.println("Please Enter the composite number");
			System.out.println("Do you want to check some other number!! (Y/N)");
			ch = sc.next().charAt(0);
			if (!(ch == 'Y' || ch == 'y')) {
				System.out.println("Thankyou!!");
				break;
			}
		}

	}

	private static boolean primeChecker(int n) {
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return true;

		return false;
	}

	static void solver(int n) {
		int count = squareChecker(n);
		System.out.println("Minimum count -> " + count);
	}

	private static int squareChecker(int n) {
		int limit = n / 2, minCount = Integer.MAX_VALUE, checkerCount;
		System.out.println("Possible square scenerios");
		for (int i = limit; i >= 1; i--) {

			if ((i * i) == n)
				return 1;
			if (i * i < n) {

				checkerCount = checker(i, n);
				if (minCount > checkerCount)
					minCount = checkerCount;
			}
		}
		System.out.println();
		return minCount;
	}

	private static int checker(int i, int n) {
		int sqr, count = 0;
		while (n > 0) {

			sqr = i * i;
			n = n - (sqr);
			System.out.print(i + "^" + 2 + " ");

			if (n < sqr)
				i = sqrValuefinder(i, n);

			count++;
		}
		System.out.println();
		return count;
	}

	private static int sqrValuefinder(int i, int n) {
		while (n < (i * i)) {
			i--;
		}
		return i;
	}

}
