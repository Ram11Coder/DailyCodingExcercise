package linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
  public static void main(String[] args) {

    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(4, head);
    SinglyLinkedlist.insertNode(5, head);

    System.out.println("Printing linked list :");
    SinglyLinkedlist.print(head);

    System.out.println("Printing reverse of linked list :");
    SinglyLinkedlist.print(reverseLinkedlist(head));

    // System.out.println("Printing reverse of linked list (stack based) :");
    // SinglyLinkedlist.print(stackBasedApproach(head));
  }


  // Reversing the linkedlist using dummy pointer
  public static SinglyLinkedlist reverseLinkedlist(SinglyLinkedlist head) {

    SinglyLinkedlist dummy = null, next;

    while (head != null) {
      next = head.next;
      head.next = dummy;
      dummy = head;
      head = next; 
    }

    return dummy;

  }


  private static SinglyLinkedlist stackBasedApproach(SinglyLinkedlist head) {
    Stack<Integer> st = new Stack<>();
    SinglyLinkedlist temp = head;
    while (temp != null) {
      st.push(temp.data);
      temp = temp.next;
    }
    temp = head;
    while (temp != null) {
      temp.setData(st.pop());
      temp = temp.next;
    }
    return head;
  }
}
