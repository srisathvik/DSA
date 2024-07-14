package selectionSort;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectionSort(int[] arr) {

        // sort by keeping smallest at first.

        // int length = arr.length - 1;
        // for (int i = 0; i < length; i++) {
        // int smallest = i;
        // for (int j = i + 1; j <= length; j++) {
        // if (arr[j] < arr[smallest]) {
        // smallest = j;
        // }
        // }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }
        // return arr;

        // sort by keeping largest element at last.
        int length = arr.length - 1;
        for (int i = length; i > 0; i--) {
            int max_index = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[max_index] < arr[j]) {
                    max_index = j;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
