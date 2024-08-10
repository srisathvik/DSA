package strings;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "asd");
        // System.out.println("null");
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            permutations(f + up.charAt(0) + l, up.substring(1));
        }
    }

}
