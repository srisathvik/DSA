package recursion;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int max_index, int length, int curr_index) {
        if (length == 0) {
            return;
        }
        if (curr_index < length) {
            if (arr[curr_index] > arr[max_index]) {
                selectionSort(arr, curr_index, length, curr_index + 1);
            } else {
                selectionSort(arr, max_index, length, curr_index + 1);
            }
        } else {
            int temp = arr[max_index];
            arr[max_index] = arr[length - 1];
            arr[length - 1] = temp;
            selectionSort(arr, 0, length - 1, 0);
        }
    }
}
