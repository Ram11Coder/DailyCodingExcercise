package searching;

import java.util.Arrays;

public class BSOccurrence {
  public static void main(String[] args) {

    int arr[] = {1, 4, 4, 4, 4, 9, 9, 10, 11};
    int n = arr.length;
    int key = 4;

    // Find first occurrence of X in a sorted array, if it does not exist return -1
    findFirstOccurence(arr, n, key);
    // Find last occurrence of X in a sorted array, if it does not exist return -1
    findlastOccurence(arr, n, key);

  }

  private static void findlastOccurence(int[] arr, int n, int key) {
    int index = Arrays.binarySearch(arr, key);

    if (index > 0 && index < n && arr[index] == key) {
      while (arr[index + 1] == arr[index]) {
        index = index + 1;
      }
      System.out.println("First occurrence at index : " + index + " , value : " + arr[index]);
    } else {
      System.out.println("No Ocuurence occur");
    }
  }

  private static void findFirstOccurence(int[] arr, int n, int key) {
    int index = Arrays.binarySearch(arr, key);

    if (index > 0 && index < n && arr[index] == key) {
      while (arr[index - 1] == arr[index]) {
        index = index - 1;
      }
      System.out.println("Last occurence at index : " + index + " , value : " + arr[index]);
    } else {
      System.out.println("No Ocuurence occur");
    }
  }
}
