package DSA.DSAMock.DSA2;

import java.util.NoSuchElementException;

public class Dequeue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public Dequeue(){
        this.front=null;
        this.rear=null;
    }
    private  class ListNode{
        private  int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public  boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if (isEmpty()){
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is alredy empty");
        }
        int result=front.data;
        front=front.next;
        if (front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public  void print(){
        if (isEmpty()){
            return;
        }
        ListNode current=front;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Dequeue queue=new Dequeue();
        queue.enqueue(10);
        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(7);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
