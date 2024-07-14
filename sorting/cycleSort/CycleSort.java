package cycleSort;

import java.util.*;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 5};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
