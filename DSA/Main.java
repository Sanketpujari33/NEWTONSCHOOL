package DSA;

import java.util.HashMap;

public class Main {
    static class Node {
        int data;
        Node next;
    };

    static Node head;

    static void append(int new_data) {
        Node new_node = new Node();
        Node last = head;
        new_node.data = new_data;
        new_node.next = null;
        if (head == null) {
            head = new_node;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
    static int getFirstDuplicate(Node node) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Node head = node;
        while (node != null) {
            if (mp.containsKey(node.data))
                mp.put(node.data, mp.get(node.data) + 1);
            else
                mp.put(node.data, 1);
            node = node.next;
        }
        node = head;
        while (node != null) {
            if (mp.get(node.data) > 1)
                return node.data;
            node = node.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        head = null;

        append(6);
        append(2);
        append(1);
        append(6);
        append(2);
        append(1);
        append(1);
        System.out.print(getFirstDuplicate(head));
        
    }
}
