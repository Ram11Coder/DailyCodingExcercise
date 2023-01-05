package twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {

    int[] arr = {1, 1, 2, 2, 2, 3, 3};
    // Once find the unique element move it start of the array, return the no of unique element
    System.out.println(bruteforce(arr));
    System.out.println(optimal(arr));
  }

  /**
   * TC - O(n)+o(n*logn)+O(n)
   * 
   * SC - O(n)
   * 
   * @param arr
   */
  private static int bruteforce(int[] arr) {

    Set<Integer> set = new HashSet<Integer>();

    for (int i : arr)
      if (!set.contains(i))
        set.add(i);
    Iterator<Integer> itr = set.iterator();
    for (int i = 0; itr.hasNext(); i++) {
      arr[i] = itr.next();
    }
    // System.out.println(Arrays.toString(arr));
    return set.size();
  }

  /**
   * TC - O(n)
   * 
   * SC - O(1)
   * 
   * @param arr
   */
  private static int optimal(int[] arr) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {

      if (arr[i] != arr[j])
        arr[++i] = arr[j];
    }
    // System.out.println(Arrays.toString(arr));
    return i + 1;
  }
}
