package binarysearch;

public class SearchElementInASortedRotatedArray {
  public static void main(String[] args) {

    // int[] arr = {4, 5, 6, 7, 0, 1, 2};
    int[] arr = {5, 6, 1, 2, 3, 4};
    int key = 6;
    // BruteForce
    System.out.println(bruteForce(arr, key));
    // Optimal
    System.out.println(solution(arr, key));
  }

  /**
   * TC - O(logN) SC - O(1)
   * 
   * @param arr
   * @param key
   * @return
   */
  private static int solution(int[] arr, int key) {

    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) >> 1;
      if (arr[mid] == key)
        return mid;
      if (arr[low] <= arr[mid]) {
        if (key >= arr[low] && key <= arr[mid])
          high = mid - 1;
        else
          low = mid + 1;
      } else {
        if (key <= arr[high] && key >= arr[mid])
          low = mid + 1;
        else
          high = mid - 1;
      }
    }
    return -1;
  }

  /*
   * TC - O(N)
   * 
   * SC - O(1)
   */
  private static int bruteForce(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key)
        return i;
    return -1;
  }
}
