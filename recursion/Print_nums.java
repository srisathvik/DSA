package recursion;

public class Print_nums {
    public static void main(String[] args) {
        print_One_to_N(5);
    }

    // print numbers from n to 1.
    static void print_N_to_One(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print_N_to_One(num - 1);
    }

    // print numbers from 1 to n.
    static void print_One_to_N(int num) {
        if (num == 0) {
            return;
        }
        print_One_to_N(num - 1);
        System.out.println(num);
    }
}
