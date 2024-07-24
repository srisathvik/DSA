package recursion;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(linear_search(arr, 0, 8));
    }

    static boolean linear_search(int[] arr, int index, int num) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == num || linear_search(arr, index + 1, num);
    }
}
