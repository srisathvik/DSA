
// import java.util.ArrayList;
import java.util.Arrays;

public class Special_SubArray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 4 };
        int k = 2;
        // int n = 4;
        int sol = getCount(arr, 0, 0, k);
        // for (int i = 0; i < sol.size(); i++) {
        // System.out.println(Arrays.toString(sol.get(i)));
        // }
        System.out.println(sol);

    }

    static int getCount(int[] arr, int start, int end, int k) {
        if (end == arr.length) {
            return 0;
        }

        // ArrayList<int[]> ans = new ArrayList<int[]>();
        else if (start > end) {
            return getCount(arr, 0, end + 1, k);
        } else {
            int curr = 0;
            int diff = Math.abs(
                    Arrays.stream(Arrays.copyOfRange(arr, start, end + 1)).max().getAsInt() - arr[start] - arr[end]);
            if (diff % k == 0) {
                curr = 1;
            }
            return curr + getCount(arr, start + 1, end, k);
        }
        // return 0;
    }
}
