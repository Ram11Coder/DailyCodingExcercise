package dynamicprogramming;

import java.util.Arrays;

public class FibonacciSeries {
	public static void main(String[] args) {

		int n = 15;

		System.out.println(recursiveSolution(n));
		System.out.println(memorization(n));
		System.out.println(tabulation(n));
		System.out.println(spaceOptimisation(n));
	}

	/**
	 * TC - O(2^N)
	 * 
	 * SC - O(2^N)
	 * 
	 * @param n
	 * @return
	 */
	private static int recursiveSolution(int n) {

		return f(n);
	}

	private static int f(int n) {
		if (n == 1)
			return 1;
		if (n <= 1)
			return 0;

		return f(n - 1) + f(n - 2);
	}

	/**
	 * TC - O(N)
	 * 
	 * SC - O(1)
	 * 
	 * @param n
	 * @return
	 */
	private static int spaceOptimisation(int n) {
		int prev = 1, prev2 = 0, curr = 0;
		for (int i = 2; i <= n; i++) {
			curr = prev + prev2;
			prev2 = prev;
			prev = curr;
		}
		return curr;
	}

	/**
	 * TC - O(N)
	 * 
	 * SC - O(N)
	 * 
	 * @param n
	 * @return
	 */
	private static int tabulation(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}

	/**
	 * TC - O(N)
	 * 
	 * SC - O(N+N)
	 * 
	 * @param n
	 * @return
	 */
	private static int memorization(int n) {
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		return mem(n, dp);
	}

	private static int mem(int n, int[] dp) {
		if (n < 1) {
			return 0;
		}
		if (n == 1)
			return 1;
		if (dp[n] != -1)
			return dp[n];
		return dp[n] = mem(n - 1, dp) + mem(n - 2, dp);
	}
}
