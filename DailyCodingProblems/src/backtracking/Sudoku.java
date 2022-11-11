package backtracking;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * Given a 9×9 sudoku we have to evaluate it for its correctness. We have to check both the sub
 * matrix correctness and the whole sudoku correctness.
 *
 */
public class Sudoku {
  public static void main(String[] args) {

    char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

    solver(board);
    System.out.println(Arrays.deepToString(board));
    // Arrays.asList(board).stream().forEach( e -> System.out.println(e));
  }

  private static boolean solver(char[][] board) {

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {

        if (board[i][j] == '.') {
          for (char c = '1'; c <= '9'; c++) {
            if (isVaild(board, i, j, c)) {
              board[i][j] = c;
              if (solver(board))
                return true;
              else
                board[i][j] = '.';
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isVaild(char[][] board, int r, int c, char ch) {

    for (int i = 0; i < 9; i++) {
      // row check
      if (board[r][i] == ch)
        return false;

      // column check
      if (board[i][c] == ch)
        return false;

      if (board[3 * (r / 3) + i / 3][3 * (c / 3) + i / 3] == ch)
        return false;
    }
    return true;
  }
}
