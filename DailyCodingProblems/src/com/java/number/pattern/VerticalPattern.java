package com.java.number.pattern;

/**
 * 
 * Write a program to print the below pattern
	for n = 6
	1	7	12	16	19	21
	2	8	13	17	20
	3	9	14	18	
	4	10	15
	5	11	
	6
 *
 */
public class VerticalPattern {

	public static void main(String[] args) {
		int n = 6, sum;

		for (int i = 1; i <= n; i++) {
			sum = i;
			for (int j = n; j >= i; j--) {
				System.out.print(sum + " ");
				sum = sum + j;

			}
			System.out.println();

		}
	}

}
