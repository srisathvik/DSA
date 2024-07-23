package recursion;

public class Reverse_number {
    static int sum = 0;

    public static void main(String[] args) {
        reverse(435);
        System.out.println(sum);
    }

    // print number by reversing it.
    static void reverse(int num) {
        if (num == 0) {
            return;
        }
        sum = sum * 10 + (num % 10);
        reverse(num / 10);
    }
}
