package patterns;


// * * * * * * * *
// * * *   * * * *
// * *       * * *
// *           * *
// * *           *
// * * *       * *
// * * * *   * * *
// * * * * * * * *


public class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < n && j <= n - i - 1 || j
                        >= n + i - 1 || i >= n && j <= i - n + 1 || j >= size - 2 - (i - n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
