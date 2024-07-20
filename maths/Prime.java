package maths;

//program to find prime numbers <= number.
public class Prime {
    public static void main(String[] args) {
        int number = 40;
        for (int i = 2; i < number; i++) {
            if (is_prime(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }

    static boolean is_prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
