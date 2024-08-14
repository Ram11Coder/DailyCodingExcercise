package patterns;


// *     *     *
// **   ***   **
// *** ***** ***
// *************
// *************
// *************
// *************

public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int size = 2 * n - 1;

        int space = (size - 3) / 2;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = 0; j <= i; j++)
                    System.out.print("*");

                for (int k = 0; k < space; k++)
                    System.out.print(" ");

                for (int j = 0; j < 2 * i + 1; j++)
                    System.out.print("*");

                for (int k = 0; k < space; k++)
                    System.out.print(" ");

                for (int j = 0; j <= i; j++)
                    System.out.print("*");

                space -= 2;
            } else {
                for (int l = 0; l < size; l++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
