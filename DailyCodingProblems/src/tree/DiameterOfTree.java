package tree;

/**
 * Diameter - Longest Path between 2 nodes and path does not need to pass via root
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
    System.out.println("Diameter of tree : " + diameterOfTree(root, diameter));
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
