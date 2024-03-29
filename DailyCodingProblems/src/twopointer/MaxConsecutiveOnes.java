package twopointer;

// https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
  public static void main(String[] args) {

    int[] arr = {1, 1, 0, 1, 1, 1};
    System.out.println(findMaxConsecutiveOnes(arr));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {

    int max = 0, cnt = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1)
        cnt++;
      else
        cnt = 0;

      max = Math.max(max, cnt);
    }
    return max;
  }
}
