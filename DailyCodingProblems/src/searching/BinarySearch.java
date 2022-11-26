package searching;

public class BinarySearch {
  public static void main(String[] args) {

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int key = 6;
    int n = arr.length - 1;
    int index = recursiveBS(arr, key, 0, n);
    System.out.println(
        (index > 0 && arr[index] == key) ? "key found at index : " + index : "key not found");
    index = iterativeBS(arr, key, 0, n);
    System.out.println(
        (index > 0 && arr[index] == key) ? "key found at index : " + index : "key not found");

  }

  private static int iterativeBS(int[] arr, int key, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key)
        return mid;
      if (arr[mid] < key)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return -1;
  }

  private static int recursiveBS(int[] arr, int key, int start, int end) {

    if (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key)
        return mid;

      if (arr[mid] < key)
        return recursiveBS(arr, key, mid + 1, end);
      else
        return recursiveBS(arr, key, start, mid - 1);

    }
    return -1;
  }

}
