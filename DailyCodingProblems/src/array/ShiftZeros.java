package array;

import java.util.Arrays;

/**
 *
 * Shift all zeros in to right side
 *
 */
public class ShiftZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 0, 5, 6};

        System.out.println(Arrays.toString(shiftAllZeros(arr)));
        System.out.println(Arrays.toString(shiftAllZerosWithOutExtraSpace(arr)));
    }


    /**
     * TC - O(n)
     * <p>
     * SC - O(n)
     *
     * @param arr
     * @return
     */
    private static int[] shiftAllZeros(int[] arr) {

        int[] newArr = new int[arr.length];
        int count = 0;
        for (int n : arr) {
            if (n != 0)
                newArr[count++] = n;
        }

        return newArr;
    }

    /**
     * TC - O(n)
     * <p>
     * SC - O(1)
     *
     * @param arr
     * @return
     */
    private static int[] shiftAllZerosWithOutExtraSpace(int[] arr) {

        for (int p1 = 0, p2 = 0; p1 < arr.length; p1++) {
            if (arr[p1] != 0) {
                swap(arr, p1, p2);
                p2++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int p1, int p2) {
        int t = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = t;
    }

}
