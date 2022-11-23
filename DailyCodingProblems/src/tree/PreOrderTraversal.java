package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
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
    System.out.println("Recursive Approach : ");
    preOrderTraversal_recursive(root);
    System.out.println("\nIterative Approach : ");
    preOrderTraversal_iterative(root);
  }

  /**
   * TC -O(n)
   *
   * SC ~ O(n) or Height of the tree
   */
  private static void preOrderTraversal_iterative(NodeTree root) {

    List<Integer> list = new ArrayList<>();
    Stack<NodeTree> st = new Stack<>();

    st.push(root);

    while (!st.isEmpty()) {
      root = st.pop();
      list.add(root.data);

      if (root.right != null)
        st.push(root.right);

      if (root.left != null)
        st.push(root.left);
    }
    System.out.println(list);
  }


  /**
   * TC -O(n)
   *
   * SC ~ O(n)
   */
  private static void preOrderTraversal_recursive(NodeTree root) {

    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrderTraversal_recursive(root.left);
    preOrderTraversal_recursive(root.right);
  }
}
