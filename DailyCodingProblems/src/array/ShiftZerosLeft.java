package array;

import java.util.Arrays;

/**
 * 
 * Shift all zeros in to left
 *
 */
public class ShiftZerosLeft {
  public static void main(String[] args) {

    int arr[] = {1, 0, 2, 0, 3, 0, 0, 0, 0};

    System.out.println(Arrays.toString(shiftAllZerosLeft(arr)));// O(n)
    System.out.println(Arrays.toString(shiftAllZerosLeftWithoutExtraSpace(arr)));// O(n)
    Arrays.sort(arr);// O(n log(n)) - order not maintained
    // System.out.print(Arrays.toString(arr));
  }

  /**
   * TC - O(n) SC - O(n)
   * 
   * @param arr
   * @return
   */
  private static int[] shiftAllZerosLeft(int[] arr) {

    int newArr[] = new int[arr.length];
    int count = 0;

    for (int m : arr)
      if (m == 0)
        count++;
    for (int n : arr) {
      if (n != 0)
        newArr[count++] = n;
    }

    return newArr;
  }

  /**
   * TC - O(n)
   * SC - O(1)
   * 
   * @param arr
   * @return
   */
  private static int[] shiftAllZerosLeftWithoutExtraSpace(int[] arr) {

    for (int i = 0, curr = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int t = arr[curr];
        arr[curr] = arr[i];
        arr[i] = t;
      }
    }

    return arr;
  }
}
