package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
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
    inorderTraversal_recursive(root);
    System.out.println("\nIterative Approach : ");
    inorderTraversal_iterative(root);

  }

  /**
   * TC -O(n)
   *
   * SC ~ O(n) or Height of the tree
   */
  private static void inorderTraversal_iterative(NodeTree root) {
    List<Integer> list = new ArrayList<>();
    Stack<NodeTree> st = new Stack<>();
    NodeTree node = root;
    while (true) {

      if (node != null) {
        st.push(node);
        node = node.left;
      } else {
        if (st.isEmpty())
          break;
        node = st.pop();
        list.add(node.data);
        node = node.right;
      }
    }
    System.out.println(list);

  }


  /**
   * TC -O(n)
   *
   * SC ~ O(n) or Height of the tree
   */
  private static void inorderTraversal_recursive(NodeTree root) {
    if (root == null)
      return;

    inorderTraversal_recursive(root.left);
    System.out.print(root.data + " ");
    inorderTraversal_recursive(root.right);
  }
}
