package numbers;

import java.util.Scanner;

public class NumberTrick {
	public static void main(String[] args) {
		System.out.println("Imagine number between 1 - 100");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Module of number with 3 and tell me the remainder");
		int n = sc.nextInt();
		sum += 70 * n;
		System.out.println("Module of number with  5 and tell me the remainder");
		n = sc.nextInt();
		sum += (21 * n);
		System.out.println("Module of number with  7 and tell me the remainder");
		n = sc.nextInt();
		sum += (15 * n);
		if (sum > 100) {
			System.out.println("Boom!! Number is " + (sum % (3 * 5 * 7)));
		} else {
			System.out.println("Boom!! Number is " + sum);
		}
	}
}
