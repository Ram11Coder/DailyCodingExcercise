package array;

import java.util.Arrays;

public class FindMissingAndRepeatingElement {
  public static void main(String[] args) {


    int arr[] = {1, 2, 3, 4, 5, 4};
    // Approach 1
    usingSorting(arr);
    // Approach 2 - Using hash
    usingHash(arr);
    // Approach 3
    usingMathForumlas(arr);
    // Approach 4
    getTwoElements(arr, arr.length);

  }

  /**
   * TC -O(n*logn)
   * 
   * SC -O(1)
   */
  private static void usingSorting(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int sumofN = n * (n + 1) / 2, missingNumber = 0, repeatingNumber = 0;;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        repeatingNumber = arr[i];
        continue;
      }
      sumofN -= arr[i];
    }
    missingNumber = sumofN - arr[n - 1];
    System.out
        .println("Missing number - " + missingNumber + ", Repeating Number - " + repeatingNumber);

  }

  /**
   * MissingNumber - x
   * 
   * ExpectedNumber - y
   * 
   * n= legth of array (6)
   * 
   * Formula : n * (n + 1) /2
   * 
   * sum of n natural numbers=21
   *
   * sum of numbers in array =17
   * 
   * x-y = (sum of n natural numbers - sum of numbers in array)
   *
   * x-y = 4
   * 
   * Formula : (n * (n + 1) * (2 * n + 1)) / 6
   *
   * sum of square of n natural numbers = 91
   *
   * sum of square of numbers in array = 67
   *
   * x2-y2 = (sum of square of n natural numbers - sum of square of numbers in array)
   * 
   * x2-y2=24
   * 
   * x2-y2 =(x-y)(x+y)
   * 
   * x+y = x2-y2 / x-y
   * 
   * x+y = 24/4
   * 
   * x+y =6
   * 
   * (x+y) + (x-y) => 2x
   * 
   * x=(x+y) +( x-y)/ 2
   * 
   * x= (6+4)/2 => 5
   * 
   * Substitute the value in x+y =6
   * 
   * 5+y=6
   * 
   * y=6-5
   * 
   * y=1
   * 
   * 
   * TC - O(n) SC - O(1)
   * 
   * using square of number we have some limitation
   *
   */

  private static void usingMathForumlas(int[] arr) {
    int n = arr.length;
    // Sum of n natural numbers
    int sumOfN = (n * (n + 1)) / 2;
    // sum of square of n natural numbers
    int squareOfsumN = (n * (n + 1) * (2 * n + 1)) / 6;

    int missingNumber = 0, repeatingNumber = 0;

    for (int i = 0; i < arr.length; i++) {
      sumOfN -= arr[i];
      squareOfsumN -= (arr[i] * arr[i]);
    }
    int sumOfExpectedAndMissingNumber = squareOfsumN / sumOfN;

    missingNumber = (sumOfExpectedAndMissingNumber + sumOfN) / 2;
    repeatingNumber = Math.abs(missingNumber - sumOfN);

    System.out
        .println("Missing number - " + missingNumber + ", Repeating Number - " + repeatingNumber);
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static void usingHash(int[] arr) {
    int n = arr.length;
    int freq[] = new int[n + 1];
    for (int i = 0; i < n; i++) {
      freq[arr[i]]++;
    }

    int repeatingNumber = 0, missingNumber = 0;
    for (int i = 1; i < freq.length; i++) {
      if (freq[i] > 1)
        repeatingNumber = i;

      if (freq[i] == 0)
        missingNumber = i;
    }
    System.out
        .println("Missing number - " + missingNumber + ", Repeating Number - " + repeatingNumber);
  }


  /**
   * TC -O(n)
   * 
   * SC -O(1)
   */
  static void getTwoElements(int arr[], int n) {
    /*
     * Will hold xor of all elements and numbers from 1 to n
     */
    int xor1;

    /* Will have only single set bit of xor1 */
    int set_bit_no;

    int i, x = 0, y = 0;

    xor1 = arr[0];

    /* Get the xor of all array elements */
    for (i = 1; i < n; i++)
      xor1 = xor1 ^ arr[i];

    /*
     * XOR the previous result with numbers from 1 to n
     */
    for (i = 1; i <= n; i++)
      xor1 = xor1 ^ i;

    /* Get the rightmost set bit in set_bit_no */
    set_bit_no = xor1 & ~(xor1 - 1);

    /*
     * Now divide elements into two sets by comparing rightmost set bit of xor1 with the bit at the
     * same position in each element. Also, get XORs of two sets. The two XORs are the output
     * elements. The following two for loops serve the purpose
     */
    for (i = 0; i < n; i++) {
      if ((arr[i] & set_bit_no) != 0)
        /* arr[i] belongs to first set */
        x = x ^ arr[i];

      else
        /* arr[i] belongs to second set */
        y = y ^ arr[i];
    }
    for (i = 1; i <= n; i++) {
      if ((i & set_bit_no) != 0)
        /* i belongs to first set */
        x = x ^ i;

      else
        /* i belongs to second set */
        y = y ^ i;
    }

    // at last do a linear check which amont x and y is missing or repeating

    /* *x and *y hold the desired output elements */
    
    System.out
    .println("Missing number - " + x + ", Repeating Number - " + y);
  }
}
