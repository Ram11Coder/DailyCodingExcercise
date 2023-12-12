package matrix;

/**
 * 
 * 
 * 
 * n =5
 * 
1  2  3  4  5 
17 18 19 20 6 
16 26 27 21 7 
15 25 23 22 8 
14 12 11 10 9 

 *
 */
public class SpiralNumberPattern {
  public static void main(String[] args) {

    int n = 5;
    int top = n - 1, left = 0, c = 1;
    int[][] matrix = new int[n][n];
    for (int i = 0; i <= n / 2; i++, top--, left++) {

      // Moving Left to Right
      for (int j = left; j <= top; j++,c++) {
        matrix[left][j] = c;
      }
      // Moving top to Bottom
      for (int j = left + 1; j <= top; j++,c++) {
        matrix[j][top] = c;
      }
      // Moving Right to Left
      for (int j = top-1; j >= left; j--,c++) {
        matrix[top][j] = c;
      }
      // Moving Bottom to Up
      for (int j = top; j >= left + 1; j--,c++) {
        matrix[j][left] = c;
      }

    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
