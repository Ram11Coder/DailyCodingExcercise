package tree;

// Maximum sum of longest path in tree
public class MaximumPathSum {
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

    int max[] = new int[1];
    max[0] = Integer.MIN_VALUE;
    maxPathSum(root, max);
    System.out.println("Max path sum of tree : " + max[0]);
  }

  private static int maxPathSum(NodeTree node, int[] max) {
    if (node == null)
      return 0;
    // We are ignoring negative value to sum so returning 0
    int leftSum = Math.max(0, maxPathSum(node.left, max));
    int rightSum = Math.max(0, maxPathSum(node.right, max));
    max[0] = Math.max(max[0], node.data + leftSum + rightSum);

    return Math.max(leftSum, rightSum) + node.data;
  }
}
