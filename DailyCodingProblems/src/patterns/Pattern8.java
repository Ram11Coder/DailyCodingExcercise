package patterns;

// 1 2 3 4 *
// 1 2 3 * 5
// 1 2 * 4 5
// 1 * 3 4 5
// * 2 3 4 5

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print((j == n - (i - 1)) ? "*" : j);
            System.out.println();
        }
    }
}
