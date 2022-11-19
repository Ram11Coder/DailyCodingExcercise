package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
  public static void main(String[] args) {

    int nums[] = {5, 3, 2, 1, 6, 7, 4, 3};
    // Bruteforce
    bruteForce(nums);
    // Using hashmap
    solutionWithHashmap(nums);
    // Using hashset
    solutionWithHashSet(nums);
    // Using 2 pointer
    optimalSolution(nums);

  }

  /**
   * TC - O(n)
   * 
   * SC - O(1)
   * 
   * hare-tortoise algorithm
   * 
   * if the duplicate element then slow and fast pointer will meet
   */
  private static void optimalSolution(int[] nums) {
    int slow = nums[0], fast = nums[0];
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    fast = nums[0];
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    System.out.println(slow);
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static void solutionWithHashSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!set.contains(nums[i])) {
        set.add(nums[i]);
      } else {
        System.out.println(nums[i]);
        break;
      }
    }
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static void solutionWithHashmap(int[] nums) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        System.out.println(nums[i]);
        break;
      } else
        map.put(nums[i], 1);
    }
  }

  /**
   * TC - O(n*log(n))
   * 
   * SC - O(1)
   */
  private static void bruteForce(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        System.out.println(nums[i]);
        break;
      }
    }
  }
}
