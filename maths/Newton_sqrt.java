package maths;

public class Newton_sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int num) {
        double x = num;
        double root;
        while (true) {
            root = 0.5 * (x + (num / x));
            if (Math.abs(root - x) < 0.1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
