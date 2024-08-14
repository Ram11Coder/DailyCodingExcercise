package patterns;


//   *   *   *
// *   *   *   *
//   *   *   *
// *   *   *   *
//   *   *   *
// *   *   *   *
//   *   *   *

public class Pattern16 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0)
                    System.out.print((j % 2 == 0) ? " " : " *");
                else
                    System.out.print((j % 2 != 0) ? " " : "* ");
            }
            System.out.println();
        }
    }
}
