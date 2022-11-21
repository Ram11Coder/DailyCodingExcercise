package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
  // I will improve the program optimize in future
  public static void main(String[] args) {
    int key = 9;
    int arr[] = {1, 3, 1, 8, 4};

    /**
     * Bruteforce - 2 iteration
     *
     * TC - O(n^2)
     *
     * SC - O(1)
     *
     */

    System.out.println(Arrays.toString(bruteForce(key, arr)));

    /**
     * Optimal approach - using hash
     * 
     */
    System.out.println(Arrays.toString(optimal(key, arr)));

  }

  private static int[] optimal(int key, int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    int result[] = new int[2];
    for (int i = 0; i < arr.length; i++) {
      int k = (int) Math.abs(key - arr[i]);
      if (map.containsKey(k)) {
        result[1] = i;
        result[0] = map.get(k);
        return result;
      }
      map.put(arr[i], i);
    }
    return null;
  }

  private static int[] bruteForce(int key, int[] arr) {
    int result[] = new int[2];
    for (int i = 0; i < arr.length; i++) {
      int diff = (int) Math.abs(key - arr[i]);
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] == diff) {
          result[1] = j;
          result[0] = i;
          return result;
        }
      }
    }
    return result;
  }

}
