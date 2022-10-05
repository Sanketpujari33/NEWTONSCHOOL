package DSA.DSAMock.DSA2;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

  private ListNode head;
  private ListNode tail;
  private int length;

  private class ListNode {

    private int data;
    private ListNode previous;
    private ListNode next;

    public ListNode(int Data) {
      this.data = Data;
    }
  }

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return length == 0; //head==null;
  }

  public int length() {
    return length;
  }

  public void displayForward() {
    if (head == null) {
      return;
    }
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void displayBackward() {
    if (tail == null) {
      return;
    }
    ListNode temp = tail;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.previous;
    }
    System.out.println("null");
  }

  public void inserFirst(int data) {
    ListNode newNode = new ListNode(data);
    if (isEmpty()) {
      tail = newNode;
    } else {
      head.previous = newNode;
    }
    newNode.next = head;
    head = newNode;
    length++;
  }

  public void insetLast(int data) {
    ListNode newNode = new ListNode(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
    }
    tail = newNode;
    length++;
  }

  public ListNode deleteFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = head;
    if (head == tail) {
      tail = null;
    } else {
      head.next.previous = null;
    }
    head = head.next;
    temp.next = null;
    length--;
    return temp;
  }

  public ListNode deleteLast() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = tail;
    if (head == tail) {
      head = null;
    } else {
      tail.previous.next = null;
    }
    tail = tail.previous;
    temp.previous = null;
    length--;
    return temp;
  }

  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    for (int i = 0; i < 10; i++) {
      list.insetLast(i);
    }
    System.out.println(list.deleteLast().data);
    System.out.println(list.deleteLast().data);
    list.displayForward();
    list.displayBackward();
  }
}
