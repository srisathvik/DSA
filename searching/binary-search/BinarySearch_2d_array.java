// public class BinarySearch_2d_array {
// public static void main(String[] args) {

// }

// static int[] BinarySearch(int[][] arr, int target) {
// int col = (arr[0].length - 1) / 2;
// int start = 0;
// int end = arr.length - 1;
// while (start <= end) {
// int mid = start + (end - start) / 2;
// if (arr[mid][mid] == target) {
// return new int[] { mid, mid };
// } else if (arr[mid][mid] > target) {
// end = mid;
// } else {
// start = mid;
// }
// }
// return new int[] { -1, -1 };
// }
// }
