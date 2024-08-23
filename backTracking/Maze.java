
import java.util.*;;

public class Maze {
    public static void main(String[] args) {
        // path("", 3, 3);
        // System.out.println(pathRetDiag("", 3, 3));
        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true },
        };
        pathwithRestriction("", maze, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int up = count(r - 1, c);
        int left = count(r, c - 1);
        return up + left;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }

    static void pathwithRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathwithRestriction(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathwithRestriction(p + "R", maze, r, c + 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + "H", r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRetDiag(p + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiag(p + "H", r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(pathRetDiag(p + "D", r - 1, c - 1));
        }
        return list;
    }
}
