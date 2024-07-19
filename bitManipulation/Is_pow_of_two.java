package bitManipulation;

public class Is_pow_of_two {

    public static void main(String[] args) {
        System.out.println(is_pow_of_two(0));
    }

    static boolean is_pow_of_two(int num) {

        /*
         * if number is power of two the binary of num & num - 1 is 0
         * for 8 => (1000) & (111) => 0 =>8 is pow of 2
         * for 6 => (110) & (101) => 100 => 6 is not pow of 2
         */
        if (num == 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }
}