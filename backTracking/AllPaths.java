// TODO

// package backTracking;

// import java.util.ArrayList;

// public class AllPaths {
// public static void main(String[] args) {

// }
// static void pathwithRestriction(String p, boolean[][] maze, int r, int c) {
// if (r == maze.length - 1 && c == maze[0].length - 1) {
// System.out.println(p);
// return;
// }
// if (!maze[r][c]) {
// return;
// }
// if (r < maze.length - 1) {
// pathwithRestriction(p + "D", maze, r + 1, c);
// }
// if (c < maze[0].length - 1) {
// pathwithRestriction(p + "R", maze, r, c + 1);
// }
// }
// }
