package array;

// https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class MinimumSwapsAndKTogether {
  public static void main(String[] args) {

    // {2, 1, 3,5, 6} k=3 , x=3, y=3

    // int[] arr = {2, 7, 9, 5, 8, 7, 4, 7, 1, 0, 2, 11};
    /*
     * int[] arr = {2, 7, 9, 5, 8, 7, 4}; int k = 6;
     */
    int[] arr = {2, 7, 3};
    int k = 3;
  //  System.out.println(myImpl(arr, k));

   System.out.println(minSwap(arr, arr.length, k));
  }

  // Still working on solution
  private static int myImpl(int[] arr, int k) {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= k)
        c++;
    }
    int temp = c;
    if (c != k || c != 0)
      c--;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] <= k && arr[i + 1] <= k)
        c--;
      else if (i != 0 && temp > 2 && arr[i - 1] <= k && arr[i + 1] <= k)
        c--;
    }
    return c;
  }

  static int minSwap(int a[], int n, int k) {

    int x = 0, y = 0;

    for (int i = 0; i < n; i++)
      if (a[i] <= k)
        x++;
    for (int i = 0; i < x; i++)
      if (a[i] <= k)
        y++;

    int mx = (x - y);


    for (int i = x; i < n; i++) {
      if (a[i] <= k)
        y++;
      if (a[i - x] <= k)
        y--;
      mx = Math.min(mx, x - y);
    }

    return mx;
  }
}
