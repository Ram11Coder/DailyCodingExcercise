package array;

import java.util.Arrays;

/**
 * 
 * Shift all zeros in to right side
 *
 */
public class ShiftZeros {
  public static void main(String[] args) {

    int arr[] = {1, 0, 2, 0, 3, 0, 0, 5, 6};


    System.out.println(Arrays.toString(shiftAllZeros(arr)));
    System.out.println(Arrays.toString(shiftAllZerosWithOutExtraSpace(arr)));
  }


  /**
   * TC - O(n)
   * 
   * SC - O(n)
   * 
   * @param arr
   * @return
   */
  private static int[] shiftAllZeros(int[] arr) {

    int newArr[] = new int[arr.length];
    int count = 0;
    for (int n : arr) {
      if (n != 0)
        newArr[count++] = n;
    }

    return newArr;
  }

  /**
   * TC - O(n)
   * 
   * SC - O(1)
   * 
   * @param arr
   * @return
   */
  private static int[] shiftAllZerosWithOutExtraSpace(int[] arr) {

    for (int i = 0, curr = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int t = arr[curr];
        arr[curr] = arr[i];
        arr[i] = t;
        curr++;
      }
    }
    return arr;
  }

}
