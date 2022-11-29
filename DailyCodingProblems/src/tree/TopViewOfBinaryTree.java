package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

class PairNode {
  int hd;
  NodeTree node;

  public PairNode(int hd, NodeTree node) {
    this.hd = hd;
    this.node = node;
  }
}


public class TopViewOfBinaryTree {
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
    topView(root);
  }

  /**
   * TC - O(n)
   *
   * SC - O(n)
   */
  private static void topView(NodeTree root) {

    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    Queue<PairNode> q = new LinkedList<PairNode>();

    List<Integer> res = new ArrayList<Integer>();

    if (root == null)
      return;
    map.put(0, root.data);
    q.add(new PairNode(0, root));
    while (!q.isEmpty()) {
      PairNode pn = q.remove();
      int hd = pn.hd;
      NodeTree node = pn.node;
      if (!map.containsKey(hd))
        map.put(hd, node.data);

      if (node.left != null)
        q.add(new PairNode(hd - 1, node.left));

      if (node.right != null)
        q.add(new PairNode(hd + 1, node.right));
    }


    for (Entry<Integer, Integer> entryset : map.entrySet()) {
      res.add(entryset.getValue());
    }
    System.out.println(res);
  }
}
