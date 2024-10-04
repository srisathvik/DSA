package linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPosition(int value, int pos) {
        // Index start from 1.
        if (pos > size) {
            System.out.println("Position out of range");
            return;
        }
        if (pos == 0) {
            insertFirst(value);
            return;
        } else if (pos == size) {
            insertLast(value);
            return;
        }

        int curr = 1;
        Node temp = head;
        while (curr != pos) {
            temp = temp.next;
            curr++;
        }
        Node node = new Node(value, temp.next);
        // node.next = temp.next;
        temp.next = node;
        size++;
        return;

    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public int deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        int value = tail.value;
        tail = temp;
        size--;
        return value;
    }

    public int deleteAtIndex(int index) {
        if (index > size) {
            System.out.println("Index out of range");
        }
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();

        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }

}
