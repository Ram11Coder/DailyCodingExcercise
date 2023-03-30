package numbers;

/**
 * 
 * You’re given a number n. If write all the numbers from 1 to n in a paper, we have to find the
 * number of characters written on the paper.For example if n=13, the output should be 17 if n =
 * 101, the output should be 195
 *
 */
public class NumberCount {
  public static void main(String[] args) {

    int n = 12345;

  //  System.out.println(numberCountChecker(n));
  System.out.println(numberCountChecker_recursive(n, 0));
  }

  static int numberCountChecker_recursive(int num, int sum) {
    int count = getCount(num);
    if (count <= 1) {
      return num + sum;
    }
    int pow = (int) Math.pow(10, count - 1) - 1;
    int rem = (num - pow);
    int res = sum + rem * count;

    return numberCountChecker_recursive(pow, res);
  }


  private static int getCount(int num) {
    return String.valueOf(num).length();
  }

  static int numberCountChecker(int n) {
    int sum = 9, count = 0, i = 1;
    int check = 9;
    if (n <= 9) {
      return n;
    }
    while (n > check) {
      count += (sum * i++);
      check = 9 + check * 10;

      sum *= 10;
    }

    count += (n - check / 10) * i;
    return count;
  }
}
