package recursion;

import java.util.Arrays;

public class RecursiveBubbleSort {
  public static void main(String[] args) {
    int arr[] = {5, 3, 1, 4, 8};
    recursiveBS(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  private static void recursiveBS(int[] arr, int n) {

    if (n == 1)
      return;
    boolean flag = false;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int t = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = t;
        flag = true;
      }
    }
    if (!flag)
      return;
    recursiveBS(arr, n - 1);
  }
}
