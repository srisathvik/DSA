package bitManipulation;

// returns the integer value which doesnt repeated two times.
public class Non_repeated_number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 5, 1, 2, 3 };
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
