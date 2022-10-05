package DSA.Playground.LinkedList;

public class LL {

  Node head;
  private int size;

  LL() {
    this.size = 0;
  }

  class Node {

    String Data;
    Node next;

    Node(String data) {
      this.Data = data;
      this.next = null;
      size++;
    }
  }

  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void printList() {
    if (head == null) {
      System.out.print("List are empty");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.Data + "->");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("The list is empty");
      return;
    }
    size--;
    head = head.next;
  }

  public void deletelast() {
    if (head == null) {
      System.out.println("The list is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }
    secondLast.next = null;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("Pujari");
    list.addFirst("Sanket");
    list.printList();
    list.addLast("Pujari");
    list.addLast("poonam");
    list.printList();
    System.out.println(list.getSize());
  }
}
