package maths;

public class Factors {
    public static void main(String[] args) {
        factors_until_sqrt(16);
    }

    // loops until num and print if num is divisible. O(n) is complexity.
    static void factors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    // loops until sqrt(num) and print i and quotient if num is divisible. O(sqrt n)
    // is complexity.
    static void factors_until_sqrt(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i != num / i) {
                    System.out.println(i + "\n" + num / i);
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
