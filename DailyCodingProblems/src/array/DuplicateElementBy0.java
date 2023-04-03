package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElementBy0 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 5, 6, 9, 5, 2};

    // bruteForce(arr);
    usingHashMap(arr);
  }

  private static void usingHashMap(int[] arr) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        if (map.get(arr[i]) == 1) {

          map.put(arr[i], map.get(arr[i]) - 1);
          arr[i] = 0;
        }
      } else {
        map.put(arr[i], 1);
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  private static void bruteForce(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[j] = 0;
          break;
        }
      }

    }

    for (int k : arr)
      System.out.print(k + " ");
  }
}
