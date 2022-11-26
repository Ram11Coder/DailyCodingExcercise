package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {

    int arr[] = {1, 101, 2, 102, 3, 103, 4, 105, 104};
    // BruteForce
    bruteForce(arr);
    // Optimal
    optimalApproach(arr);
  }

  /**
   * TC - O(n)
   * 
   * SC -O(1)
   */
  private static void optimalApproach(int[] arr) {
    Set<Integer> set = new HashSet<Integer>();

    for (int i : arr)
      set.add(i);

    int consecutiveLength = 0;
    for (int num : arr) {
      if (!set.contains(num - 1)) {
        int currentStreak = 1;
        int currentNum = num;

        while (set.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }
        consecutiveLength = Math.max(consecutiveLength, currentStreak);

      }
    }
    System.out.println("Maximum conseutive sequence lenght is : " + consecutiveLength);

  }

  /**
   * TC - O(nlogn)
   * 
   * SC -O(n) (if it is merge sort)
   */
  private static void bruteForce(int[] arr) {
    Arrays.sort(arr);
    int consecutiveLength = 0, max = 1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] == arr[i] + 1) {
        max++;
      } else {
        if (consecutiveLength < max) {
          consecutiveLength = max;
        }
        max = 1;
      }
    }
    if (consecutiveLength < max) {
      consecutiveLength = max;
    }
    System.out.println("Maximum conseutive sequence lenght is : " + consecutiveLength);
  }
}
