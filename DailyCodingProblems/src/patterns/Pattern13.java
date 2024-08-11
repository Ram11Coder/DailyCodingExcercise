package patterns;

// *     * * * *
// *     *
// *     *
// * * * * * * *
//       *     *
//       *     *
// * * * *     *

public class Pattern13 {
    public static void main(String[] args) {
        int n = 7;
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid || i == 0 && j > mid || j == 0 && i < mid || i == n - 1 && j < mid || j == n - 1 && i > mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
