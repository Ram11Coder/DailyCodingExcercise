package com.gfg.array;

public class NumberOccurence {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 2, 2, 5, 8, 9, 8 };
		for (int i = 0; i < arr.length; i++) {
			int c = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != -1 && arr[i] == arr[j]) {
					arr[j] = -1;
					c++;
				}
			}
			if(arr[i]!=-1)
			System.out.println(arr[i] + "-" + c);
		}
	}
}
