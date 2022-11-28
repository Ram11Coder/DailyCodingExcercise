package hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithZeroSum {
  public static void main(String[] args) {


    int[] arr = {1, -1, 3, -2, 2, -8, 1, 7, 10, 23};

    bruteForce(arr);
    solution(arr);
  }

  /**
   * TC - O(n^2)
   * 
   * SC - O(1)
   */
  private static void bruteForce(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      int sum = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        sum += arr[j];
        if (sum == 0) {
          max = Math.max(max, j - i + 1);
        }
      }
    }
    System.out.println(max);
  }

  /**
   * TC - O(n*logn)
   * 
   * n - Iteration
   * 
   * logn - hashmap
   * 
   * SC - O(n)
   */
  private static void solution(int[] arr) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int sum = 0, maxi = 0;
    for (int i = 0; i < arr.length; i++) {

      sum += arr[i];
      if (sum == 0) {
        maxi = i + 1;
      } else {
        if (map.containsKey(sum))
          maxi = Math.max(maxi, i - map.get(sum));
        else
          map.put(sum, i);
      }
    }
    System.out.println(maxi);
  }
}
