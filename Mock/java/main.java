package Mock.java;

import java.util.*;

public class main {
  private Node head;

  private static class Node {
    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public void removeDulicate() {
    if (head == null) {
      return;
    }
    Node current = head;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public void rotedList(int k) {
    if (k == 0) {
      return;
    }
    Node current = head;
    int count = 1;

    while (count < k && current != null) {
      current = current.next;
      count++;
    }
    if (current == null) {
      return;
    }
    Node kNode = current;
    while (current.next != null) {
      current = current.next;
    }
    current.next = head;
    head = kNode.next;
    kNode.next = null;
  }

  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    main list = new main();
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      list.insert(arr[i]);
    }
    list.removeDulicate();
    list.rotedList(2);
    list.display();
  }
}