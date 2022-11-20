package linkedlist;

public class SinglyLinkedlist {
  int data;
  SinglyLinkedlist next;
  static int count;

  public SinglyLinkedlist(int data) {
    this.data = data;
    this.next = null;
  }

  public SinglyLinkedlist() {}

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public SinglyLinkedlist getNext() {
    return next;
  }

  public void setNext(SinglyLinkedlist next) {
    this.next = next;
  }

  public int getCount() {
    return count;
  }

  public static void insertNode(int data, SinglyLinkedlist head) {
    count++;
    if (head == null) {
      head = new SinglyLinkedlist(data);
      return;
    }
    SinglyLinkedlist newNode = new SinglyLinkedlist(data);
    SinglyLinkedlist temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  public static void deleteNode(SinglyLinkedlist head) {

    if (head == null) {
      return;
    }
    count--;

    head = head.next;

  }

  public static void print(SinglyLinkedlist head) {

    if (head == null) {
      return;
    }
    SinglyLinkedlist temp = head;


    while (temp != null) {
      System.out.print("[" + temp.data + "] ");
      temp = temp.next;
    }
    System.out.println();
  }
}
