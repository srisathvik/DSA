public class CeilingOfNumber {
    public static void main(String[] args) {
        CeilingOfNumber a = new CeilingOfNumber();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int ans = a.ceiling(arr, 17);
        System.out.println(ans);
    }

    int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
