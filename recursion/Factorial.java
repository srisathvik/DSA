package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    // returns factorial of a number.
    static int factorial(int num) {
        if (num < 0) {
            return 0;
        }
        if (num < 2) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
