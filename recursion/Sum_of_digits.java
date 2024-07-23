package recursion;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum_of_digits(222));
    }

    // returns sum of digits of given number.
    static int sum_of_digits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sum_of_digits(num / 10);
    }
}
