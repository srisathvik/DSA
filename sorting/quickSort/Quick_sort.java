package quickSort;

import java.util.*;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick_sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick_sort(arr, low, e);
        quick_sort(arr, s, high);
    }
}
