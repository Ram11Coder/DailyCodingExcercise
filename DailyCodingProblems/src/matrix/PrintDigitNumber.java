package matrix;

import java.util.Scanner;

public class PrintDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 10) {
			numberCheck(n);
		} else {
			while (n > 0) {
				numberCheck(n % 10);

				n /= 10;
			}

		}

	}

	private static void numberCheck(int n) {
		switch (n) {
		case 1:
			DigitOne();
			break;

		case 2:
			DigitTwo();
			break;
		case 3:
			DigitThree();
			break;
		case 4:
			DigitFour();
			break;
		case 5:
			DigitFive();
			break;
		case 6:
			DigitSix();
			break;
		case 7:
			DigitSeven();
			break;
		case 8:
			DigitEight();
			break;
		case 9:
			DigitNine();
			break;
		case 0:
			DigitZero();
			break;

		default:
			break;
		}

	}

	static void printDigi(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1)
				System.out.print(arr[i][j]);
				else 
					System.out.print(" ");

			}
			System.out.println();

		}
	}

	private static void DigitZero() {
		int[][] arr = { { 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0 } };
		printDigi(arr);
	}

	private static void DigitNine() {
		int[][] arr = { { 1, 1, 1, 0, 0 }, { 1, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0 } };
		printDigi(arr);
	}

	private static void DigitEight() {
		int[][] arr = { { 0, 1, 1, 1, 0 },
				{ 0, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 0, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 } };
		printDigi(arr);
	}

	private static void DigitSeven() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0 } };
		printDigi(arr);
	}

	private static void DigitFive() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, 
				{ 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1 }, 
				{ 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1 } };
		printDigi(arr);
	}

	private static void DigitSix() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		printDigi(arr);
	}

	private static void DigitFour() {
		int[][] arr = { { 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0 } };
		printDigi(arr);
	}

	private static void DigitThree() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		printDigi(arr);
	}

	private static void DigitTwo() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 0, 1, 1, 1, 1 } }; // TODO
		printDigi(arr); // Auto-generated
		// method
		// stub

	}

	private static void DigitOne() {
		int[][] arr = { { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 } };
		printDigi(arr);
	}
}
