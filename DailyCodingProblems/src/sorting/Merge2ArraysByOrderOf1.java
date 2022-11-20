package sorting;

import java.util.Arrays;

public class Merge2ArraysByOrderOf1 {
  public static void main(String[] args) {

    int arr1[] = {1, 4, 7, 8, 10}, arr2[] = {2, 3, 9};

    // Approach 1 using extra array
    usingExtraSpace(arr1, arr2);

    // Approach 2 using insertion sort
    usingInsertionSort(arr1, arr2);

    // Approach 3 using GAP Algorithm
    usingGAPApproach(arr1, arr2);
  }

  /**
   * TC - O(n+m)log(n+m)
   *
   * SC - O(1)
   */
  private static void usingGAPApproach(int[] arr1, int[] arr2) {
    int total = arr1.length + arr2.length;
    int size = (int) Math.ceil(total / 2);

    int gap = size / 2;

    while (gap > 0) {
      int i = 0, j = gap;

      while (j < total) {
        if (i < arr1.length && j < arr1.length) {
          if (arr1[i] > arr1[j]) {
            int t = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = t;
          }
        } else if (i < arr1.length && j > arr1.length) {
          if (arr1[i] > arr2[j - arr1.length]) {
            int t = arr1[i];
            arr1[i] = arr2[j - arr1.length];
            arr2[j - arr1.length] = t;
          }
        } else if (i > arr1.length && j > arr1.length) {
          if (arr2[i - arr1.length] > arr2[j - arr1.length]) {
            int t = arr2[i - arr1.length];
            arr2[i - arr1.length] = arr2[j - arr1.length];
            arr2[j - arr1.length] = t;
          }
        }
        i++;
        j++;
      }

      gap /= 2;
    }
    System.out.println(Arrays.toString(arr1) + " , " + Arrays.toString(arr2));

  }

  /**
   * Given each array already sorted
   * 
   * compare the first array element with second array which is greater then swap it
   * 
   * once after swap second array should be sorted, so that algorithm will work properly
   *
   * TC - O(n*m)
   * 
   * SC -O(1)
   */
  private static void usingInsertionSort(int[] arr1, int[] arr2) {
    int i = 0, j = 0;

    while (i < arr1.length) {

      if (arr1[i] > arr2[j]) {
        swap(arr1, arr2, i, j);
        sort(arr2);
      }
      i++;
    }
    System.out.println(Arrays.toString(arr1) + " , " + Arrays.toString(arr2));
  }


  private static void sort(int[] arr2) {
    for (int i = 0; i < arr2.length - 1; i++) {
      if (arr2[i] > arr2[i + 1]) {
        int t = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = t;
      }
    }
  }

  private static void swap(int[] arr1, int[] arr2, int i, int j) {
    int t = arr1[i];
    arr1[i] = arr2[j];
    arr2[j] = t;
  }

  /**
   * TC - O(n+m)log(n+m)  
   * 
   * SC - O(n+m)
   */
  private static void usingExtraSpace(int[] arr1, int[] arr2) {
    int arr3[] = new int[arr1.length + arr2.length];
    int i = 0;
    for (; i < arr1.length; i++) {
      arr3[i] = arr1[i];
    }
    for (int j = 0; j < arr2.length; j++, i++) {
      arr3[i] = arr2[j];
    }
    Arrays.sort(arr3);
    int j = 0;
    for (; j < arr1.length; j++) {
      arr1[j] = arr3[j];
    }
    for (int k = 0; k < arr2.length; k++, j++) {
      arr2[k] = arr3[j];
    }
    System.out.println(Arrays.toString(arr1) + " , " + Arrays.toString(arr2));
  }
}
