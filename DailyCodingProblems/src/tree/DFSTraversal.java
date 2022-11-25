package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * All DFS traversal in one go
 *
 */

public class DFSTraversal {
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

    dfsTraversal(root);


  }

  private static void dfsTraversal(NodeTree root) {

    if (root == null)
      return;
    List<Integer> preOrder = new ArrayList<Integer>();
    List<Integer> inOrder = new ArrayList<Integer>();
    List<Integer> postOrder = new ArrayList<Integer>();

    Stack<Pair> st = new Stack<Pair>();

    st.push(new Pair(root, 1));
    while (!st.isEmpty()) {
      Pair pair = st.pop();

      // This is part of PreOrder increment 1 to 2
      // Push left side of the tree
      if (pair.num == 1) {
        preOrder.add(pair.node.data);
        pair.num++;
        st.push(pair);

        if (pair.node.left != null)
          st.push(new Pair(pair.node.left, 1));

      }

      // This is part of inOrder increment 2 to 3
      // Push right side of the tree
      else if (pair.num == 2) {
        inOrder.add(pair.node.data);
        pair.num++;
        st.push(pair);

        if (pair.node.right != null)
          st.push(new Pair(pair.node.right, 1));

      }
      // don't push it again
      else {
        postOrder.add(pair.node.data);
      }
    }

    System.out.println("pre order  : " + preOrder);
    System.out.println("in order   : " + inOrder);
    System.out.println("post order : " + postOrder);
  }

}


class Pair {

  NodeTree node;
  int num;

  public Pair(NodeTree node, int num) {
    super();
    this.node = node;
    this.num = num;
  }

}
