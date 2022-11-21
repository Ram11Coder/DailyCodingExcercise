package linkedlist;

public class Merge2SortedList {
  public static void main(String[] args) {

    SinglyLinkedlist head1 = new SinglyLinkedlist(5);
    SinglyLinkedlist.insertNode(7, head1);
    SinglyLinkedlist.insertNode(9, head1);

    SinglyLinkedlist head2 = new SinglyLinkedlist(3);
    SinglyLinkedlist.insertNode(4, head2);
    SinglyLinkedlist.insertNode(8, head2);
    SinglyLinkedlist.insertNode(10, head2);

    bruteforce(head1, head2);
    optimal(head1, head2);


  }

  /**
   * TC - O(n+m)
   * 
   * SC -O(1)
   */
  private static void optimal(SinglyLinkedlist l1, SinglyLinkedlist l2) {
    if (l1 == null || l2 == null)
      return;

    if (l1.data > l2.data) {
      SinglyLinkedlist t = l1;
      l1 = l2;
      l2 = t;
    }

    SinglyLinkedlist res = l1;

    while (l1 != null && l2 != null) {
      SinglyLinkedlist temp = null;
      while (l1 != null && l1.data <= l2.data) {
        temp = l1;
        l1 = l1.next;
      }
      temp.next = l2;

      // Swap
      SinglyLinkedlist t = l1;
      l1 = l2;
      l2 = t;
    }

    SinglyLinkedlist.print(res);
  }

  /**
   * TC - O(n+m)
   * 
   * SC -O(n+m)
   */
  private static void bruteforce(SinglyLinkedlist head1, SinglyLinkedlist head2) {
    SinglyLinkedlist dummy = new SinglyLinkedlist();
    SinglyLinkedlist duplicateDummy = new SinglyLinkedlist();
    dummy.next = duplicateDummy;
    SinglyLinkedlist temp;
    SinglyLinkedlist temp1 = head1, temp2 = head2;

    while (temp1 != null && temp2 != null) {

      if (temp1.data <= temp2.data) {
        duplicateDummy.data = temp1.data;
        temp1 = temp1.next;
      } else {
        duplicateDummy.data = temp2.data;
        temp2 = temp2.next;
      }

      temp = new SinglyLinkedlist();
      duplicateDummy.next = temp;
      duplicateDummy = temp;
    }

    while (temp1 != null) {
      duplicateDummy.data = temp1.data;
      temp = new SinglyLinkedlist();
      duplicateDummy.next = temp;
      duplicateDummy = temp;
      temp1 = temp1.next;
    }

    while (temp2 != null) {
      duplicateDummy.data = temp2.data;
      temp = new SinglyLinkedlist();
      duplicateDummy.next = temp;
      duplicateDummy = temp;
      temp2 = temp2.next;
    }
    temp = null;
    duplicateDummy = null;

    SinglyLinkedlist.print(dummy.next);
  }

}
