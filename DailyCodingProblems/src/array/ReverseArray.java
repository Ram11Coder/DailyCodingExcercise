package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size-->");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		reverseArrWithInplace(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void reverseArrWithInplace(int[] arr) {
		int i = 0, j = arr.length - 1, temp;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
