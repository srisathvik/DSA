package practiceDump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 2 };
        System.out.println(isValid(5, arr));
        // int sum = arraySum(arr);
        // if (sum % 3 != 0) {
        // System.out.println("false");
        // } else {
        // System.out.println(allSubArrays(new ArrayList<Integer>(), arr, 0, arr.length
        // - 1, sum));
        // }
        // allSubArrays(new ArrayList<Integer>(), arr, 0, arr.length - 1);

    }

    static int arraySum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    static boolean isValidExists(int[] arr, int sum) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        if (temp[0] == sum / 3) {
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            temp[i] = temp[i - 1] + arr[i];
            if (temp[i] == sum / 3) {
                return true;
            }
        }
        return false;
    }

    static boolean allSubArrays(List<Integer> subArr, int[] originalArray, int start, int end, int sum) {
        boolean ans = false;
        if (start > end) {
            System.out.println(subArr);
            if (subArr.stream().reduce(0, (a, b) -> a + b) == sum / 3)
                return true;
            return false;
        }
        ans = ans || allSubArrays(subArr, originalArray, start + 1, end, sum);
        ArrayList<Integer> copy = new ArrayList<>(subArr);
        copy.add(originalArray[start]);
        ans = ans || allSubArrays(copy, originalArray, start + 1, end, sum);
        return ans;
    }

    static int isValid(int n, int[] arr) {

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        if (sum % 3 != 0) {
            return 0;
        }

        int target = sum / 3;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
        }

        return dp[target] ? 1 : 0;
    }
}
