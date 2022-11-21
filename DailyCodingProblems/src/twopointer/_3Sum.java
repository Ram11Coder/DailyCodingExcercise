package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _3Sum {
  public static void main(String[] args) {
    int target = 0;
    int arr[] = {-1, 0, 1, 2, -1, -4};
    // Approach 1 : Bruteforce - 3 iterations
    naiveApproach(arr, target);
    // Approach 2 : use hashing and reduce the iteration to 2
    usingHash(arr, target);

    // Approach 3 - Using2 pointer
    using2Pointer(arr, target);
  }

  /**
   * TC - O(n^2)
   * 
   * SC - O(n)
   */
  private static void using2Pointer(int[] arr, int target) {

    Arrays.sort(arr);
    List<List<Integer>> res = new LinkedList<>();
    for (int i = 0; i < arr.length - 2; i++) {
      if (i == 0 || i > 0 && arr[i] != arr[i - 1]) {

        int low = i + 1, high = arr.length - 1, sum = target - arr[i];
        while (low < high) {

          if (arr[low] + arr[high] == sum) {
            res.add(Arrays.asList(arr[i], arr[low], arr[high]));

            while (low < high && arr[low] == arr[low + 1])
              low++;

            while (low < high && arr[high] == arr[high - 1])
              high--;

            low++;
            high--;
          } else if (arr[low] + arr[high] < sum)
            low++;
          else
            high--;
        }
      }

    }
    System.out.println(res);
  }


  /**
   * TC - O(n^2logm)
   * 
   * SC - O(n+m)
   */
  private static void usingHash(int[] arr, int target) {

    Set<List<Integer>> set = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }


    for (int i = 0; i < arr.length; i++) {
      map.replace(arr[i], map.get(arr[i]) - 1);
      for (int j = i + 1; j < arr.length; j++) {
        map.replace(arr[j], map.get(arr[j]) - 1);
        int sum = arr[i] + arr[j];
        int rem = target - sum;
        if (map.containsKey(rem) && map.get(rem) > 0) {
          List<Integer> list = new ArrayList<Integer>();
          list.add(arr[i]);
          list.add(arr[j]);
          list.add(rem);
          Collections.sort(list);
          set.add(list);
        }
        map.replace(arr[j], map.get(arr[j]) + 1);
      }
      map.replace(arr[i], map.get(arr[i]) + 1);
    }
    System.out.println(set);
  }

  /**
   * TC - O(n^3logm)
   * 
   * SC - O(1)
   */
  private static void naiveApproach(int[] arr, int target) {

    Set<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        List<Integer> listValue = new ArrayList<Integer>();
        for (int k = j + 1; k < arr.length; k++) {

          if (arr[i] + arr[j] + arr[k] == target) {
            listValue.add(arr[i]);
            listValue.add(arr[j]);
            listValue.add(arr[k]);
            Collections.sort(listValue);
            set.add(listValue);
          }
        }
      }
    }
    System.out.println(set);
  }
}
