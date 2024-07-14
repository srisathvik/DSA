// package binary-search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println(binarySearch(arr, 50));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            // the below line is same as int mid = (start + end)/2
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}
