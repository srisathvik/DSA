package mergeSort;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6 };
        merge_sort_inPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // creates copy of array at each recursion call and sort the array
    static int[] merge_sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] right = merge_sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {

        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
                k++;
            } else {
                ans[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }

    // modify the original array and sort the array.
    static void merge_sort_inPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        merge_sort_inPlace(arr, start, (start + end) / 2);
        merge_sort_inPlace(arr, (start + end) / 2, end);

        merge_inPlace(arr, start, (start + end) / 2, end);
    }

    static void merge_inPlace(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        // return mix;
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

}
