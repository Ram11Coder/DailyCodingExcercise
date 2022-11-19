package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import stack.Stack.StackOverflowException;
import stack.Stack.StackUnderflowException;


/**
 * Time complexity -(O(n)+O(n))
 * 
 * Space complexity -O(k)
 *
 */
public class SlidingWindowMaximum {



  public static void main(String[] args) throws StackOverflowException, StackUnderflowException {


    int a[] = {1, 3, -1, 3, 5, 6, 7};
    int n = a.length;
    int k = 3;
    int res[] = new int[n - k + 1];
    int ri = 0;
    // Brute force O(n*k)
    // iterate the k elements and find the max value
    bruteforce(a, n, k, res, ri);

    arrayDequesolution(a, n, k, res, ri);
    stackSolution(a, n, k, res, ri);
  }

  private static void stackSolution(int[] a, int n, int k, int[] res, int ri)
      throws StackOverflowException, StackUnderflowException {
    Stack<Integer> st = new Stack<>();
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {

      if (max < a[i]) {
        max=a[i];
        st.push(a[i]);
      }
      if (i >= k - 1)
        res[ri++] = st.peek();
    }
    System.out.println(Arrays.toString(res));
  }

  private static void bruteforce(int[] a, int n, int k, int[] res, int ri) {
    for (int i = 0; i < n - k + 1; i++) {
      int max = 0;
      for (int j = i; j < i + k; j++) {
        if (max < a[j])
          max = a[j];
      }
      res[ri++] = max;
    }
    System.out.println(Arrays.toString(res));
  }

  private static void arrayDequesolution(int[] a, int n, int k, int[] res, int ri) {
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {

      // remove the eleemnt out of range k
      while (!deque.isEmpty() && deque.peek() == i - k) {
        deque.poll();
      }
      // remove small elements in k range as they are useless
      while (!deque.isEmpty() && a[i] >= a[deque.peekLast()]) {
        deque.pollLast();
      }
      deque.offer(i);

      // Store the result
      if (i >= k - 1) {
        res[ri++] = a[deque.peek()];
      }
    }
    System.out.println(Arrays.toString(res));
  }
}
