package DSA.Mock.DSA2;

class node {
  int data;
  node next;
  node(int Data) {
    data = Data;
    next = null;
  }
}
public class LL {
  node head;
  public int getNth(int index) {
    node current = head;
    int count = 0;
    while (current != null) {
      if (count == index) return current.data;
      count++;
      current = current.next;
    }
    assert (false);
    return 0;
  }

  public void push(int new_Data) {
    node new_Node = new node(new_Data);
    new_Node.next = head;
    head = new_Node;
  }

  public static void main(String[] args) {
    LL list = new LL();
    list.push(1);
    list.push(4);
    list.push(1);
    list.push(14);
    list.push(1);
    System.out.println("Element at index 3 is:- " + list.getNth(0));
  }
}
