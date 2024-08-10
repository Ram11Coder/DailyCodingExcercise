package patterns;

// * # # # # # #
// # # # # # * *
// * * * # # # #
// # # # * * * *
// * * * # # # #
// # # # # # * *
// * # # # # # #
public class Pattern11 {
    public static void main(String[] args) {
        int n = 7;
        int size = 1;
        boolean left = true;
        for (int i = 0; i < n; i++) {

            if (left) {
                for (int j = 0; j < n; j++)
                    System.out.print((j < size) ? "* " : "# ");

                left = false;
            } else {
                for (int j = 0; j < n; j++)
                    System.out.print((j < n - size) ? "# " : "* ");

                left = true;
            }
            if (i < n / 2)
                size++;
            else
                size--;
            System.out.println();
        }
    }
}
