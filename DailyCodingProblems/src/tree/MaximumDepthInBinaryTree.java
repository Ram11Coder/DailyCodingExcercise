package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We can solve this using
 * 
 * 1. recursion
 * 
 * 2. level order traversal
 * 
 * 
 */
public class MaximumDepthInBinaryTree {
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

    System.out.println("Max depth of BT : " + maxDepthUsingRecursion(root));
    System.out.println("Max depth of BT : " + maxDepthUsingBFS(root));
  }

  /**
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static int maxDepthUsingBFS(NodeTree root) {
    if (root == null)
      return 0;
    Queue<NodeTree> queue = new LinkedList<NodeTree>();
    queue.offer(root);
    int levelCount = 0;
    while (!queue.isEmpty()) {
      levelCount++;
      int level = queue.size();
      for (int i = 0; i < level; i++) {

        if (queue.peek().left != null)
          queue.offer(queue.peek().left);

        if (queue.peek().right != null)
          queue.offer(queue.peek().right);
        queue.poll();
      }
    }
    return levelCount;
  }

  /**
   * Easy and preferred approach TC - O(n)
   * 
   * SC - O(h) (Auxiliary spacce)
   * 
   * SC -O(n) - When tree is skew tree
   */
  private static int maxDepthUsingRecursion(NodeTree root) {

    if (root == null)
      return 0;
    int lt = maxDepthUsingRecursion(root.left);
    int rt = maxDepthUsingRecursion(root.right);


    return 1 + Math.max(lt, rt);
  }
}
