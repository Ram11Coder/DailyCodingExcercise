package backtracking;

import java.util.ArrayList;
import java.util.List;

// N Queen problem
public class NQueen {

  public static void main(String[] args) {

    /**
     * Approach 1
     * 
     * Queen can move 8 direction 
     * Do we need to 8 direction ?
     * Ans: no because we placing one queen at one column only ,so
     * upper and lower direction of current column not required and
     * One column process only next column can process, so
     * right direction check is not required (right roe,rightUpper, rightLower)
     * 
     * Finally 8-5 => totally 3 direction we need to focus 
     * Iterating the whole left upper, left lower and left direction to check whether queen can be
     * placed
     * 
     */

    int n = 8;
    List<List<Character>> chessBoard = new ArrayList<>(4);
    for (int i = 0; i < n; i++) {
      chessBoard.add(new ArrayList<Character>());
      for (int j = 0; j < n; j++)
        chessBoard.get(i).add('.');
    }

 //   findNQueen_1(0, chessBoard, n);

    /*
     * Approach 2
     * 
     * Using the hash to replace isQueenPlaceable() method
     *
     */

    int[] leftRow = new int[n];
    int[] upperDiagonal = new int[2 * n - 1];
    int[] lowerDiagonal = new int[2 * n - 1];
    findNQueen_2(0, chessBoard, n, leftRow, upperDiagonal, lowerDiagonal);

  }

  private static void findNQueen_2(int col, List<List<Character>> chessBoard, int n, int[] leftRow,
      int[] upperDiagonal, int[] lowerDiagonal) {
    // Base case
    if (col == n) {
      chessBoard.forEach(e -> {
        e.forEach(System.out::print);
        System.out.println();
      });
      System.out.println();
      return;
    }
/**
 * leftRow:
 * Create a hash with n size to update the specific row to track it
 *  
   lowerDiagonal:
   formula : 
   Create 2*n-1 hash to track the lower diagonal
   when updating the queen , update the (row + col) position
   
   upperDiagonal:
   Create 2*n-1 hash to track the upper diagonal
   When updating the queen, update the (n - 1 + col - row) position 
 */
    for (int row = 0; row < n; row++) {

      if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0
          && upperDiagonal[n - 1 + col - row] == 0) {
        chessBoard.get(row).set(col, 'Q');
        leftRow[row] = 1;
        lowerDiagonal[row + col] = 1;
        upperDiagonal[n - 1 + col - row] = 1;
        findNQueen_2(col + 1, chessBoard, n, leftRow, upperDiagonal, lowerDiagonal);

        chessBoard.get(row).set(col, '.');
        leftRow[row] = 0;
        lowerDiagonal[row + col] = 0;
        upperDiagonal[n - 1 + col - row] = 0;
      }
    }

  }

  private static void findNQueen_1(int col, List<List<Character>> chessBoard, int n) {
    // Base case
    if (col == n) {
      chessBoard.forEach(e -> {
        e.forEach(System.out::print);
        System.out.println();
      });
      System.out.println();
      return;
    }
    // Iterating the column from 0 to N-1 to fill the queen
    for (int row = 0; row < n; row++) {
      if (isQueenPlaceable(row, col, chessBoard, n)) {
        // Update the current position to queen
        chessBoard.get(row).set(col, 'Q');
        findNQueen_1(col + 1, chessBoard, n);
        // Remove the queen, for backtracking
        chessBoard.get(row).set(col, '.');
      }

    }

  }

  private static boolean isQueenPlaceable(int row, int col, List<List<Character>> chessBoard,
      int n) {

    int tRow = row;
    int tCol = col;
    // Checking left direction


    while (col >= 0) {
      if (chessBoard.get(row).get(col) == 'Q')
        return false;
      col--;
    }

    row = tRow;
    col = tCol;
    // Checking left down diagonals direction
    while (col >= 0 && row < n) {
      if (chessBoard.get(row).get(col) == 'Q')
        return false;
      col--;
      row++;
    }


    row = tRow;
    col = tCol;
    // Checking left up diagonals direction
    while (col >= 0 && row >= 0) {
      if (chessBoard.get(row).get(col) == 'Q')
        return false;
      col--;
      row--;
    }


    return true;
  }
}
