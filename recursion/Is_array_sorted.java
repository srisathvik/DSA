package recursion;

public class Is_array_sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 5, 6, 7 };
        System.out.println(is_array_sorted(arr, 0));
    }

    static boolean is_array_sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index + 1] && is_array_sorted(arr, index + 1));
    }
}
