package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(0);
        // list.insertLast(4);
        // list.insertAtPosition(4, 4);
        // list.insertAtPosition(43, 4);
        // list.deleteAtIndex(3);
        // list.print();
        // list.display();
        // list.displayReverse();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        list.print();
        list.recursiveInsertion(7, 3);
        list.print();
        // System.out.println(list.reverseList());

    }
}
