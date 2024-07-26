package recursion;

public class Pattern {
    public static void main(String[] args) {
        printPattern1(5);
    }

    static void printPattern1(int num) {
        if (num == 0) {
            return;
        }
        printPattern1(num - 1);
        printLine(num);

        System.out.println();

    }

    static void printLine(int num) {
        if (num < 1) {
            return;
        }
        System.out.print("*");
        printLine(num - 1);
    }
}
