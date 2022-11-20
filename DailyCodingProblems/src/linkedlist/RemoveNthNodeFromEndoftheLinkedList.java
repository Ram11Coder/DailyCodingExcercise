package linkedlist;

public class RemoveNthNodeFromEndoftheLinkedList {
  public static void main(String[] args) {
    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(4, head);
    SinglyLinkedlist.insertNode(5, head);
    SinglyLinkedlist.insertNode(6, head);
    int k = 6;

    // SinglyLinkedlist.print(removeNthNode_node(head, k));
    SinglyLinkedlist.print(removeNthNode_optimal(head, k));

  }


  /**
   * TC - O(n)
   * 
   * SC -O(1)
   */
  private static SinglyLinkedlist removeNthNode_optimal(SinglyLinkedlist head, int k) {

    SinglyLinkedlist dummy = new SinglyLinkedlist();
    dummy.next = head;
    SinglyLinkedlist slowPtr = dummy, fastPtr = dummy;

    for (int i = 1; i <= k; i++)
      fastPtr = fastPtr.next;

    while (fastPtr.next != null) {
      fastPtr = fastPtr.next;
      slowPtr = slowPtr.next;
    }

    // Removing the element
    slowPtr.next = slowPtr.next.next;

    // dummy.next will return head
    return dummy.next;
  }

  /**
   * TC - O(n+n)
   * 
   * SC -O(1)
   */
  private static SinglyLinkedlist removeNthNode_node(SinglyLinkedlist head, int k) {

    SinglyLinkedlist temp = head;
    int count = 0;

    while (temp != null) {
      count++;
      temp = temp.next;
    }
    count = count - k;
    if (count == 0) {
      head = head.next;
    } else {
      temp = head;
      while (count-- > 1) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }

    return head;
  }
}
