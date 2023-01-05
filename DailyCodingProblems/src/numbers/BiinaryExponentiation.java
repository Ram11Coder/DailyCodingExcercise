package numbers;
// https://leetcode.com/problems/powx-n/

public class BiinaryExponentiation {
  public static void main(String[] args) {
    /*
     * Input: x = 2.10000, n = 3 Output: 9.26100
     */

    double x = 2.10000;
    int n = 3;
    // Bruteforce - iterate the x in n time

    // optimal
    System.out.printf("%f", pow(x, n));
  }


  /**
   * TC - O(logN)
   * 
   * SC - O(1)
   * 
   * @param x
   * @param n
   * @return
   */
  private static double pow(double x, int n) {

    double ans = 1.0;
    // Handling overflow because of storing value in long , overflow occurs when n is greater than
    // Integer.MAXVALUE
    long nn = n;
    if (nn < 0)
      nn = -1 * nn;

    while (nn > 0) {
      if (nn % 2 == 1) {

        ans = ans * x;
        nn = nn - 1;
      } else {
        x = x * x;
        nn = nn / 2;
      }
    }
    // check the n is negative
    if (n < 0)
      ans = ans * -1.0;

    return ans;
  }

}

