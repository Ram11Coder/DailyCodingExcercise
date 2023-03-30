package charpattern;

public class MiddlePattern {
  public static void main(String[] args) {
    String str = "PROGRAM";
    System.out.println("Approach 1");
    approach1(str);
    System.out.println("Approach 2");
    approach2(str);
  }

  private static void approach2(String str) {

    int n = str.length();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      int mid = n / 2;
      for (int k = 0; k <= i; k++) {
        System.out.print(str.charAt(mid++ % n) + " ");
      }
      System.out.println();
    }

  }

  private static void approach1(String str) {
    int l = str.length();
    int m = l / 2;

    for (int j = 0; j < l; j++) {
      for (int i = l; i > j + 1; i--)
        System.out.print(" ");

      for (int i = 0, k = 0, c = m; i <= j; i++) {


        System.out.print(((i <= m) ? str.charAt(c++) : str.charAt(k++)) + " ");

      }
      System.out.println();
    }
  }
}
