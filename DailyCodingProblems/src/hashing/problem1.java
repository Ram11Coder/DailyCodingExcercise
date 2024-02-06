package hashing;
/**
 * Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.

 *
 */

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class problem1 {
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root==null) return;
		System.out.print(root.data);
		preOrder(root.left);
		preOrder(root.right);

	}
public static void main(String[] args) {
	BinaryTreeNode<Integer> root =new BinaryTreeNode(1);
	root.left=new BinaryTreeNode(2);
	root.right=new BinaryTreeNode(3);
	root.right.right=new BinaryTreeNode(4);
	preOrder(root);
}
}
