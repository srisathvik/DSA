package maths;

public class Prime_sieve {

    public static void main(String[] args) {
        prime_sieve(40);
    }

    // find prime numbers until given num.
    static void prime_sieve(int num) {
        boolean[] primes = new boolean[num + 1];
        for (int i = 2; i * i < num; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (!primes[i]) {
                System.out.println(i + " ");
            }
        }
    }
}