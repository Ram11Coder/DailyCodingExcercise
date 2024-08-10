package patterns;

// * A* B*
// C* D* E
// * F* G*
// H* I* J
// * K* L*

public class Pattern10 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print((j % 2 == 1) ? ch++ : "*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print((j % 2 == 0) ? ch++ : "*");
                }
            }
            System.out.println();
        }
    }
}
