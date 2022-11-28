package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// ZigZag or Spiral Traversal
public class ZigZagTraversal {
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

    zigZag(root);
  }

  private static void zigZag(NodeTree root) {

    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Queue<NodeTree> q = new LinkedList<>();
    NodeTree node = root;

    q.offer(node);
    boolean flag = true;
    while (!q.isEmpty()) {

      int level = q.size();
      List<Integer> sublist = new ArrayList<Integer>();

      for (int i = 0; i < level; i++) {
        node = q.peek();

        if (node.left != null)
          q.offer(node.left);

        if (node.right != null)
          q.offer(node.right);

        // flag true store and flag false reverse and store
        if (flag)
          sublist.add(q.poll().data);
        else
          sublist.add(0, q.poll().data);
      }

      flag = !flag;
      list.add(sublist);
    }

    System.out.println(list);
  }
}
