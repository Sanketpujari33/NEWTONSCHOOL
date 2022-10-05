package DSA.DSAMock.DSA2;

public class SinglyLinkedList {

  private ListNode head;

  private static class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public int length() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public void insertPosition(int data, int position) {
    ListNode newNode = new ListNode(data);
    if (position == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      newNode.next = current;
      previous.next = newNode;
    }
  }

  public ListNode deleteFirst() {
    if (head == null) {
      return null;
    }

    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }

  public ListNode deleteLast() {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous = null;
    while (current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null;
    return current;
  }

  public int deleteNodeGivenPostion(int postion) {
    ListNode cuurent;
    if (postion == 1) {
      head = head.next;
      return head.data;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < postion - 1) {
        previous = previous.next;
        count++;
      }
      cuurent = previous.next;
      previous.next = cuurent.next;
    }
    return cuurent.data;
  }

  public boolean searchNode(int data) {
    ListNode current = head;
    int count = 0;
    while (current != null) {
      count++;
      if (current.data == data) {
        System.out.print(count);
        return true;
      }
      current = current.next;
    }
    System.out.print("Not Found");
    return false;
  }

  public ListNode reverse(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public ListNode getMiddleNode() {
    if (head == null) {
      return null;
    }
    ListNode slwPr = head;
    ListNode fastPr = head;
    while (fastPr != null && fastPr.next != null) {
      slwPr = slwPr.next;
      fastPr = fastPr.next.next;
    }
    return slwPr;
  }

  public void display() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    System.out.println("NULL");
  }

  public ListNode grtNthNodeFromEnd(int n) {
    if (head == null) {
      return null;
    }
    if (n <= 0) {
      throw new IllegalArgumentException("Invalid value: n = " + n);
    }
    ListNode minPtr = head;
    ListNode rePtr = head;
    int count = 0;
    while (count < n) {
      if (rePtr == null) {
        throw new IllegalArgumentException(
          n + " is greter than number of node in list"
        );
      }
      rePtr = rePtr.next;
      count++;
    }
    while (rePtr != null) {
      rePtr = rePtr.next;
      minPtr = minPtr.next;
    }
    return minPtr;
  }

  public void removeDuplicate() {
    if (head == null) {
      return;
    }
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public ListNode insertSortedLInkedList(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      return newNode;
    }
    ListNode current = head;
    ListNode temp = null;
    while (current != null && current.data < newNode.data) {
      temp = current;
      current = current.next;
    }
    newNode.next = current;
    temp.next = newNode;
    return head;
  }

  public ListNode insertSortLV(int data) {
    ListNode newNode = new ListNode(data);
    if (head == null) {
      return newNode;
    }
    ListNode current = head;
    ListNode temp = null;
    while (current != null && current.data < newNode.data) {
      temp = current;
      current = current.next;
    }
    temp.next = newNode;
    newNode.next = current;
    return head;
  }

  public void deleteNode(int key) {
    ListNode current = head;
    ListNode temp = null;
    if (current != null && current.data == key) {
      head = current.next;
      return;
    }
    while (current != null && current.data != key) {
      temp = current;
      current = current.next;
    }
    if (current == null) {
      return;
    }
    temp.next = current.next;
  }

  public boolean containsLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;
    while (fastPtr != null && fastPtr != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        return true;
      }
    }
    return false;
  }

  public ListNode staringNodeLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;
    while (fastPtr != null && fastPtr != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        return getStartingNode(slowPtr);
      }
    }
    return null;
  }

  public ListNode getStartingNode(ListNode slowPtr) {
    ListNode temp = head;
    while (slowPtr != temp) {
      temp = temp.next;
      slowPtr = slowPtr.next;
    }
    return temp;
  }

  public void floydCycleDection() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;
    while (fastPtr != null && fastPtr != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        removeLoop(slowPtr);
        return;
      }
    }
  }

  public void removeLoop(ListNode slwoPtr) {
    ListNode temp = head;
    while (slwoPtr.next != temp.next) {
      temp = temp.next;
      slwoPtr = slwoPtr.next;
    }
    slwoPtr.next = null;
  }

  public static ListNode margeLinkedList(ListNode list1, ListNode list2) {
    ListNode dummyNode = new ListNode(0);
    ListNode tail = dummyNode;
    while (list1 != null && list2 != null) {
      if (list1.data <= list2.data) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }
    while (list1 != null) {
      tail.next = list1;
      list1 = list1.next;
      tail = tail.next;
    }
    while (list2 != null) {
      tail.next = list2;
      list2 = list2.next;
      tail = tail.next;
    }
    // if (list1==null){
    // tail.next=list1;
    // }else{
    // tail.next=list2;
    // }
    return dummyNode.next;
  }

  public static ListNode addSum(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    int carry = 0;
    while (list1 != null || list2 != null) {
      int x = (list1 != null) ? list1.data : 0;
      int y = (list2 != null) ? list2.data : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      tail.next = new ListNode(sum % 10);
      tail = tail.next;
      if (list1 != null) list1 = list1.next;
      if (list2 != null) list2 = list2.next;
    }
    if (carry > 0) {
      tail.next = new ListNode(carry);
    }
    return dummy.next;
  }

  public void createALoopInLinkedList() {
    ListNode first = new ListNode(1);
    ListNode secod = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);
    ListNode sexth = new ListNode(6);
    ListNode seventh = new ListNode(7);

    head = first;
    first.next = secod;
    secod.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sexth;
    sexth.next = seventh;
    seventh.next = third;
  }

  public static void main(String[] args) {
    SinglyLinkedList sli = new SinglyLinkedList();

    sli.createALoopInLinkedList();
    System.out.println(sli.containsLoop());
    System.out.println(sli.staringNodeLoop().data);
    sli.floydCycleDection();
    sli.display();
    sli.insertLast(1);
    sli.insertLast(3);
    sli.insertLast(5);
    sli.insertLast(7);

    SinglyLinkedList sli1 = new SinglyLinkedList();
    sli1.insertLast(2);
    sli1.insertLast(4);
    sli1.insertLast(6);
    sli1.insertLast(8);
    sli.display();
    sli1.display();
    SinglyLinkedList result = new SinglyLinkedList();
    result.head = margeLinkedList(sli.head, sli1.head);
    result.display();
    SinglyLinkedList result2 = new SinglyLinkedList();
    result2.head = addSum(sli1.head, sli1.head);
    result2.display();
  }
}
