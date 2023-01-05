package array;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/pascals-triangle/

/**
 * Types of pascal triangle
 * 
 * 1. given input print the pascal triangle
 * 
 *  ex: n= 5
 * 1 
 * 1 1 
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 
 * 2. Given row and position of triangle value
 *  ex: row - 5 pos - 2
 * o/p - 2
 * 
 * 3. Given input n print the row
 *  ex: n= 5
 *  
 * 1 4 6 4 1
 *
 */
public class PascalTriangle {
  public static void main(String[] args) {

    int n = 5;
    printPascalTriangal(n);
    printPascalRow(n);
    int m = 3;
    printpascalValue(n, m);
  }


  /**
   * Use the below formula to get the specific position
   *  n=5 r=2 
   *  
   *  5c2 
   *  
   *  (n-1)c(r-1)
   *  
   *   4c1 -> 4
   * 
   * 
   * @param n
   * @param m
   */
  private static void printpascalValue(int n, int r) {
    n = n - 1;
    r = r - 1;
    int upper = 1, lower = 1;
    for (int i = n; i >= n - r; i--, r--) {
      upper *= i;
      lower *= r;
    }
    System.out.println(upper / lower);
  }

  private static void printPascalRow(int n) {
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    int res = 1;
    for (int i = 0; i < n ; i++) {
      res *= (n - i);
      res /= (i + 1);
      result.add(res);
    }
    System.out.println(result);
  }

  private static void printPascalTriangal(int n) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < n; i++) {
      List<Integer> list = new ArrayList<Integer>();

      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          list.add(1);
        } else {
          list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }

      }
      result.add(list);

    }
    System.out.println(result);
  }
}
