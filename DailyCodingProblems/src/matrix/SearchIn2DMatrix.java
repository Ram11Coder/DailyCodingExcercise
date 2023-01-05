package matrix;

/**
 * Here 2 variation of problem from GFG and Leetcode
 * 
 * https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 * 
 * https://leetcode.com/problems/search-a-2d-matrix/
 * 
 */
public class SearchIn2DMatrix {
  public static void main(String[] args) {

    // Array sorted in both row and column wise
    int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    int x = 29;

    gfgSolution(arr, x);

    // Array sorted in linear wise
    int[][] arr1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    x = 30;
    leetcodeSolution(arr1, x);
  }

  /**
   * 
   * @param arr
   * @param x
   */
  private static boolean leetcodeSolution(int[][] arr, int x) {

    if (arr.length == 0)
      return false;


    int row = arr.length, col = arr[0].length;
    int i = 0, j = row * col - 1;

    while (i <= j) {
      int mid = (i + (j - i) / 2);
      if (arr[mid / col][mid % col] == x) {
        System.out.println("Element " + x + " found at (" + mid / col + "," + mid % col + ")");
        return true;
      }
      if (arr[mid / col][mid % col] < x)
        i = mid + 1;
      else
        j = mid - 1;
    }
    return false;
  }

  /**
   * TC - O(n+m)
   * 
   * SC - O(1)
   * 
   * @param arr
   * @param x
   * @return
   */
  private static boolean gfgSolution(int[][] arr, int x) {

    if (arr.length == 0)
      return false;


    int n = arr.length - 1, i = 0, j = n;
    while (i < n && j >= 0) {
      if (arr[i][j] == x) {
        System.out.println("Element " + x + " found at (" + i + "," + j + ")");
        return true;
      }
      if (arr[i][j] < x)
        i++;
      else
        j--;
    }

    return false;
  }

}
