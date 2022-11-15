package recursion;

import java.util.Arrays;

public class RercursiveSelectionSort {
  public static void main(String[] args) {

    int arr[] = {5, 3, 1, 4, 8};
    recursiveSS(0, arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void recursiveSS(int ind, int[] arr) {

    if (ind == arr.length - 1)
      return;
    
    for (int j = ind + 1; j < arr.length; j++) {
      if (arr[ind] > arr[j]) {
        int t = arr[ind];
        arr[ind] = arr[j];
        arr[j] = t;
      }
    }
    recursiveSS(ind + 1, arr);
  }
}
