package com.gfg.number;

public class SquareNumbersInRanage {
	public static void main(String[] args) {
		int a = 20, b = 100;
int r=b/10;
		for (int i = a; i <= b; i++) {
			squareChecker(i,r);

		}
	}

	static void squareChecker(int i,int r) {

		for (int j = 2; j < r; j++) {
			if (j * j == i) {
				System.out.print(j*j+" ");
				break;
			} else if (j * j > i) {
				break;
			}

		}
	}
}
