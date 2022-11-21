package linkedlist;

/**
 * Can we delete the node without access to head node?
 *
 */
public class DeleteNodeInLinkedList {
  public static void main(String[] args) {

    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(4, head);
    SinglyLinkedlist.insertNode(5, head);
    System.out.println("Before delete operation:");
    SinglyLinkedlist.print(head);

    // delete the node
    SinglyLinkedlist temp = head;
    int i = 0;
    while (i++ < 2) {
      temp = temp.next;
    }
    System.out.println("\nNode to delete is : " + temp.data);

    /*
     * Solution
     * 
     * We can not delete the node without head, but copy the next pointer data to current node
     * 
     * move the pointer to next of next pointer
     *
     * 
     * 
     */
    int data = temp.next.data;
    temp.data = data;
    temp.next = temp.next.next;

    System.out.println("\nAfter delete operation:");

    SinglyLinkedlist.print(head);
  }
}
