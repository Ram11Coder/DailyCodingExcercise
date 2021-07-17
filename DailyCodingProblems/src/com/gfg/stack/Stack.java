package com.java.stack;

import java.util.Scanner;

//public class Stack {

//
//}
//stack operation
//create a stack
//push
//pop
//peek
//isempty
//isfull

public class Stack {
	static final int MAX=100;
	int top, arr[];

	public Stack(int n) {
		//this.n = n;
		top = -1;
		arr = new int[MAX];
		System.out.println("Statck created !!");

	}

	public boolean is_full() {
		return this.top>= (MAX - 1);
	}

	public boolean is_empty() {
		return this.top == -1;
	}

	public void push(int val, Stack s) {
		if (s.is_full()) {
			System.out.println("Stack is full!!");
			return;
		} else {
			arr[++(this.top)] = val;
			System.out.println("Pushed val is " + arr[top]);
		}
	}

	public void pop() {
		if (is_empty()) {
			System.out.println("Stack is empty!!");
			return;
		} else {
			int pop_value = arr[top--];
			System.out.println("Popped val is " + pop_value);

		}
	}

	public void peek() {
		if (is_empty()) {
			System.out.println("Stack is empty!!");
			return;
		} else {
			System.out.println("Peeked val is :" + arr[top]);
		}

	}

	public void empty_stack(Stack s) {
		if (s.is_empty()) {
			System.out.println("Stack is empty!!");
			return;
		}
		s.arr = null;
		s = null;

	}

	public static void main(String[] args) {
		Stack s = new Stack(5);
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {

			System.out.println("Choose the below operations");
			System.out.println(
					"1.push" + "\n" + "2.pop" + "\n" + "3.peek" + "\n" + "4.Empty the stack" + "\n" + "5.exit" + "\n");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter the number to push");
				int push_val = sc.nextInt();
				s.push(push_val, s);
				break;

			case 2:
				s.pop();
				break;
			case 3:
				s.peek();
				break;
			case 4:
				s.empty_stack(s);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}