package binarysearch;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArraysOfDifferentSizes {
  /**
   * Median of array length is
   * 
   * odd -> l+h/2
   * 
   * even -> ((l+h/2) +( l+h/2)-1)/2
   *
   */
  public static void main(String[] args) {

    int[] arr1 = {1, 3, 4, 7, 10, 12}, arr2 = {2, 3, 6, 15};

    // BruteForce
    System.out.println(bruteforce(arr1, arr2));

    // Optimal
    System.out.println(optimal(arr1, arr2));
  }


  /**
   * TC -
   * 
   * SC -
   * 
   * @param arr1
   * @param arr2
   * @return
   */
  private static int optimal(int[] arr1, int[] arr2) {
    return 0;

  }

  /**
   * Using merge sort algorithm
   * 
   * TC -
   * 
   * SC -
   * 
   * @param arr1
   * @param arr2
   * @return
   */
  private static int bruteforce(int[] arr1, int[] arr2) {
    return 0;

  }
}
