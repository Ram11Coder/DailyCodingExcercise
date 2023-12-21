package tree;

/**
 * Diameter - Longest Path between any 2 nodes and path does not need to pass
 * via root
 * 
 */
public class DiameterOfTree {
	public static void main(String[] args) {

		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		root.left.right.left = new NodeTree(8);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		root.right.right.left = new NodeTree(9);
		root.right.right.right = new NodeTree(10);

		int diameter[] = new int[1];
		
		//bruteforce
		//bruteforce(root, diameter);
		//System.out.println("Diameter of tree : " + diameter[0]);
		
		//Optimal
		System.out.println("Height of tree : " + diameterOfTree(root, diameter));
		System.out.println("Diameter of tree : " + diameter[0]);
	}

	/**
	 * bruteforce
	 * TC - O(n^2)
	 * 
	 * SC - O(n)
	 */
	private static void bruteforce(NodeTree root, int[] diameter) {

		// base condition
		if (root == null) {
			return;
		}

		int lt = MaximumDepthInBinaryTree.maxDepthUsingBFS(root.left);
		int rt = MaximumDepthInBinaryTree.maxDepthUsingBFS(root.right);

		diameter[0] = Math.max(diameter[0], lt + rt);

		bruteforce(root.left, diameter);
		bruteforce(root.right, diameter);
	}

	/**
	 * TC - O(n)
	 * 
	 * SC - O(n)
	 */
	private static int diameterOfTree(NodeTree root, int[] diameter) {
		if (root == null)
			return 0;
		int leftMax = diameterOfTree(root.left, diameter);

		int rightMax = diameterOfTree(root.right, diameter);

		diameter[0] = Math.max(diameter[0], leftMax + rightMax);

		return 1 + Math.max(leftMax, rightMax);
	}
}
