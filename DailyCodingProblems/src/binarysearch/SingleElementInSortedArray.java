package binarysearch;

public class SingleElementInSortedArray {
  public static void main(String[] args) {

    // int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
    // int[] arr = {0,1, 1, 2, 2, 4, 4, 5, 5};
    int[] arr = {1, 1, 2, 2, 4, 4, 5, 5, 6};

    // Bruteforce
    System.out.println(bruteForceUsingXor(arr));
    // Optimal
    System.out.println(solution(arr));
    // Optimal with less lines of code
    System.out.println(solution1(arr));
  }

  private static int solution(int[] arr) {
    int low = 0, high = arr.length - 2;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (mid % 2 == 0) {
        if (arr[mid] == arr[mid + 1]) {
          low = mid + 1;
        } else
          high = mid - 1;
      } else {
        if (arr[mid] == arr[mid - 1]) {
          low = mid + 1;
        } else
          high = mid - 1;
      }
    }
    return arr[low];
  }

  private static int solution1(int[] arr) {
    int low = 0, high = arr.length - 2;
    /**
     * 1st instance - even index
     * 
     * 2nd instance - odd index
     * 
     * mid ^ 1 -> if it is a 1st instance it will give second instance if it 2nd instance it will
     * give first instance
     * 
     * we do need to write many if conditions
     * 
     * ex: mid -> 1, we need to check 0th index (mid^1) -> 1^1 -> 0 
     * mid -> 0, we need to check 1st index (mid^1) -> 0^1 -> 1
     * 
     */
    while (low <= high) {
      int mid = (low + high) >> 1;

      if (arr[mid] == arr[mid ^ 1])
        low = mid + 1;
      else
        high = mid - 1;

    }
    return arr[low];
  }



  /**
   * TC - O(n)
   * 
   * SC - O(1)
   */
  private static int bruteForceUsingXor(int[] arr) {

    int res = 0;
    for (int i : arr)
      res ^= i;
    return res;
  }
}
