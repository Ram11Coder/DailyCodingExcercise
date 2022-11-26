package searching;

import java.util.Arrays;

public class BSUsingInbuildFunction {
  public static void main(String[] args) {

    // Find first occurence of X in a sorted array, if it does not exist return -1

    int arr[] = {1, 4, 4, 4, 4, 9, 9, 10, 11};
    int n = arr.length;
    int key = 4;

    int index = Arrays.binarySearch(arr, key);

    if (index > 0 && index < n && arr[index] == key) {
      while (arr[index - 1] == arr[index]) {
        index = index - 1;
      }
      System.out.println("Index : " + index + " , value : " + arr[index]);
    } else {
      System.out.println("-1");
    }

  }
}
