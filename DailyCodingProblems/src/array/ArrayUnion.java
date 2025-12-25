package array;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1">...</a>
 * <p>
 * Given two arrays a[] and b[] of size n and m respectively. The task is to
 * find union between these two arrays.
 * <p>
 * Union of the two arrays can be defined as the set containing distinct
 * elements from both the arrays. If there are repetitions, then only one
 * occurrence of element be printed in the union.
 * <p>
 * Example 1:
 * <p>
 * Input: 5 3 1 2 3 4 5 1 2 3 Output: 5 Explanation: 1, 2, 3, 4 and 5 are the
 * elements which comes in the union set of both arrays. So count is 5. Example
 * 2:
 * <p>
 * Input: 6 2 85 25 1 32 54 6 85 2 Output: 7 Explanation: 85, 25, 1, 32, 54, 6,
 * and 2 are the elements which comes in the union set of both arrays. So count
 * is 7. Your Task: Complete doUnion funciton that takes a, n, b, m as
 * parameters and returns the count of union elements of the two arrays. The
 * printing is done by the driver code.
 * <p>
 * Constraints: 1 ≤ n, m ≤ 105 0 ≤ a[i], b[i] < 105
 * <p>
 * Expected Time Complexity : O((n+m)log(n+m)) Expected Auxilliary Space :
 * O(n+m)
 */
public class ArrayUnion {
    public static void main(String[] args) {

        int[] arr1 = {85, 25, 1, 32, 54, 6};
        int[] arr2 = {85, 2};
        bruteForce(arr1, arr2);
        hashSetSolution(arr1, arr2);
        streamApiSolution(arr1, arr2);
    }

    private static void hashSetSolution(int[] arr1, int[] arr2) {
        Set<Integer> set =new HashSet<>();
        Arrays.stream(arr1).forEach(set::add);
        Arrays.stream(arr2).forEach(set::add);
        System.out.println("Hashset approach : " + set.size());
    }

    private static void bruteForce(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        List<Integer> list1 = new ArrayList<>();
        for (Integer i : arr1)
            list1.add(i);

        int i;
        for (i = 0; i < arr1.length; i++)
            res[i] = arr1[i];

        for (int j = i, k = 0; j < res.length; j++, k++)
            if (!list1.contains(arr2[k]))
                res[j] = arr2[k];

        int count = 0;
        for (int in : res)
            if (in != 0)
                count++;

        System.out.println("Bruteforce approach : "+count);
    }

    // Java8 Solution
    public static void streamApiSolution(int[] arr1, int[] arr2) {

        long c = Stream.concat(IntStream.of(arr1).boxed(), IntStream.of(arr2).boxed())
                .distinct()
                .count();

        System.out.println("Java stream approach : "+c);
    }
}
