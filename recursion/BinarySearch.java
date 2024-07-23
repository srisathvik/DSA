package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 0, arr.length, 9));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, end, target);
        } else if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        }
        return mid;
    }
}
