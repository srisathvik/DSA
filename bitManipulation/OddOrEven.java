package bitManipulation;

// returns whether the number is odd or even.
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddEven(21) ? "Odd" : "even");
    }

    static boolean oddEven(int num) {
        return (num & 1) == 1;
    }
}