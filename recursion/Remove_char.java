package recursion;

public class Remove_char {
    public static void main(String[] args) {
        String s = "parachute";
        System.out.println(remove_char(s, 'a'));
        System.out.println(remove_subString("pineapple", "apple"));
    }

    static String remove_char(String s, char a) {
        if (s.length() == 0) {
            return s;
        }
        if (s.charAt(0) == a) {
            return remove_char(s.substring(1), a);
        }
        return s.charAt(0) + remove_char(s.substring(1), a);
    }

    static String remove_subString(String s, String sub) {
        if (s.length() == 0) {
            return "";
        }
        if (s.startsWith(sub)) {
            return remove_subString(s.substring(sub.length()), sub);
        }
        return s.charAt(0) + remove_subString(s.substring(1), sub);
    }
}
