package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOccurence {
  public static void main(String[] args) {
    int arr[] = {2, 1, 3, 2, 2, 5, 8, 9, 8};
    // System.out.println("\nBruteForce Approach:");
    // bruteForce(arr);
    System.out.println("\nUsing Sorting algo:");
    sortingApproach(arr);
    System.out.println("\nUsing hashmap algo:");
    hashMapApproach(arr);
  }

  private static void hashMapApproach(int[] arr) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; i++)
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    Set<Entry<Integer, Integer>> entrySet = map.entrySet();

    for (Entry<Integer, Integer> entry : entrySet)
      System.out.println(entry.getKey() + " - " + entry.getValue());

  }

  private static void sortingApproach(int[] arr) {
    Arrays.sort(arr);
    //System.out.println(Arrays.toString(arr));
    int count = 1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        count++;
      } else {
        System.out.println(arr[i] + " - " + count);
        count = 1;
      }
    }
    int n = arr.length - 1;
    if (n > 1 && arr[n] != arr[n - 1])
      System.out.println(arr[n] + " - " + 1);
  }

  // Need to handle the edge case of adding already visited index
  private static void bruteForce(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int c = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] != -1 && arr[i] == arr[j]) {
          arr[j] = -1;
          c++;
        }
      }
      if (arr[i] != -1)
        System.out.println(arr[i] + "-" + c);
    }
  }
}
