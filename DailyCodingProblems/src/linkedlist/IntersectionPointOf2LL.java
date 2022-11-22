package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class IntersectionPointOf2LL {
  public static void main(String[] args) {


    SinglyLinkedlist head1 = new SinglyLinkedlist(1);
    SinglyLinkedlist.insertNode(2, head1);
    SinglyLinkedlist.insertNode(3, head1);
    SinglyLinkedlist newNode = new SinglyLinkedlist(6);
    SinglyLinkedlist.insertNodeAtLast(head1, newNode);
    SinglyLinkedlist.insertNode(4, head1);
    SinglyLinkedlist.insertNode(5, head1);


    SinglyLinkedlist head2 = new SinglyLinkedlist(5);
    SinglyLinkedlist.insertNode(12, head2);
    SinglyLinkedlist.insertNode(32, head2);
    SinglyLinkedlist.insertNode(14, head2);
    SinglyLinkedlist.insertNode(5, head2);
    SinglyLinkedlist.insertNodeAtLast(head2, newNode);

    System.out.println("List 1 : ");
    SinglyLinkedlist.print(head1);
    System.out.println("\nList 2 : ");
    SinglyLinkedlist.print(head2);

    // Approach 1
    // Iterate the node one by one to another linkedlist
    bruteforce(head1, head2);

    // Approach 2
    usingHashMap(head1, head2);

    // Approach 3
    optimalApproach1(head1, head2);

    // Approach 4
    optimalApproach2(head1, head2);

    // Approach 5
    optimisedAndeasyApproach(head1, head2);


  }

  /**
   * TC - O(n+m)
   * 
   * SC - O(1)
   */
  private static void optimisedAndeasyApproach(SinglyLinkedlist head1, SinglyLinkedlist head2) {

    if (head1 == null || head2 == null)
      return;
    SinglyLinkedlist l1 = head1, l2 = head2;
    // If l1 and l2 different len, will stop the loop after second iteration
    while (l1 != l2) {
      // For end of 1st iteration, reset the pointer to the head of another linkedlist
      l1 = (l1 == null) ? head2 : l1.next;
      l2 = (l2 == null) ? head1 : l2.next;

    }
    System.out.println("\nIntersection point is :" + l1 + ", data is " + l1.data);

  }

  /**
   * TC - O(n+m)
   * 
   * SC - O(1)
   */
  private static void optimalApproach2(SinglyLinkedlist head1, SinglyLinkedlist head2) {

    SinglyLinkedlist l1 = head1, l2 = head2;

    while (l1 != null || l2 != null) {

      if (l1 != null) {
        l1 = l1.next;
      } else {
        l1 = head2;
      }


      if (l2 != null) {
        l2 = l2.next;
      } else {
        l2 = head1;
      }


      if (l1 == l2) {
        System.out.println("\nIntersection point is :" + l1 + ", data is " + l1.data);

        break;
      }
    }

  }


  /**
   * TC - O(n+m)
   * 
   * SC - O(1)
   */
  private static void optimalApproach1(SinglyLinkedlist head1, SinglyLinkedlist head2) {

    SinglyLinkedlist l1 = head1, l2 = head2;

    int head1Count = 0, head2Count = 0;
    while (l1 != null) {
      head1Count++;
      l1 = l1.next;
    }

    while (l2 != null) {
      head2Count++;
      l2 = l2.next;
    }

    int diff = Math.abs(head1Count - head2Count);
    l1 = head1;
    l2 = head2;
    if (head1Count > head2Count) {
      l1 = head1;
      l2 = head2;
    } else {
      l2 = head1;
      l1 = head2;
    }
    while (diff-- > 0) {
      l1 = l1.next;
    }

    while (l1 != null && l2 != null) {
      if (l1 == l2) {
        System.out.println("\nIntersection point is :" + l2 + ", data is " + l2.data);
        break;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
  }

  /**
   * TC - O(n+m)
   * 
   * SC - O(n)
   */
  private static void usingHashMap(SinglyLinkedlist head1, SinglyLinkedlist head2) {

    Map<SinglyLinkedlist, Integer> map = new HashMap<>();
    SinglyLinkedlist l1 = head1, l2 = head2;
    while (l1 != null) {
      map.put(l1, l1.data);
      l1 = l1.next;
    }

    while (l2 != null) {
      if (map.containsKey(l2)) {
        System.out.println("\nIntersection point is :" + l2 + ", data is " + l2.data);

        break;
      }
      l2 = l2.next;
    }
  }


  /**
   * TC - O(n*m)
   * 
   * SC - O(1)
   */
  private static void bruteforce(SinglyLinkedlist head1, SinglyLinkedlist head2) {

    SinglyLinkedlist l1 = head1, l2;

    while (l1 != null) {
      boolean flag = false;
      l2 = head2;
      while (l2 != null) {
        if (l2.hashCode() == l1.hashCode()) {
          flag = true;
          break;
        }

        l2 = l2.next;
      }
      if (flag) {
        System.out.println("\nIntersection point is :" + l1 + ", data is " + l1.data);
        break;
      }
      l1 = l1.next;
    }
  }
}
