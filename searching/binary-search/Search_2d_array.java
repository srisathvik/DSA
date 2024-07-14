import java.util.Arrays;

public class Search_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(search(arr, 88)));
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        int[] ans = { -1, -1 };
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return ans;
    }
}
