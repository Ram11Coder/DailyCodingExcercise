package numbers;

import java.util.Arrays;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/next-greater-even-number0828/1
/**
 * 
 * Next Greater Even Number Given a positive integer X. The task is to find the
 * smallest even number E such that E > X and all digits in X and E are same.
 * Note: All the digits in X should be same with digits in E.
 * 
 * Example 1:
 * 
 * Input: X = 34722641 Output: 34724126 Explanation: Next greater number with
 * same digits as in input is 34724126.
 * 
 * Example 2: Input: X = 111 Output: -1 Explanation: You can't rearrange the
 * digits to get an answer.
 * 
 * Your Task: You don't need to read input or print anything. Your task is to
 * complete the function leftIndex() which takes a string X as inputs, which is
 * representing the number and returns the required smallest even number. If no
 * such even number exists return -1.
 * 
 * Expected Time Complexity: O(Log(N)! ) Expected Auxiliary Space: O(Log(N))
 * 
 * Constraints: 1 ≤ N ≤ 10^9
 *
 */
public class NextGreaterEvenNumber {
//Note : Working on optimization of code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(solver(n));
	}

	private static int solver(String n) {
		if (isAllNumberSame(n)) {
			return -1;
		}
		int num = Integer.parseInt(n);
		long limit = getPossibleLargeNumber(n);
		int start = (num % 2 == 0) ? num + 2 : num + 1;
		while (start < limit) {
			if (CheckSame(num + "", start + ""))
				return start;
			start += 2;
		}
		return -1;
	}

	private static boolean CheckSame(String s1, String s2) {
		int a1[] = getSortedArray(s1);
		int a2[] = getSortedArray(s2);
		for (int i = 0; i < a1.length; i++)
			if (a1[i] != a2[i])
				return false;
		return true;
	}

	private static boolean isAllNumberSame(String n) {
		String s[] = n.split("");

		for (int i = 0; i < s.length - 1; i++)
			if (!s[i].equals(s[i + 1]))
				return false;
		return true;
	}

	public static int[] getSortedArray(String n) {
		int arr[] = new int[n.length()];
		String s[] = n.split("");
		for (int i = 0; i < s.length; i++)
			arr[i] = Integer.parseInt(s[i]);

		Arrays.sort(arr);
		return arr;
	}

	private static long getPossibleLargeNumber(String n) {
		int arr[] = new int[n.length()];
		String s[] = n.split("");
		for (int i = 0; i < s.length; i++)
			arr[i] = Integer.parseInt(s[i]);

		Arrays.sort(arr);
		reverse(arr);
		// Conventional way of converting int array to integer
		int c = arr.length - 1;
		long sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + (arr[i] * ((int) Math.pow(10, c--)));

		// System.out.println(sum);
		return sum;
	}

	private static void reverse(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
