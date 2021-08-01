package com.gfg.number;

import java.util.Arrays;
import java.util.List;

/**
 * Input: Number of elements in set1: 4 Elements are: 9, 9, 9, 9 Number of
 * elements in set 2: 3 Elements are: 1,1,1 Output: 1, 0, 1, 1, 0 Input: Number
 * of elements in set1: 11 Elements are: 7,2,3,4,5,3,1,2,7,2,8 Number of
 * elements in set 2: 3 Elements are: 1,2,3 Output: 7,2,3,4,5,3,1,2,8,5,1
 *
 * 
 */
public class NumberAddition {

	public static void main(String[] args) {

		List<Integer> arr1 = Arrays.asList(9, 9, 9, 9, 9, 9, 9, 9);
		List<Integer> arr2 = Arrays.asList(8, 8, 8, 8, 8, 8);
		int sum = 0, carry = 0;
		int maxSize = (arr1.size() < arr2.size()) ? arr2.size() : arr1.size();
		int storeVal[] = new int[maxSize + 1];
		int j = arr1.size() - 1, size = storeVal.length - 1, i = arr2.size() - 1;


		while (i >= 0) {

			sum = carry + arr1.get(j--) + arr2.get(i--);
			//System.out.println("sum " + sum);
			if (sum > 9) {
				int r = sum % 10;
				carry = sum / 10;
				storeVal[size--] = r;
			} else {

				storeVal[size--] = carry + sum;
				carry = 0;
			}

		}

		while (j >= 0) {
			sum = carry + arr1.get(j--);
			if (sum > 9) {

				storeVal[size--] = sum % 10;
				carry = 1;
			} else {
				storeVal[size--] = sum % 10;
				carry = 0;
			}

		}

		storeVal[0] = carry;

		for (int k : storeVal) {
			
			System.out.print(k + " ");
		}
		

	}
}
