package dynamicprogramming;

import java.util.Arrays;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
  public static void main(String[] args) {

    int n = 4;
    // bruteforce
    System.out.println(bruteforce(n));

    // Memorization
    int dp[] = new int[n + 1];
    System.out.println(memorization(n, dp));
    // System.out.println(Arrays.toString(dp));

    // Tabulation
    System.out.println(tabulation(n));

    // space optimisation
    System.out.println(optimal(n));

  }



  /**
   * Top down approach (n to 0)
   * 
   * TC - 2^n
   * 
   * SC - O(n)
   * 
   * @param n
   * @return
   */
  private static int bruteforce(int n) {
    if (n == 0)
      return 1;
    if (n == 1)
      return 1;
    int left = bruteforce(n - 1);
    int right = bruteforce(n - 2);

    return left + right;
  }

  /**
   * Top down approach (n to 0)
   * 
   * TC - O(n)
   * 
   * SC - O(n)+O(n)
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int memorization(int n, int[] dp) {
    if (n == 0 || n == 1)
      return 1;

    if (dp[n] != 0)
      return dp[n];
    int left = memorization(n - 1, dp);
    int right = memorization(n - 2, dp);

    return dp[n] = left + right;
  }


  /**
   * 
   * TC - O(n)
   * 
   * SC - O(n)
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int tabulation(int n) {
    int[] dp = new int[n + 1];

    // base case
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i < dp.length; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }


  /**
   * space optimization
   * 
   * TC - O(n)
   * 
   * SC - O(1)
   * 
   * @param n
   * @param dp
   * @return
   */
  private static int optimal(int n) {
    int prev2 = 1, prev1 = 1;
    int currIndex = -1;
    for (int i = 2; i <= n; i++) {
      currIndex = prev1 + prev2;
      prev2 = prev1;
      prev1 = currIndex;
    }
    return currIndex;
  }


}
