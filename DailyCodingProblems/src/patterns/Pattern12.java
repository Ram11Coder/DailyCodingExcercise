package patterns;

public class Pattern12 {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n / 2 || j == n / 2 || j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
