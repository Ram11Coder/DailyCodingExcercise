package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    System.out.println("Recursive : ");
    postorderTraversal_recursive(root);

    System.out.println("\nIterative using 2 stacks : ");
    postorderTraversal_using2stacks(root);

    System.out.println("\nIterative using 1 stacks : ");
    postorderTraversal_using1stack(root);

  }

  private static void postorderTraversal_using1stack(NodeTree root) {

    Stack<NodeTree> st = new Stack<>();
    NodeTree curr = root;
    List<Integer> list = new ArrayList<Integer>();
    while (curr != null || !st.isEmpty()) {

      if (curr != null) {
        st.push(curr);
        curr = curr.left;
      } else {
        NodeTree temp = st.peek().right;

        if (temp == null) {
          temp = st.peek();
          st.pop();
          list.add(temp.data);
          while (!st.isEmpty() && temp == st.peek().right) {
            temp = st.peek();
            st.pop();
            list.add(temp.data);
          }
        } else {
          curr = temp;
        }
      }
    }
    System.out.println(list);
  }

  private static void postorderTraversal_using2stacks(NodeTree root) {

    Stack<NodeTree> st1 = new Stack<NodeTree>();

    Stack<NodeTree> st2 = new Stack<NodeTree>();
    NodeTree node = root;
    st1.push(node);

    while (!st1.isEmpty()) {
      node = st1.pop();

      st2.push(node);
      if (node.left != null) {
        st1.push(node.left);
      }
      if (node.right != null) {
        st1.push(node.right);
      }

    }

    while (!st2.isEmpty()) {
      System.out.print(st2.pop().data + " ");
    }
  }

  private static void postorderTraversal_recursive(NodeTree root) {
    if (root == null)
      return;

    postorderTraversal_recursive(root.left);
    postorderTraversal_recursive(root.right);
    System.out.print(root.data + " ");
  }
}
