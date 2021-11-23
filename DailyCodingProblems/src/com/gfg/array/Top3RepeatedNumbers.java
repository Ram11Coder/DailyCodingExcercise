package com.gfg.array;

import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array with repeated numbers, Find the top three repeated numbers.
 * 
 * input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
 * 
 * output: 3, 16, 15
 *
 */

class Pair {
	int first, second;
}

public class Top3RepeatedNumbers {
	/*
	 * Prerequiste -> Know how to find top 3 numbers
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 15, 16, 2, 3 };
		/*
		 * Use one method at a time then only we will get correct result because in
		 * bruteforce we manipulate the array, so the second method will produce the
		 * result based on previous array
		 */
		// bruteForce(arr);
		anotherApproach(arr);
	}

	private static void anotherApproach(int[] arr) {
		// Check for correct order of element

		if (arr.length < 3) {
			System.out.print("Invalid Input");
			return;
		}
		// Map<Integer, Integer> map = new HashMap<Integer, Integer>();//HashMap will
		// not maintain the order
		TreeMap<Integer, Integer> map = new TreeMap<>();// TreeMap will maintain the order
		for (int i = 0; i < arr.length; i++)
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);

		// Set<Entry<Integer, Integer>> entry = map.entrySet();
		Pair x = new Pair();
		Pair y = new Pair();
		Pair z = new Pair();
		// System.out.println(entry);
		x.first = y.first = z.first = Integer.MIN_VALUE;
		for (Map.Entry en : map.entrySet()) {
			if (Integer.parseInt(String.valueOf(en.getValue())) > x.first) {
				z.first = y.first;
				z.second = y.second;
				y.first = x.first;
				y.second = x.second;
				x.first = Integer.parseInt(String.valueOf(en.getValue()));
				x.second = Integer.parseInt(String.valueOf(en.getKey()));
			} else if (Integer.parseInt(String.valueOf(en.getValue())) > y.first) {
				z.first = y.first;
				z.second = y.second;
				y.first = Integer.parseInt(String.valueOf(en.getValue()));
				y.second = Integer.parseInt(String.valueOf(en.getKey()));
			} else if (Integer.parseInt(String.valueOf(en.getValue())) > z.first) {
				z.first = Integer.parseInt(String.valueOf(en.getValue()));
				z.second = Integer.parseInt(String.valueOf(en.getKey()));
			}
		}
		System.out.println(x.second + " " + y.second + " " + z.second);
	}

	private static void bruteForce(int[] arr) {
		Pair x = new Pair();
		Pair y = new Pair();
		Pair z = new Pair();

		x.first = y.first = z.first = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i], count = 1;
			if (arr[i] != -1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (temp == arr[j]) {
						count++;
						arr[j] = -1;
					}
				}

				if (count > x.first) {
					z.first = y.first;
					z.second = y.second;
					y.first = x.first;
					y.second = x.second;
					x.first = count;
					x.second = temp;
				} else if (count > y.first) {
					z.first = y.first;
					z.second = y.second;
					y.first = count;
					y.second = temp;
				} else if (count > z.first) {
					z.first = count;
					z.second = temp;
				}

			}

		}
		System.out.println(x.second + " " + y.second + " " + z.second);
	}

}
