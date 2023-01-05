package matrix;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/
public class RotateImage {
  public static void main(String[] args) {

    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    /**
     * Brute force - use extra 2D array store the result
     * 
     * TC - O(n^2)
     * 
     * SC - O(n^2)
     *
     */

    // Optimal
    rotateBy90(arr);
  }



  /**
   * TC - O(n^2)
   * 
   * 
   * SC - O(1)
   * 
   * @param arr
   */
  private static void rotateBy90(int[][] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr[i].length; j++) {
        if (i != j) {
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      int max = arr[i].length;
      for (int j = 0; j < max / 2; j++) {
        int temp = arr[i][max - j - 1];
        arr[i][max - j - 1] = arr[i][j];
        arr[i][j] = temp;
      }
    }

    System.out.println(Arrays.deepToString(arr));
  }
}
