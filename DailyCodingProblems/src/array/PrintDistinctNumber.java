package array;

import java.util.Arrays;

/**
 *
 * Given an array of numbers. Print the numbers without duplication.
 * INPUT  :
 * Enter the array size  :  4
 * Enter the elements  :  1 1 2 4
 * OUTPUT  :
 * <p>
 * 1 2 4
 *
 *
 */
public class PrintDistinctNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};

        //  bruteforce(arr);
        usingStream(arr);

    }

    private static void usingStream(int[] arr) {
        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);
    }

    private static void bruteforce(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    arr[j] = -1;


        for (int k : arr)
            if (k != -1)
                System.out.print(k + " ");
        System.out.println();
    }
}
