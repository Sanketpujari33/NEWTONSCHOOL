package DSA.Mock.DSA2;

public class LinkelistMargeSort {

  class Node {

    int data;
    Node next;

    Node(int data) {
      data = data;
      next = null;
    }
  }

  public Node SortedMerge(Node A, Node B) {
    if (A == null) return B;
    if (B == null) return A;

    if (A.data < B.data) {
    //  A.next = SortedMerge(A.next, B);
      return A;
    } else {
     // B.next = SortedMerge(A, B.next);
      return B;
    }
  }

  public static void main(String[] args) {
    LinkelistMargeSort list1 = new LinkelistMargeSort();
  }
}
