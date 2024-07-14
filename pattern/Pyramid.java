package pattern;

public class Pyramid {
    public static void main(String[] args) {
        dispaly(10);
    }

    static void dispaly(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
