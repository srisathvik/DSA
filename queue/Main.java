package queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.print();
        // queue.remove();
        queue.remove();
        queue.insert(10);
        queue.print();
        // queue.print();
    }
}
