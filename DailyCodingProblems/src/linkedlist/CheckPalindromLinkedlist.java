package linkedlist;

public class CheckPalindromLinkedlist {
  public static void main(String[] args) {
    SinglyLinkedlist head = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(3, head);
    SinglyLinkedlist.insertNode(2, head);
    SinglyLinkedlist.insertNode(1, head);
    System.out
        .println(ispalindrome(head) ? "Given LL is Palindrome " : "Given LL is not palindrome");

  }

  private static boolean ispalindrome(SinglyLinkedlist head) {

    if (head == null || head.next == null) {
      return true;
    }

    // Use 2 pointer to find the middle of linkedlist
    SinglyLinkedlist slowPtr = head, fastPtr = head;
    while (fastPtr.next != null && fastPtr.next.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }

    // Reverse the other part of linkedlist
    slowPtr.next = reverseList(slowPtr.next);

    // Move the slowptr to next half
    slowPtr = slowPtr.next;

    SinglyLinkedlist temp = head;
    /*
     * System.out.println("after reversal : "); SinglyLinkedlist.print(head);
     */

    while (slowPtr != null) {
      if (slowPtr.data != temp.data)
        return false;
      slowPtr = slowPtr.next;
      temp = temp.next;
    }

    return true;
  }

  private static SinglyLinkedlist reverseList(SinglyLinkedlist head) {
    SinglyLinkedlist pre = null, next = null;
    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
}
