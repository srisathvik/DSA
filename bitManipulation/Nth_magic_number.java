package bitManipulation;

public class Nth_magic_number {
    public static void main(String[] args) {
        System.out.println(nth_magic_number(6));
    }

    static int nth_magic_number(int num) {
        int ans = 0;
        int base = 5;
        while (num > 0) {

            ans = ans + (num & 1) * base;
            // System.out.println(ans);
            num = num >> 1;
            base = base * 5;
        }
        return ans;
    }
}
