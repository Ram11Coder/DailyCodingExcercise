package array;

import java.util.Scanner;

public class MInMax {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size-->");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		print(arr);
		// min_max(arr);
		inbuilt_minmax(arr);
	//	recursive_minMax(arr);
		sc.close();
	}

//	private static void recursive_minMax(int[] arr,int n) {
//		return (n==1)
//		
//	}

	private static void inbuilt_minmax(int[] arr) {
		int max_val = arr[0], min_val = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max_val = Math.max(max_val, arr[i]);
			min_val = Math.min(min_val, arr[i]);
		}
		 System.out.println("MAX val - " + max_val + ", MIN val - " + min_val);
	}

	private static void min_max(int[] arr) {
		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			// (arr[i]<min)?min=arr[i]:;
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min val -" + min + "Max value -" + max);

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]->%d\n", i, arr[i]);
	}
}
