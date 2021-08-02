package com.gfg.array;

public class MaximumOf3 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int first_max = 0, second_max = 0, third_max = 0;
		for (int i : arr) {
			if (i > first_max) {
				third_max = second_max;
				second_max = first_max;
			
				first_max=i;
				

			}
		}
		System.out.println("first_max is - "+first_max+" "+" second_max max is - "+second_max+"third_max is - "+third_max);
	}
}
