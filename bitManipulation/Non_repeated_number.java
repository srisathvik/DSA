package bitManipulation;

// import java.util.*;
import java.lang.Math;
// import java.util.Arrays;

// returns the integer value which doesnt repeated n times.
public class Non_repeated_number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 5, 1, 2, 3, 7, 7 };
        // System.out.println(not_repeated_two_times(arr));
        not_repeated_n_times(arr, 2);
        // decimal_to_binary(arr);
    }

    static int not_repeated_two_times(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    static int not_repeated_n_times(int[] arr, int n) {
        int[] binary = new int[35];
        for (int i = 0; i < arr.length; i++) {
            binary = decimal_to_binary(binary, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            binary[i] = binary[i] % n;
        }
        System.out.println(binary_to_decimal(binary));
        return 0;
    }

    static int[] decimal_to_binary(int[] binary, int num) {
        int id = 0;
        // System.out.println(Arrays.toString(binary));
        // Number should be positive
        while (num > 0) {
            binary[id] = binary[id] + num % 2;
            id++;
            num = num / 2;
        }

        // Print Binary
        return binary;
    }

    static int binary_to_decimal(int[] binary) {
        // System.out.println(Arrays.toString(binary));
        int num = 0;
        for (int i = 0; i < binary.length; i++) {
            num = num + binary[i] * (int) Math.pow(2, i);
        }
        return num;
    }
}
