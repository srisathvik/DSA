public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 7, 10, 14, 16, 20, 23, 24, 25, 26, 27, 28, 29, 30, 33, 35, 36, 38, 40, 44, 46, 48,
                50 };
        findRange(arr, 10);
    }

    static void findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = (end + (end - temp)) * 2;
        }
        int ans = binarySearch(arr, start, end, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
