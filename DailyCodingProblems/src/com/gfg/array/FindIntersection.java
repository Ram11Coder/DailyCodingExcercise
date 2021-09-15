package com.gfg.array;

import java.util.Arrays;

/* Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
Input
List 1: 1,3,4,5,6,8,9
List 2: 1, 5,8,9,2
 
Union: 1, 3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9,8,2
*/
public class FindIntersection {
	public static void main(String[] args) {
		int list1[] = { 1, 3, 4, 5, 6, 8, 9 }, list2[] = { 1, 5, 8, 9, 2 };
		System.out.println("Intersection :");
		findIntersection(list1, list2);
		System.out.println("\nExcept :");
		findExcept(list1, list2);
		System.out.println("\nUnion :");

		findUnion(list1, list2);
	}

	private static void findExcept(int[] list1, int[] list2) {
		for (int i : list1)
			if (i % 2 == 1)
				System.out.print(i + " ");

		for (int i : list2)
			if (i % 2 == 0)
				System.out.print(i + " ");

	}

	private static void findUnion(int[] list1, int[] list2) {
		int temp[] = list2;

		for (int i = 0; i < list1.length; i++) {
			int val = list1[i];
			System.out.print(list1[i] + " ");
			for (int j = 0; j < list2.length; j++) {
				if (val == list2[j]) {
					list2[j] = -1;
					break;
				}
			}
		}

		for (int i : list2)
			if (i != -1)
				System.out.print(i + " ");

	}

	private static void findIntersection(int[] list1, int[] list2) {
		int j = 0;
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] == list2[j]) {
				System.out.print(list2[j] + " ");
				j++;
			}
		}
	}
}
