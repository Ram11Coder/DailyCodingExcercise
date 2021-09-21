package com.gfg.number;

import java.util.Scanner;

/*
 * refernce :https://www.geeksforgeeks.org/cyclic-number/
 * 
 * Restriction :
 * 
 * Single digits, e.g.: 5
 *  Repeated digits,e.g.: 555
 *   Repeated cyclic numbers, e.g.: 142857142857
 *
 *  case 1: 142857 
 *  142857 is a cyclic number
 *   
 *   Explanation
 * 142857 × 1 = 142857 
 * 142857 × 2 = 285714 
 * 142857 × 3 = 428571 
 * 142857 × 4 =571428
 * 142857 × 5 = 714285 
 * 142857 × 6 = 857142
 * 
 * case 2:123456
 * 
 * 123456 is not a cyclic number
 * 
 * Another approach: store the combination of values in array and check the values
 * 
 */
public class CyclicNumberVerification {
//This code will be optimized in future

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		int c;
		System.out.println("Enter the number :");
		while (true) {

			n = sc.nextLong();
			c = count(n);
			if (!isRestrictedNumber(n, c))
				System.out.println("Enter the correct number");
			else
				break;
		}

		// initialBruteforceApproach(n, c);

	//	ImprovedApproach(n, c);// using array to store the repeated elements
		System.out.println(efficientApproach(n)?"Yes":"No");
		sc.close();
	}

	private static boolean isRestrictedNumber(long n, int c) {
		String s = String.valueOf(n);
		for (int i = 0; i < c - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				return true;
			}

		}
		return false;

	}

	private static int count(long n) {
		int c = 0;
		while (n > 0) {
			c++;
			n /= 10;
		}
		return c;
	}

	/*******************************
	 * Approach 1
	 *******************************/
	private static void initialBruteforceApproach(long n, int c) {
		if (isCyclic(n, c))
			System.out.println(n + " is a CyclicNumber");
		else
			System.out.println(n + " is not a CyclicNumber");

	}

	static boolean isCyclic(long n, int c) {
		for (int i = 2; i <= c; i++)
			if (!isCheck(i * n, c, n))
				return false;

		return true;
	}

	private static boolean isCheck(long l, int c, long n) {

		int count = c;
		while (count-- >= 1) {
			long k = reverseCheck(n, c);// checking the reverse number of given number
			if (l == k)
				return true;
			else
				n = k;
		}
		return false;
	}

	/*---------------------------------End---------------------------------------------------*/

	/*********************************
	 * Approach 2
	 *********************************/
	private static void ImprovedApproach(long n, int c) {
		long arr[] = new long[c];

		for (int i = 0; i < c; i++) {
			arr[i] = reverseCheck(n, c);
			n = arr[i];
			// System.out.println(arr[i]);
		}
		checkCyclicNumber(n, arr, c);
	}

	private static void checkCyclicNumber(long n, long[] arr, int c) {
		boolean flag = true;
		for (long i = 2; i <= c; i++) {
			if (!(flag = isCyclic(n * i, arr))) {
				System.out.println(n + " is not a cyclic number");
				break;
			}
		}
		if (flag == true)
			System.out.println(n + " is a cyclic number");
	}

	private static boolean isCyclic(long n, long[] arr) {

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == n)
				return true;

		return false;
	}
	/*---------------------------------End---------------------------------------------------*/

	private static long reverseCheck(long l, int c) {
		return (long) ((l % 10) * Math.pow(10, c - 1)) + (l / 10);

	}

	
	
	
	
	
	  static boolean efficientApproach(long N)
	    {
	        // Count digits and check if all
	        // digits are same
	        long num = N;
	        int count = 0;
	        int digit = (int)(num % 10);
	        boolean allSame = true;
	        while (num > 0) {
	            count++;
	            if (num % 10 != digit)
	                allSame = false;
	            num = num / 10;
	        }
	 
	        // If all digits are same, then
	        // not considered cyclic.
	        if (allSame == true)
	            return false;
	 
	        // If counts of digits is even and
	        // two halves are same, then the
	        // number is not considered cyclic.
	        if (count % 2 == 0) {
	            long halfPower = (long)Math.pow(10, count / 2);
	            long firstHalf = N % halfPower;
	            long secondHalf = N / halfPower;
	            if (firstHalf == secondHalf && efficientApproach(firstHalf))
	                return false;
	        }
	 
	        num = N;
	        while (true) {
	            // Following three lines generates a
	            // circular pirmutation of a number.
//	            long rem = num % 10;
//	            long div = num / 10;
	            num = reverseCheck(num, count);
	 
	            // If all the permutations are checked
	            // and we obtain original number exit
	            // from loop.
	            if (num == N)
	                break;
	 
	            if (num % N != 0)
	                return false;
	        }
	 
	        return true;
	    }

	
	
}
