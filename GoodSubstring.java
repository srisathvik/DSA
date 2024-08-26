public class GoodSubstring {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println("sol: " + count(s, 0, 0));
    }

    static long count(String s, int start, int end) {
        long sol = 0;
        if (end == s.length()) {
            return 0;
        } else if (start > end) {
            sol += count(s, 0, end + 1);
        } else {
            String sub = s.substring(start, end + 1);
            // System.out.println(sub);
            int num = Integer.parseInt(sub);
            if (sub.charAt(0) != '0' && num % 2 != 0) {
                sol = 1;
            }
            sol += count(s, start + 1, end);
        }
        return sol;
    }
}
