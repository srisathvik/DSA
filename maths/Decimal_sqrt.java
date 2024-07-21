package maths;

public class Decimal_sqrt {
    public static void main(String[] args) {
        System.out.println(decimal_sqrt(40, 3));
    }

    // prints sqrt of a number until p decimals
    static double decimal_sqrt(int num, int p) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        root = end;
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root < num) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }

}
