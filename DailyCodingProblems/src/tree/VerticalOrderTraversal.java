package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Tuple {
  NodeTree node;
  int row;
  int col;

  public Tuple(NodeTree node, int row, int col) {
    this.node = node;
    this.row = row;
    this.col = col;
  }

}


public class VerticalOrderTraversal {
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
    verticalOrderTraversal(root);
  }

  private static void verticalOrderTraversal(NodeTree root) {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

    Queue<Tuple> q = new LinkedList<Tuple>();
    q.offer(new Tuple(root, 0, 0));
    while (!q.isEmpty()) {
      Tuple tuple = q.poll();
      NodeTree node = tuple.node;

      int x = tuple.row;
      int y = tuple.col;

      if (!map.containsKey(x))
        map.put(x, new TreeMap<>());

      if (!map.get(x).containsKey(y))
        map.get(x).put(y, new PriorityQueue<>());

      map.get(x).get(y).offer(node.data);

      if (node.left != null)
        q.offer(new Tuple(node.left, x - 1, y + 1));

      if (node.right != null)
        q.offer(new Tuple(node.right, x + 1, y + 1));
    }

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {

      list.add(new ArrayList<Integer>());
      for (PriorityQueue<Integer> nodes : ys.values()) {
        while (!nodes.isEmpty()) {
          list.get(list.size() - 1).add(nodes.poll());
        }
      }
    }
    System.out.println(list);
  }
}
