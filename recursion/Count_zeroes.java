package recursion;

public class Count_zeroes {
    public static void main(String[] args) {
        System.out.println(count_zeroes(0));
    }

    // count number of zeroes for a given number. Doesnt work for 0.
    static int count_zeroes(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 10 == 0) {
            return 1 + count_zeroes(num / 10);
        }
        return count_zeroes(num / 10);
    }
}
