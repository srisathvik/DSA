package bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 8, 1 };
        arr = (int[]) bubbleSort(arr);
        System.out.println(arr);
    }

    static int[] bubbleSort(int[] arr) {
        int i = arr.length - 1;
        while (i >= 1) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            i--;
        }
        return arr;
    }
}
