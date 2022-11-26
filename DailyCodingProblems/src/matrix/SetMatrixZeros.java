package matrix;

import java.util.Arrays;

public class SetMatrixZeros {
  public static void main(String[] args) {

    int[][] nums = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 0}, {0, 0, 0, 1}};

    // Approach 1 - BruteForce
    bruteForce(nums);
    // Approach 2 - BruteForce with space
    bruteForceWithExtraSpace(nums);
    // Approach 3 - Optimal approach without extra space
    optimal(nums);
  }

  /**
   * TC - O(2*(n*m ))
   * 
   * SC - O(1)
   * 
   */
  private static void optimal(int[][] nums) {
    int col0 = 0, row = nums.length, col = nums[0].length;

    for (int i = 0; i < row; i++) {
      if (nums[i][0] == 0)
        col0 = 0;
      for (int j = 1; j < col; j++) {
        if (nums[i][j] == 0) {
          nums[i][0] = nums[0][j] = 0;
        }
      }
    }


    for (int i = row - 1; i >= 0; i--) {
      for (int j = col - 1; j >= 1; j--) {
        if (nums[i][0] == 0 || nums[0][j] == 0)
          nums[i][j] = 0;
        if (col0 == 0)
          nums[i][0] = 0;
      }
    }
    System.out.println(Arrays.deepToString(nums));

  }

  /**
   * TC - O((n*m )+ (n+m))
   * 
   * SC - O(n)+O(m)
   * 
   */
  private static void bruteForceWithExtraSpace(int[][] nums) {

    int row[] = new int[nums.length];
    int col[] = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          row[i] = 0;
          col[j] = 0;
        }
      }
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (row[i] == 0 || col[j] == 0) {
          nums[i][j] = 0;
        }
      }
    }
    System.out.println(Arrays.deepToString(nums));
  }

  /**
   * TC - O((n*m )* (n+m))
   * 
   * SC - O(1)
   * 
   */
  private static void bruteForce(int[][] nums) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          setRowAndCol(nums, i, j);
        }
      }
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == -1) {
          nums[i][j] = 0;
        }
      }
    }
    System.out.println(Arrays.deepToString(nums));

  }

  private static void setRowAndCol(int[][] nums, int i, int j) {

    // Do not change the 0 to -1 because that affects some other row and col
    for (int k = 0; k < nums.length; k++) {
      if (nums[k][i] != 0)
        nums[k][i] = -1;
      if (nums[k][j] != 0)
        nums[k][j] = -1;
    }
  }
}
