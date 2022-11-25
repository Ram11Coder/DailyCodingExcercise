package tree;

public class CheckBalanceBinaryTree {
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

    // System.out.println(checkBBT(root) ? "Balanced BBT " : "Not a Balanced BBT");
    System.out.println(optimisedCheckBBT(root) != -1 ? "Balanced BBT " : "Not a Balanced BBT");
  }


  /**
   * TC - O(N)
   * 
   * SC - O(N)
   * 
   */

  private static int optimisedCheckBBT(NodeTree root) {
    if (root == null)
      return 0;

    int lt = optimisedCheckBBT(root.left);
    if (lt == -1)
      return -1;
    int rt = optimisedCheckBBT(root.right);
    if (rt == -1)
      return -1;
    if (Math.abs(lt - rt) > 1)
      return -1;

    return 1 + Math.max(lt, rt);
  }

  /**
   * TC - O(N^2)
   * 
   * SC - O(N)
   * 
   * need to check the implementation
   */
  public static boolean checkBBT(NodeTree root) {

    if (root == null)
      return true;

    int lt = maxHeight(root.left);
    int rt = maxHeight(root.right);

    if (Math.abs(lt - rt) > 1)
      return false;

    boolean left = checkBBT(root.left);
    boolean right = checkBBT(root.right);

    if (!right || !left)
      return false;
    return false;
  }

  public static int maxHeight(NodeTree root) {
    if (root == null)
      return 0;
    int left = maxHeight(root.left);
    int right = maxHeight(root.right);


    return 1 + Math.max(left, right);
  }
}
