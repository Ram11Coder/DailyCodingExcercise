package searching;

public class LinearSearch {
  public static void main(String[] args) {

    int arr[] = {1, 3, 5, 6, 7, 12};
    int key = 7;

    int index = linearSearch(arr, key);
    System.out.println((index > 0) ? "Key found on index " + index : "key not found");
  }

  private static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key)
        return i;
    return -1;
  }
}
