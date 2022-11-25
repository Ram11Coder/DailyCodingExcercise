package tree;

/**
 * We can solve this problem any of the traversal algorithm
 * 
 * I have used preOrder traversal
 * 
 */
public class TwoTreesAreIdentical {
  public static void main(String[] args) {
    NodeTree root1 = new NodeTree(1);
    root1.left = new NodeTree(2);
    root1.right = new NodeTree(3);
    root1.left.left = new NodeTree(4);
    root1.left.right = new NodeTree(5);
    root1.left.right.left = new NodeTree(8);
    root1.right.left = new NodeTree(6);
    root1.right.right = new NodeTree(7);
    root1.right.right.left = new NodeTree(9);
    root1.right.right.right = new NodeTree(10);


    NodeTree root2 = new NodeTree(1);
    root2.left = new NodeTree(2);
    root2.right = new NodeTree(3);
    root2.left.left = new NodeTree(4);
    root2.left.right = new NodeTree(5);
    root2.left.right.left = new NodeTree(8);
    root2.right.left = new NodeTree(6);
    root2.right.right = new NodeTree(7);
    root2.right.right.left = new NodeTree(9);
    root2.right.right.right = new NodeTree(11);

    System.out
        .println("Both tree are " + (isIdentical(root1, root2) ? "Identical" : "Not identical"));
  }

  private static boolean isIdentical(NodeTree p, NodeTree q) {

    if (p == null || q == null)
      return p == q;

    return p.data == q.data && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
  }
}
