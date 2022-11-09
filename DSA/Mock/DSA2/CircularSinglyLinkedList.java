package DSA.Mock.DSA2;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

  private ListNode last;
  private int length;

  private class ListNode {

    private ListNode next;
    private int data;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularSinglyLinkedList() {
    last = null;
    length = 0;
  }

  public int length() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void display() {
    if (last == null) {
      return;
    }
    ListNode first = last.next;
    while (first != last) {
      System.out.print(first.data + "<-->");
      first = first.next;
    }
    System.out.println(first.data);
  }

  public void insertFirst(int data) {
    ListNode newNode = new ListNode(data);
    if (last == null) {
      last = newNode;
    } else {
      newNode.next = last.next;
    }
    last.next = newNode;
    length++;
  }

  public void insertLast(int data) {
    ListNode newNode = new ListNode(data);
    if (last == null) {
      last = newNode;
      last.next = last;
    } else {
      newNode.next = last.next;
      last.next = newNode;
      last = newNode;
    }
    length++;
  }

  public void circularSinglyLinkedList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;
    last = fourth;
  }

  public ListNode deleteFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = last.next;
    if (last.next == last) {
      last = null;
    } else {
      last.next = temp.next;
    }
    temp.next = null;
    length--;
    return temp;
  }

  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.circularSinglyLinkedList();
    csll.insertLast(5);
    csll.insertFirst(0);
    csll.display();
    System.out.println(csll.deleteFirst().data);
    csll.display();
  }
}
