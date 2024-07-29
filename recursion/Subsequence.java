package recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(subsequence_list("", "asdf"));
    }

    // prints all the substrings of a string.
    static void subsequence(String ans, String s) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        subsequence(ans + s.charAt(0), s.substring(1));
        subsequence(ans, s.substring(1));
    }

    // Returns an arraylist of substrings.

    static ArrayList<String> subsequence_list(String ans, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> left = subsequence_list(ans + s.charAt(0), s.substring(1));
        ArrayList<String> right = subsequence_list(ans, s.substring(1));
        left.addAll(right);
        return left;
    }
}
