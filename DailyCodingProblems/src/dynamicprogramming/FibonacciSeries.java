package dynamicprogramming;

import java.util.Arrays;

public class FibonacciSeries {
  public static void main(String[] args) {

    int n = 5;
    int dp[] = new int[n + 1];
    Arrays.fill(dp, -1);

    System.out.println(memorisationApproach(n, dp));

    System.out.println(tabulationApproach(n, dp));

    System.out.println(optimalApproach(n));
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n)recursive space + O(n) extra array
   * 
   * Approach : memorization (From answer to base case - Top down approach)
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int memorisationApproach(int n, int dp[]) {

    if (n <= 1) {
      return n;
    }
    if (dp[n] != -1)
      return dp[n];

    return dp[n] = memorisationApproach(n - 1, dp) + memorisationApproach(n - 2, dp);
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n) extra array
   * 
   * Approach : tabulation (From base case to answer - bottom up approach)
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int tabulationApproach(int n, int dp[]) {

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i < n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  /**
   * TC - O(n)
   * 
   * SC - O(1)
   * 
   * Approach : space optimization approach
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int optimalApproach(int n) {
    int prev2 = 0, prev1 = 1;

    if (n == 0)
      return prev2;
    if (n == 1)
      return prev1;
    int currI = -1;
    for (int i = 2; i <= n; i++) {
      currI = prev2 + prev1;
      prev2 = prev1;
      prev1 = currI;
    }
    return currI;
  }
}
