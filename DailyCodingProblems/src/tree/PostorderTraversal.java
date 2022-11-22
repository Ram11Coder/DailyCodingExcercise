package tree;

public class PostorderTraversal {
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

    postorderTraversal(root);
  }

  private static void postorderTraversal(NodeTree root) {
    if (root == null)
      return;

    postorderTraversal(root.left);
    postorderTraversal(root.right);
    System.out.print(root.data + " ");
  }
}
