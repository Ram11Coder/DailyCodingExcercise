package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _4Sum {

  public static void main(String[] args) {
    int target = 9;
    int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
    // BruteForce
    bruteForce(arr, target);

    // Optimal solution - 2 pointer approach
    using2PointerApproach(arr, target);
    // using2PointerApproach_bitModified(arr, target);
  }

  private static void using2PointerApproach_bitModified(int[] arr, int target) {
    if (arr == null || arr.length == 0)
      return;
    int n = arr.length;

    Arrays.sort(arr);

    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      // Processing the duplicate of number 1
      if (i == 0 || i > 0 && arr[i] != arr[i - 1]) {
        for (int j = i + 1; j < n; j++) {
          // Processing the duplicate of number 2
          if (j == 1 || j > 1 && arr[j] != arr[j - 1]) {
            int low = j + 1, high = n - 1, sum = target - (arr[i] + arr[j]);
            while (low < high) {

              if (arr[low] + arr[high] == sum) {
                res.add(Arrays.asList(arr[i], arr[j], arr[low], arr[high]));

                // Processing the duplicate of number 3
                while (low < high && arr[low] == arr[low + 1]) {
                  low++;
                }
                // Processing the duplicate of number 4
                while (low < high && arr[high] == arr[high - 1]) {
                  high--;
                }
                low++;
                high--;
              } else if (arr[low] + arr[high] < sum) {
                low++;
              } else {
                high--;
              }
            }


          }
        }

      }
    }
    System.out.println(res);
  }

  /**
   * TC - O(n^3)
   *
   * SC - O(1)
   * 
   * In this approach avoiding the hashset to store the unique elements
   */
  private static void using2PointerApproach(int[] arr, int target) {

    if (arr == null || arr.length == 0)
      return;
    int n = arr.length;
    Arrays.sort(arr);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {

      for (int j = i + 1; j < n; j++) {
        int low = j + 1, high = n - 1, sum = target - (arr[i] + arr[j]);
        while (low < high) {

          if (arr[low] + arr[high] == sum) {
            res.add(Arrays.asList(arr[i], arr[j], arr[low], arr[high]));

            // Processing the duplicate of number 3
            while (low < high && arr[low] == arr[low + 1]) {
              low++;
            }
            // Processing the duplicate of number 4
            while (low < high && arr[high] == arr[high - 1]) {
              high--;
            }
            low++;
            high--;
          } else if (arr[low] + arr[high] < sum) {
            low++;
          } else {
            high--;
          }
        }

        // Processing the duplicate of number 2
        while (j + 1 < n && arr[j + 1] == arr[j]) {
          j++;
        }
      }
      // Processing the duplicate of number 1
      while (i + 1 < n && arr[i + 1] == arr[i]) {
        i++;
      }
    }
    System.out.println(res);
  }

  /**
   * TC - O(n^3*Log(n))
   *
   * SC - O(1)
   */
  private static void bruteForce(int[] arr, int target) {

    Arrays.sort(arr);
    // Hashset to get the unique elements
    Set<List<Integer>> res = new HashSet<>();
    int n = arr.length;
    for (int i = 0; i < n - 3; i++) {

      for (int j = i + 1; j < n - 2; j++) {
        for (int k = j + 1; k < n - 1; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          int remainder = target - sum;
          int pos = Arrays.binarySearch(arr, k + 1, n - 1, remainder);
          if (pos > 0) {
            List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], arr[pos]);
            Collections.sort(list);
            res.add(list);
          }
        }
      }
    }
    System.out.println(res);
  }
}
