package com.bhavyakaria.cp.data_structures;

/**
 * @author Bhavya Karia
 * created on 09/07/20
 */
public class LinkedList {
    public int size = 0;
    public static Node head = null;
    public static Node tail = null;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node node = new Node(5);
        linkedList.add(node);

        Node node2 = new Node(6);
        linkedList.addFirst(node2);

        System.out.println(linkedList.toString());
    }

    public void add(Node node) {
        addLast(node);
    }

    public boolean isEmpty() {
        return size <= 0;
    }
    public void addLast(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node start = head;
        while (start != null) {
            sb.append(start.data);
            start = start.next;
            if (start != null) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
