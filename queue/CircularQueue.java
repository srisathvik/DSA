package queue;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (end == 0) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void print() {
        // System.out.println(front + " " + end);
        // for (int i = front; i < end; i = (i + 1) % data.length) {
        // System.out.println(data[i] + " ");
        // }
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.println(data[i] + " ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("End");
    }
}
