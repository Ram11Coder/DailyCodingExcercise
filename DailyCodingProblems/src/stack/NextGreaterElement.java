package stack;

import java.util.Arrays;
import stack.Stack.StackOverflowException;
import stack.Stack.StackUnderflowException;

public class NextGreaterElement {
  public static void main(String[] args) throws StackUnderflowException, StackOverflowException {

    int arr[] = {2, 3, 10, 9, 1};
    int n = arr.length;

    solution(arr, n);

  }

  private static void solution(int[] arr, int n)
      throws StackUnderflowException, StackOverflowException {
    // Store the next greater element
    Stack<Integer> stack = new Stack<>();

    int[] nge = new int[n];
    Arrays.fill(nge, -1);

    for (int i = 2 * n - 1; i >= 0; i--) {

      while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
        stack.pop();
      }
      if (i < n) {
        if (!stack.isEmpty())
          nge[i] = stack.pop();
        else
          nge[i] = -1;
      }
      stack.push(arr[i % n]);
    }

    System.out.println(Arrays.toString(nge));
  }
}
