package linkedlist;

public class MiddleOfLinkedlist {
  public static void main(String[] args) {
    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(4, head);
    SinglyLinkedlist.insertNode(5, head);
    SinglyLinkedlist.insertNode(6, head);

    // Bruteforce
    // SinglyLinkedlist.print(bruteForce(head));
    SinglyLinkedlist.print(optimalSolution(head));

  }

  private static SinglyLinkedlist optimalSolution(SinglyLinkedlist head) {

    SinglyLinkedlist slowPtr = head, fastPtr = head;

    while (fastPtr != null && fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }

    return slowPtr;
  }

  /**
   * TC - O(n+n/2)
   * 
   * SC - O(1)
   */
  private static SinglyLinkedlist bruteForce(SinglyLinkedlist head) {
    int count = 0;
    SinglyLinkedlist temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }

    count = count / 2 + 1;
    temp = head;
    while (count-- > 1)
      temp = temp.next;

    return temp;

  }
}
