package binarysearch;

/**
 * The nth root of a number M is defined as a number X when raised to the power N equals M.
 * 
 * Example 1:
 * 
 * Input: N=3 M=27
 * 
 * Output: 3
 * 
 * Explanation: The cube root of 27 is 3. Example 2:
 * 
 * Input: N=2 M=16
 * 
 * Output: 4
 * 
 * Explanation: The square root of 16 is 4 Example 3:
 * 
 * Input: N=5 M=243
 * 
 * Output: 3
 * 
 * Explanation: The 5th root of 243 is 3
 *
 */
public class NthRootofaNumberUsingBS {
  public static void main(String[] args) {
    int m = 27, n = 3;
    getNthRoot(m, n);
  }

  /**
   * Time Complexity: N x log(M x 10^d)
   * 
   * Space Complexity: O(1)
   * 
   * @param m
   * @param n
   */
  private static void getNthRoot(int m, int n) {

    double low = 1;
    double high = m;
    double eps = 1e-7;


    while ((high - low) > eps) {
      double mid = (low + high) / 2.0;

      if (multiply(mid, n) > m) {
        high = mid;
      } else {
        low = mid;
      }
    }
    System.out.println(high);
    System.out.println(low);
    System.out.println(high - low);
    System.out.println(n + " th root of " + m + " is " + low);

    // System.out.println(Math.pow(m, 1.0 / n));
  }

  private static double multiply(double mid, int n) {
    double ans = 1.0;
    for (int i = 0; i < n; i++) {
      ans *= mid;
    }
    return ans;
  }
}

