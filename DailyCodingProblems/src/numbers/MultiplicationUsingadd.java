package numbers;

import java.util.Scanner;

public class MultiplicationUsingadd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number one");
		int a = sc.nextInt();
		System.out.println("Enter the number Two");
		int b = sc.nextInt();
		int sum = 0;
		int min = (a < b) ? a : b, max = (a > b) ? a : b;

		for (int i = min; i > 0; i--) {
			sum += max;
		}
		System.out.println(sum);
		sc.close();
	}
}
