package com.gfg.matrix;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x. Eg :
 * Input {1, 2, 4, 3, 5, 6} SUM : 5 Output : 2 (1, 4) & (2, 3)
 *
 */
public class KeyPair {
	public static void main(String[] args) {
		int X = 5;
		int Arr[] = { 1, 2, 4, 3, 5, 6 };
		for (int i = 0; i < Arr.length - 1; i++) {
			for (int j = i+1; j < Arr.length ; j++) {
				if (X == Arr[i] + Arr[j]) {
					System.out.println("{" + Arr[i] + " , " + Arr[j ] + "}");
					break;
				}
			}
		}
	}
}
