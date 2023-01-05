package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// https://leetcode.com/problems/majority-element-ii/
public class MajorityElement_II {
  public static void main(String[] args) {

    int[] arr = {1, 1, 1, 2, 2, 3, 3, 3};
    // Bruteforce
    System.out.println(bruteForce(arr));

    // Better
    System.out.println(better(arr));

    // Optimal
    System.out.println(optimal(arr));
  }

  /**
   * Boyer's Moore voting algorithm
   * 
   * TC - O(n)+O(n)
   * 
   * SC -O(1)
   * 
   * 
   * An element can be a majority element only if it appears more than floor(n/3) times, i.e it
   * should appear atleast n/3 + 1 time . Only two such elements are possible in an array. Let's
   * prove this by contradiction.
   * 
   * I will assume that we have three majority element possible in an array then minimum size of
   * array is 3 * (n/3 + 1) which is equal to n + 3. But we know that we have only n elements in an
   * array , hence it is not possible to have more than 2 majority elements.
   * 
   * 
   * @param arr
   * @return
   */
  private static List<Integer> optimal(int[] arr) {

    List<Integer> result = new ArrayList<Integer>();

    int num1 = 0, num2 = 0, c1 = 0, c2 = 0;

    for (int i : arr) {

      if (i == num1) {
        c1++;
      } else if (i == num2) {
        c2++;
      } else if (c1 == 0) {
        num1 = i;
        c1 = 1;
      } else if (c2 == 0) {
        num2 = i;
        c2 = 1;
      } else {
        c1--;
        c2--;
      }

    }

    c1 = 0;
    c2 = 0;
    for (int i : arr) {
      if (i == num1)
        c1++;
      else if (i == num2)
        c2++;
    }

    if (c1 > Math.floorDiv(arr.length, 3)) {
      result.add(num1);
    }
    if (c2 > Math.floorDiv(arr.length, 3)) {
      result.add(num2);
    }
    return result;
  }

  /**
   * TC - O(n^logn)
   * 
   * SC - O(1)
   * 
   * @param arr
   * @return
   */
  private static List<Integer> better(int[] arr) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    List<Integer> result = new ArrayList<Integer>();

    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    for (Entry<Integer, Integer> entrySet : map.entrySet()) {
      if (entrySet.getValue() > Math.floorDiv(arr.length, 3)) {
        result.add(entrySet.getKey());
      }
    }
    return result;
  }

  /**
   * TC - O(n^2)
   * 
   * SC - O(1)
   * 
   * @param arr
   * @return
   */
  private static List<Integer> bruteForce(int[] arr) {

    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j])
          count++;
      }
      if (count > Math.floorDiv(arr.length, 3)) {
        result.add(arr[i]);
      }
    }
    return result;
  }
}
