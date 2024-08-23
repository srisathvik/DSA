package jobAThonAug2024;

import java.util.ArrayList;
import java.util.Arrays;

public class Special_SubArray {
    public static void main(String[] args) {
        System.out.println("null");
        int[] arr = { 15, 7, 8 };
        int k = 2;
        int n = 4;
        ArrayList<int[]> ans = getCount(arr, n, k);
        System.out.println("ans: " + ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(Arrays.toString(ans.get(i)));
        }

    }

    static ArrayList<int[]> getCount(int[] arr, int n, int k) {
        if (arr.length == 1) {
            ArrayList<int[]> element = new ArrayList<>();
            element.add(arr);
            return element;
        }
        ArrayList<int[]> list = new ArrayList<>();
        int[] left = Arrays.copyOfRange(arr, 0, arr.length - 1);
        ArrayList<int[]> excludeRight = getCount(left, n, k);
        int[] right = Arrays.copyOfRange(arr, 1, arr.length);
        ArrayList<int[]> excludeLeft = getCount(right, n, k);
        list.add(arr);
        list.addAll(excludeLeft);
        list.addAll(excludeRight);
        return list;
    }
}
