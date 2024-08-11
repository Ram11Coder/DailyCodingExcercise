package patterns;
// *   *   *   *
// *   *   *   *
// * * * * * * *
// *           *
// *           *
// *           *
// * * * * * * *

public class Pattern14 {
    public static void main(String[] args) {
        int n = 7;
        int mid = n / 2 - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == mid || i == n - 1 || i < mid && j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
