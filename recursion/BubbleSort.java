package recursion;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 2, 1 };
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int length, int curr_index) {
        if (length == 0) {
            return;
        }
        if (length > curr_index) {
            if (arr[curr_index] > arr[curr_index + 1]) {
                int temp = arr[curr_index];
                arr[curr_index] = arr[curr_index + 1];
                arr[curr_index + 1] = temp;
            }
            bubbleSort(arr, length, curr_index + 1);
        } else {
            bubbleSort(arr, length - 1, 0);
        }
    }
}
