package DSA;

import DSA.DSAMock.DSA1.SecondMaxinumValue;

public class Main {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertFrist(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data){
        ListNode newNode=new ListNode(data);
        if (head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public int length(){
        int count=0;
        if (head==null){
            return 0;
        }

        ListNode currunt= head;

        while (currunt!=null){
            count++;
            currunt=currunt.next;
        }
        return count;
    }
    public  void insertPosition(int data, int position){
        ListNode newNode=new ListNode(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else {
            int count=1;
            ListNode priveous=head;
            while (count<position-1){
                priveous=priveous.next;
                count++;
            }
            ListNode current=priveous.next;
            newNode.next=current;
            priveous.next=newNode;
        }
    }
    public void print(){
        if (head==null){
            return;
        }
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public ListNode deleteFirst(){
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return  temp;
    }
    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode currunt=head;
        ListNode priveous=null;
        while (currunt.next!=null){
            priveous=currunt;
            currunt=currunt.next;
        }
        priveous.next=null;
        return currunt;
    }
    public ListNode deleteNodePosition(int postion){
     ListNode current=null;
     if(postion==1){
         ListNode temp=head;
         head=head.next;
         temp.next=null;
         return temp;
     }else{
         int count=1;
         ListNode priveous=head;
         while (count<postion-1){
             priveous=priveous.next;
             count++;
         }
         current=priveous.next;
         priveous.next=current.next;
     }
     return current;
    }
    public boolean searchNode(int data){
        ListNode current=head;
        while (current!=null){
            if (data==current.data){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public  ListNode reverseList(ListNode head){
        if (head==null){
            return head;
        }
        ListNode current=head;
        ListNode privous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
           current.next=privous;
           privous=current;
           current=next;
        }
        return privous;
    }
    public static void main(String[] args) {
        Main list=new Main();
        for (int i = 0; i <9 ; i++) {
            list.insertLast(i);
        }
        for (int i =10; i<20 ; i++) {
            list.insertLast(i);
        }
        list.insertPosition(20,20);
        System.out.println(list.deleteLast().data);
        System.out.println(list.deleteFirst().data);
        System.out.println(list.deleteNodePosition(7).data);
        System.out.println(list.searchNode(13));
        list.reverseList(list.head);
        list.print();
    }
}
