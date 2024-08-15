package patterns;

//         *
//       * * *
//     *   *   *
//   *     *     *
// * * * * * * * * *
//   *     *     *
//     *   *   *
//       * * *
//         *

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == n - 1 || j == n - 1 || (i < n && j == n - i - 1 || j == n + i - 1) || (i > n - 1 && j == i - n + 1 || j == size - (i - n) - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
