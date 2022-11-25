package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DetetctACycleInLinkedList {
  public static void main(String[] args) {
    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(4, head);
    SinglyLinkedlist.insertNode(5, head);
    SinglyLinkedlist.insertNodeAtLast(head, head);

    // Approach 1 - Using hashmap
    usingHashing(head);
    // Approach 2 - Using 2 pointer
    using2Pointer(head);
  }

  private static void using2Pointer(SinglyLinkedlist head) {

    if (head == null || head.next == null)
      return;
    SinglyLinkedlist slowPtr = head, fastPtr = head;
    boolean flag = false;
    while (fastPtr != null && fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      if (slowPtr == fastPtr) {
        flag = true;
        break;
      }

    }
    if (flag)
      System.out.println("Linkedlist has cycle");
    else
      System.out.println("Linkedlist has no cycle");

  }

  /**
   * 
   * TC - O(n)
   * 
   * SC - O(n)
   */
  private static void usingHashing(SinglyLinkedlist head) {

    Map<SinglyLinkedlist, Integer> map = new HashMap<SinglyLinkedlist, Integer>();

    SinglyLinkedlist node = head;
    boolean flag = false;
    while (node != null) {
      if (map.containsKey(node)) {
        flag = true;
        break;
      }
      map.put(node, node.data);
      node = node.next;
    }
    if (flag)
      System.out.println("Linkedlist has cycle");
    else
      System.out.println("Linkedlist has no cycle");

  }
}
