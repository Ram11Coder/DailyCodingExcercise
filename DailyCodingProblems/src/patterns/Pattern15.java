package patterns;


// * * * * * * * * *
// *               *
// *   * * * * *   *
// *   *       *   *
// *   *   *   *   *
// *   *       *   *
// *   * * * * *   *
// *               *
// * * * * * * * * *


public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int size = n * 2 - 1;
        int pos = size;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == pos - 1 - count || j == pos - 1 - count) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            count+=2;
            System.out.println();
        }
    }
}
