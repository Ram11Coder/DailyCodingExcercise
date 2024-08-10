package patterns;

//  * 1 * 2 *
//  3 * 4 * 5
//  * 6 * 7 *
//  8 * 9 *10
//  *11 *12 *

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++)
                    System.out.print((j % 2 == 1) ? num++ : "*");
            } else {
                for (int j = 0; j < n; j++)
                    System.out.print((j % 2 == 0) ? num++ : "*");
            }
            System.out.println();
        }
    }
}
