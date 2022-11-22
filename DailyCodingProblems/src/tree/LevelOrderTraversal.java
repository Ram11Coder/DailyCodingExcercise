package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
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

    levelOrderTraversal(root);
  }

  private static void levelOrderTraversal(NodeTree root) {
    Queue<NodeTree> queue = new LinkedList<NodeTree>();

    List<List<Integer>> list = new LinkedList<List<Integer>>();

    if (root == null)
      return;
    queue.offer(root);

    while (!queue.isEmpty()) {

      List<Integer> subList = new ArrayList<Integer>();
      int levelSize = queue.size();

      for (int i = 0; i < levelSize; i++) {

        if (queue.peek().left != null)
          queue.offer(queue.peek().left);
        if (queue.peek().right != null)
          queue.offer(queue.peek().right);
        subList.add(queue.poll().data);
      }
      list.add(subList);

    }
    System.out.println(list);
  }
}
