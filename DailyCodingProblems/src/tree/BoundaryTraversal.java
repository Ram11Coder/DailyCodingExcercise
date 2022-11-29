package tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
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
    boundaryTraversal(root);
  }
/**
 * TC - O(n)
 * 
 * SC - O(n)
 */
  private static void boundaryTraversal(NodeTree root) {

    List<Integer> res = new ArrayList<Integer>();

    if (root == null)
      return;
    if (!isLeaf(root))
      res.add(root.data);
    // traverse left boundary excluding leaf nodes
    addLeftBoundary(root, res);
    // Leaf node - PreOrder
    addLeafs(root, res);
    // traverse right boundary excluding leaf nodes
    addRightBoundary(root, res);

    System.out.println(res);
  }

  private static void addRightBoundary(NodeTree root, List<Integer> res) {
    NodeTree node = root.right;
    List<Integer> tmp = new ArrayList<Integer>();
    while (node != null) {
      if (!isLeaf(node))
        tmp.add(node.data);
      if (node.right != null)
        node = node.right;
      else
        node = node.left;
    }

    for (int i = tmp.size() - 1; i >= 0; i--) {
      res.add(tmp.get(i));
    }
  }

  // PreOrder traversal
  private static void addLeafs(NodeTree root, List<Integer> res) {

    // Root
    if (isLeaf(root)) {
      res.add(root.data);
      return;
    }
    // Left
    if (root.left != null)
      addLeafs(root.left, res);
    // Right
    if (root.right != null)
      addLeafs(root.right, res);
  }

  private static void addLeftBoundary(NodeTree root, List<Integer> res) {

    NodeTree node = root.left;

    while (node != null) {
      if (!isLeaf(node))
        res.add(node.data);
      if (node.left != null)
        node = node.left;
      else
        node = node.right;
    }
  }

  private static boolean isLeaf(NodeTree root) {
    return root.left == null && root.right == null;
  }
}
