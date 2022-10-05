package DSA.DSAMock.DSA2;

public class DeleteMiddilElementInLInkList {

  static class Node {

    int data;
    Node next;
  }

  static Node newNode(int data) {
    Node temp = new Node();
    temp.data = data;
    temp.next = null;
    return temp;
  }

  static int countOfNode(Node head) {
    int count = 0;
    while (head != null) {
      head = head.next;
      count++;
    }
    return count;
  }

  static Node deleteMid(Node head) {
    if (head == null) return null;
    if (head.next == null) return null;
    Node copyHead = head;
    int count = countOfNode(head);
    int mid = count / 2;
    while (mid-- > 1) {
      head = head.next;
    }
    head.next = head.next.next;
    return copyHead;
  }

  static void printList(Node ptr) {
    while (ptr != null) {
      System.out.print(ptr.data + "->");
      ptr = ptr.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Node head = newNode(1);
    head.next = newNode(2);
    head.next.next = newNode(3);
    head.next.next.next = newNode(4);
    head.next.next.next.next = newNode(5);
    head.next.next.next.next.next = newNode(6);
    head.next.next.next.next.next.next = newNode(7);
    head.next.next.next.next.next.next.next = newNode(8);
    head.next.next.next.next.next.next.next.next = newNode(9);
    head.next.next.next.next.next.next.next.next.next = newNode(10);
    System.out.println("Given LinkList");
    printList(head);
    head = deleteMid(head);
    System.out.println("Delete Middle Data in linkedList");
    printList(head);
  }
}
