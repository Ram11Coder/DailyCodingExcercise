package com.gfg.number;

/**
 * How to express the given number is sum of 2 prime number?
 *
 * input 34 
 * output (3,31),(5,29),(11,23),(17,17)
 */
public class SumOf2Primes {

	public static void main(String[] args) {
		int n = 34;
		solver(n);

	}

	private static void solver(int n) {

		for (int i = 2; i <= n / 2; i++)
			if (isPrime(i) && isPrime(n - i))
				System.out.println(n + " = " + i + "+" + (n - i));
	}

	private static boolean isPrime(int n) {

		boolean flag = true;

		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				flag = false;

		return flag;
	}

}
