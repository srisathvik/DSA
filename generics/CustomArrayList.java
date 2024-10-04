package generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 10;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        return (T) (data[--size]);
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        if (index >= 0 && index < size) {
            data[index] = value;
        }

        // @Override
        // public String toString(){
        // return "Custom Array List{" +
        // "data=" + Arrays.toString(data) +
        // ", size = " + size +
        // "}";
        // }

    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList();
        list.add(3);
        list.add(3);
        list.add(3);
        // list.get();
        // System.out.println(Arrays.toString(list));

    }
}
