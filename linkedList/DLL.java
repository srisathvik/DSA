package linkedList;

import linkedList.LL.Node;

public class DLL {
    private int size;
    private Node head;
    private Node tail;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
        size++;
        return;

    }

    public void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        node.prev = tail;
        tail = node;
        size++;
        return;

    }

    public void insertAtPosition(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
        }
        Node node = new Node(value);
        Node temp = head;
        int curr = 0;
        while (curr < index - 1) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        temp = node.next;
        temp.prev = node;
        return;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " <- ");
            node = node.prev;
        }
        System.out.print("Start");
    }

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
