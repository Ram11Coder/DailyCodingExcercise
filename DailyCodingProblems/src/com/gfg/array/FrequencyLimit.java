package com.gfg.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
 * 
 * Given an array A[] of N positive integers which can contain integers from 1
 * to P where elements can be repeated or can be absent from the array. Your
 * task is to count the frequency of all elements from 1 to N.
 * 
 * 
 * Example 1:
 * 
 * Input: N = 5 arr[] = {2, 3, 2, 3, 5} P = 5 Output: 0 2 2 0 1 Explanation:
 * Counting frequencies of each array element We have: 1 occurring 0 times. 2
 * occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1
 * time. Example 2:
 * 
 * Input: N = 4 arr[] = {3,3,3,3} P = 3 Output: 0 0 4 0 Explanation: Counting
 * frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0
 * times. 3 occurring 4 times. 4 occurring 0 times.
 * 
 * Your Task: Complete the function frequencycount() that takes the array and n
 * as input parameters and modify the array in place to denote the frequency
 * count of each element from 1 to N. i,e element at index 0 should represent
 * the frequency of 1 and so on.
 * 
 * 
 * Note: Can you solve this problem without using extra space (O(1) Space) !
 * 
 * 
 * Constraints: 1 ≤ N ≤ 105 1 ≤ P ≤ 4*104 1 <= A[i] <= P
 *
 * 
 */
public class FrequencyLimit {
//Solution is bit lengthy because of O(1) Space complexity
	public static void main(String[] args) {
		int arr[] = { 2, 3, 2, 3, 5, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1 };
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);
		int start = 1;
		int val = list.get(0), count = 0, i = 0;
		for (i = 0; i < list.size(); i++) {
			if (val == list.get(i)) {
				count++;
			} else {
				while (start < val) {
					System.out.print(0 + " ");
					start++;
				}
				start++;
				System.out.print(count + " ");
				val = list.get(i);
				count = 1;
			}
		}
		while (start < val) {
			System.out.print(0 + " ");
			start++;
		}
		System.out.print(count + " ");
		val = list.get(i - 1);
		count = 1;

		while (start < list.size()) {
			System.out.print(0 + " ");
			start++;
		}

	}

}
