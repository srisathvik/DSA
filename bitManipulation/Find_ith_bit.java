package bitManipulation;

// program return the data(0 or 1) in the ith bit of a number
public class Find_ith_bit {
    public static void main(String[] args) {
        System.out.println(ithBit(17, 3) == true ? "1" : "0");
    }

    static boolean ithBit(int num, int i) {
        return ((num >> i - 1) & 1) == 1;
    }
}
