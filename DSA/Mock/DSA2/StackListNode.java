package DSA.Mock.DSA2;

import java.util.EmptyStackException;

public class StackListNode {

  private ListNode top;
  private int length;

  private class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }
  public StackListNode(){
    top = null;
    length=0;
  }
  public int length(){
    return length;
  }
  public  boolean isEmpty(){
    return  length==0;
  }
  public void push(int data){
    ListNode temp= new ListNode(data);
    temp.next=top;
    top=temp;
    length++;
  }
  public int pop(){
    if(isEmpty()){
      throw new EmptyStackException();
    }
    int result =top.data;
    top=top.next;
    length--;
    return result;
  }
  public  int peek(){
    if (isEmpty()){
      throw new EmptyStackException();
    }
    return top.data;
  }
  public static void main(String[] args) {
    StackListNode Stock=new StackListNode();
    Stock.push(56);
    Stock.push(95);
    Stock.push(84);
    Stock.push(86);
    Stock.push(45);
    System.out.println(Stock.peek());
    Stock.pop();
    System.out.println(Stock.peek());
    Stock.pop();
    System.out.println(Stock.peek());
    Stock.pop();
    System.out.println(Stock.peek());
    Stock.pop();
    System.out.println(Stock.peek());
  }
}