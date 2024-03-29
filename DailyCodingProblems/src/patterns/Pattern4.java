package patterns;

import java.util.Scanner;
/*
 * 
 * 
 * 
 Enter the number : 5
 *  
 *      0 
 *     101 
 *    21012 
 *   3210123 
 *  432101234
 */


 
public class Pattern4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = sc.nextInt();
    System.out.println("Approach 1");
    approach1(n);

    System.out.println("\nApproach 2");
    approach2(n);
    sc.close();
  }

  private static void approach2(int n) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++)
        System.out.print(" ");
      for (int k = 0, m = i; k < 2 * i + 1; k++) {
        if (k < i)
          System.out.print(m--);
        else
          System.out.print(m++);
      }

      System.out.println();
    }
  }

  private static void approach1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        System.out.print(" ");
      }
      int num = 2 * i + 1, c = i;
      for (int k = 0; k < num; k++) {
        System.out.print(c);
        if (k < (num / 2))
          c--;
        else
          c++;
      }
      System.out.println();
    }
  }
}
