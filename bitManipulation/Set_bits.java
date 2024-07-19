package bitManipulation;

public class Set_bits {

    public static void main(String[] args) {
        System.out.println(set_bits(7));
    }

    // right_shift is my solution.
    static int right_shift(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num >> 1;
        }
        return count;
    }

    // viewed answer.
    static int set_bits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num -= (num & -num);
        }
        return count;
    }
}