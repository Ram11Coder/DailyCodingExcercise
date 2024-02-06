package sorting;

import java.util.Arrays;

public class SortBy123 {
  public static void main(String[] args) {
    int arr[] = {0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0, 2};
    /*
     * BruteForce
     * 
     * TC - O(n*log(n))
     *
     * SC - O(1)
     */
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    /*
     * Using Extra space to count the frequency
     * 
     * TC - O(n+n)
     *
     * SC - O(1)
     */

    usinghash(arr);

    /**
     * Dutch flag algorithm
     * 
     * TC - O(n)
     *
     * SC - O(1)
     */

    dutchFlagAlgorithm(arr);

  }

  private static void dutchFlagAlgorithm(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
      switch (arr[mid]) {
        case 0: {
          swap(arr, low, mid);
          mid++;
          low++;
          break;
        }
        case 1: {
          mid++;
          break;
        }
        case 2: {
          swap(arr, high, mid);
          high--;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }

private static void swap(int[] arr, int l, int r) {
	int t = arr[r];
	  arr[r] = arr[l];
	  arr[l] = t;
}

  private static void usinghash(int[] arr) {
    int frq[] = new int[3];
    for (int i = 0; i < arr.length; i++) {
      frq[arr[i]]++;
    }

    for (int i = 0, j = 0; i < arr.length; i++) {

      if (frq[j] > 0) {
        arr[i] = j;
        frq[j]--;
      } else {
        arr[i] = ++j;
        frq[j]--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }


}
