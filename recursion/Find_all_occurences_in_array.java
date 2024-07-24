package recursion;

import java.util.*;

public class Find_all_occurences_in_array {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 2, 2, 7, 8, 9 };
        find_all_indexes(arr, 0, 2);
        System.out.println(list);
    }

    static void find_all_indexes(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        find_all_indexes(arr, index + 1, target);
    }
}
