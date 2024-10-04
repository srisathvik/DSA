package linkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(0);
        list.insertLast(4);
        list.insertAtPosition(4, 4);
        list.insertAtPosition(43, 4);
        // list.deleteAtIndex(3);
        // list.print();
        list.display();
        list.displayReverse();
    }
}
