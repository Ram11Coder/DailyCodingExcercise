package stack;

import stack.Stack.StackOverflowException;
import stack.Stack.StackUnderflowException;

public class FindMinElementInConstantTime {

	static Stack<Integer> stack = new Stack<Integer>();
	static Stack<Integer> minStack = new Stack<Integer>();

	public void push(int data) throws StackUnderflowException, StackOverflowException {
		int min = data;
		if (!stack.isEmpty()) {
			if (minStack.peek() < data) {
				min = minStack.peek();
			}
		}
		stack.push(data);
		minStack.push(min);

	}

	public int pop() throws StackUnderflowException {
		minStack.pop();
		return stack.pop();
	}

	public int getMin() throws StackUnderflowException {
		return minStack.peek();
	}

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		FindMinElementInConstantTime s = new FindMinElementInConstantTime();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.getMin());
		System.out.println("popped : "+s.pop());
		System.out.println(s.getMin());
		System.out.println("popped : "+s.pop());
		System.out.println(s.getMin());
		System.out.println("popped : "+s.pop());
		System.out.println(s.getMin());
		System.out.println("popped : "+s.pop());
		/*
		 * System.out.println(s.getMin()); System.out.println("popped : "+s.pop());
		 */
	}
}
