package queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    public int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return end == data.length;
    }

    protected boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (end == 0) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (end == 0) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void print() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("End");
    }
}
