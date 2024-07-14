public class Test {
    public static void main(String[] args) {
        // String a = "hello";
        // String b = "hello";
        // System.out.println(a == b);
        // System.out.println(a.equals(b));
        // a = "hi";
        // b = "hi";
        // System.out.println(a == b);
        // System.out.println(a.equals(b));
        // String greet = new String("hello");
        // String greet1 = new String("hello");
        // System.out.println(greet == greet1);
        // System.out.println(greet.equals(greet1));
        // System.out.println(33 + 22);
        // System.out.println('a' + 2);
        // System.out.println("a" + 2);
        // // StringBuilder ans = new StringBuilder();

        recursionFunction(5);

    }

    static void recursionFunction(int num) {
        if (num > 0) {
            recursionFunction(num - 1);
            System.out.println(num);
        }
        return;
    }
}
