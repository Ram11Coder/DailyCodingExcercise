package linkedlist;

public class Add2NumbersInGivenLL {
  public static void main(String[] args) {


    SinglyLinkedlist head1 = new SinglyLinkedlist(2);
    SinglyLinkedlist.insertNode(4, head1);
    SinglyLinkedlist.insertNode(3, head1);



    SinglyLinkedlist head2 = new SinglyLinkedlist(5);
    SinglyLinkedlist.insertNode(6, head2);
    SinglyLinkedlist.insertNode(7, head2);
    SinglyLinkedlist.insertNode(9, head2);
    System.out.println("List 1:");
    SinglyLinkedlist.print(head1);
    System.out.println("\nList 2:");
    SinglyLinkedlist.print(head2);

    // myInitialApproach(head1, head2);
    System.out.println("\nAddition of 2 lists:");
    SinglyLinkedlist.print(solution(head1, head2));
  }


  /**
   * TC - O(n+m)
   * 
   * SC - O(n+m)
   */
  private static SinglyLinkedlist solution(SinglyLinkedlist l1, SinglyLinkedlist l2) {

    SinglyLinkedlist dummy = new SinglyLinkedlist();
    SinglyLinkedlist temp = dummy;
    int carry = 0;
    while (l1 != null || l2 != null || carry == 1) {

      int sum = 0;

      if (l1 != null) {
        sum += l1.data;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.data;
        l2 = l2.next;
      }
      sum += carry;

      carry = sum / 10;
      SinglyLinkedlist newNode = new SinglyLinkedlist(sum % 10);
      temp.next = newNode;
      temp = newNode;

    }
    return dummy.next;
  }

  private static void myInitialApproach(SinglyLinkedlist head1, SinglyLinkedlist head2) {
    SinglyLinkedlist temp = new SinglyLinkedlist();
    SinglyLinkedlist tempBackup = new SinglyLinkedlist();
    tempBackup.next = temp;
    SinglyLinkedlist l1 = head1, l2 = head2;

    int carry = 0, sum = 0;
    while (l1 != null && l2 != null) {
      sum = (l1.data + l2.data + carry) % 10;

      SinglyLinkedlist newNode = new SinglyLinkedlist(sum);
      temp.next = newNode;
      temp = newNode;
      carry = (l1.data + l2.data + carry) / 10;
      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {
      sum = (l1.data + carry) % 10;
      SinglyLinkedlist newNode = new SinglyLinkedlist(sum);
      temp.next = newNode;
      temp = newNode;
      l1 = l1.next;
    }

    while (l2 != null) {
      sum = (l2.data + carry) % 10;
      SinglyLinkedlist newNode = new SinglyLinkedlist(sum);
      temp.next = newNode;
      temp = newNode;
      l2 = l2.next;
    }

    if (carry != 0) {
      SinglyLinkedlist newNode = new SinglyLinkedlist(carry);
      temp.next = newNode;
      temp = newNode;
    }
    SinglyLinkedlist.print(tempBackup.next.next);
  }
}
