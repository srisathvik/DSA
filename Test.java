import java.util.*;

public class Test {
    // public static void main(String[] args) {
    // // System.out.println(31 & ((1 << 4) - 1));
    // // int[] arr = { 2, 4, 4, 4, 10, 9, 9 };
    // // int n = 7;
    // // int k = 3;
    // // for(int i = 0; i < arr.length; i++){
    // // System.out.print(Arrays.stream(arr).);
    // // }
    // // ArrayList<int[]> list = new ArrayList<int[]>();
    // // System.out.println("count: " + findCount(n, arr, k, list));
    // // int[] arr = { 1, 2, 3, 4, 5 };
    // // arr.String s = Arrays.toString(arr)
    // // .replace(",", "") // remove the commas
    // // .replace("[", "") // remove the right bracket
    // // .replace("]", ""); // remove the left bracket

    // // System.out.println(s.trim());
    // int[] arr1 = { 7, 7 };
    // int[] arr2 = { 1, 5, 9, 23, 12 };
    // maxSum();

    // }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int[] arr = { 42238051, -15436, -87468676, -358243, 933839885, 7137, 36478, 7729255, -11461608, -92473,
                -9353854, -566, 29660, 24172957, -1366, -60325932, -648607, -8914706, -5429715, 62687521, -8517347, 99,
                1569703, -352664787, -37842, -2421, 371780, -315002707, -718235, -575349, 16049, 319, 327283929,
                446004097, -2757, 508603, -39543, -358984, -53730, -33, -3918818, -517969, 754, 8398, 7275,
        };
        System.out.println(maximumProduct(45, arr, 21, 24));
        long a = -352664787;
        long b = -315002707;
        long temp = a * b;
        System.out.println(temp);

    }

    // public static ArrayList<Integer> boundarySum(int n, int[][] matrix) {
    // // code here
    // ArrayList<Integer> ans = new ArrayList<>();
    // for(int i = 0; i < n; i++){
    // for(int j = 0; j < n; j++){

    // }
    // }
    // }

    public static long maximumProduct(int n, int[] arr, int l, int r) {
        // code here

        long outerMax;
        long outerMin;
        long innerMax = arr[l - 1];
        long innerMin = arr[l - 1];
        if (l > 1) {
            outerMax = arr[0];
            outerMin = arr[0];
        } else {
            outerMax = arr[r];
            outerMin = arr[r];
        }

        for (int i = 0; i < n; i++) {
            if (i >= l - 1 && i <= r - 1) {
                if (arr[i] > innerMax) {
                    innerMax = arr[i];
                }
                if (arr[i] < innerMin) {
                    innerMin = arr[i];
                }
            } else {
                if (arr[i] > outerMax) {
                    outerMax = arr[i];
                }
                if (arr[i] < outerMin) {
                    outerMin = arr[i];
                }
            }
        }
        System.out.println(outerMin + " " + outerMax + " " + innerMin + " " +
                innerMax);
        // if ((innerMax < 0 && innerMin < 0) || (outerMax < 0 && outerMin < 0)) {
        // if (outerMin * innerMax > outerMax * innerMin) {
        // return outerMin * innerMax;
        // }
        // return outerMax * innerMin;
        // }

        long[] ans = { outerMax * innerMax, outerMax * innerMin, innerMax * outerMin, innerMin * outerMin };
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        return ans[3];
    }

    // static int crazyIntegers(int n) {
    // // Write your code here
    // int temp = n;
    // int l = 0;
    // int count = 0;
    // while (temp > 0) {
    // temp = temp / 10;
    // l++;
    // }
    // for (int i = 1; i < l; i++) {
    // count += Math.pow(2, i);
    // }
    // int tillNum = 0;
    // while (n > 0) {
    // if (n % 10 >= 2) {
    // tillNum++;
    // }
    // n = n / 10;
    // }
    // System.out.println((int) Math.pow(2, tillNum));
    // return count + (int) Math.pow(2, tillNum);

    // }

    // static long minOps(long a, long b) {
    // // code hereasfd
    // if (a > b) {
    // return -1;
    // }
    // if (a == b) {
    // return 0;
    // }
    // long count = 0;
    // while (a < b) {
    // long s = (long) Math.sqrt(b);
    // if (s * s > b) {
    // s--;
    // }
    // if (s >= a) {
    // if (s * s == b) {
    // count++;
    // b = s;
    // } else {
    // count = b - s * s;
    // b = s * s;
    // }
    // } else {
    // count = b - a;
    // b = a;
    // }
    // }
    // return count;
    // }

    // static int findCount(int n, int arr[], int k, ArrayList<int[]> list) {
    // int remWithNum = 0;
    // int remWithOutNum = 0;

    // list.add(arr);
    // if (arr.length == 0) {
    // return 0;
    // }
    // int isIncluded = 0;
    // int diff = Math.abs(Arrays.stream(arr).max().getAsInt() - arr[0] -
    // arr[arr.length - 1]);
    // // System.out.println("diff: " + diff);
    // // System.out.println("left: ");
    // // System.out.println("right: ");
    // // System.out.println(Arrays.toString(arr));
    // if (diff % k == 0) {
    // isIncluded = 1;
    // System.out.println(Arrays.toString(arr));
    // }

    // int[] leftSubArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
    // // list.forEach(value -> {
    // // if(Arrays.equals(leftSubArray, value)){
    // // left = true;
    // // };
    // // });
    // // Arrays.stream(arr).filter(i -> Arrays.equals(leftSubArray, i)).count();
    // if (!(list.stream().anyMatch(item -> Arrays.equals(item, leftSubArray)))) {
    // // list.forEach(value -> System.out.print(Arrays.toString(value)));
    // // System.out.println(list.contains(leftSubArray) == false);
    // remWithNum = findCount(n, leftSubArray, k, list);
    // }

    // int[] rightSubArary = Arrays.copyOfRange(arr, 1, arr.length);
    // if (!(list.stream().anyMatch(item -> Arrays.equals(item, rightSubArary)))) {
    // // System.out.println(list.contains(rightSubArary) == false);
    // remWithOutNum = findCount(n, rightSubArary, k, list);
    // }
    // return isIncluded + remWithNum + remWithOutNum;
    // }

    // static long fndMax(int n, int m, int[] arr1, int[] arr2) {
    // // code here
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // int start = 0;
    // int end = m - 1;
    // long ans = 0;
    // for (int i = 0; i < n; i++) {
    // if (Math.abs(arr1[i] - arr2[start]) > Math.abs(arr1[i] - arr2[end])) {
    // ans += Math.abs(arr1[i] - arr2[start]);
    // start++;
    // } else {
    // Math.abs(arr1[i] - arr2[end]);
    // end--;
    // }
    // }
    // return ans;
    // }

    // static int twoSubarrays(int n, int[] v) {
    // // Write your code here
    // int[] sumArr = new int[n];
    // sumArr[0] = v[0];
    // for (int i = 1; i < n; i++) {
    // sumArr[i] = sumArr[i - 1] + v[i];
    // }
    // int subLength = 1;
    // while (subLength <= n - 1) {
    // HashSet<Integer> vis = new HashSet<>();
    // vis.add(sumArr[subLength - 1]);
    // for (int i = subLength; i < n; i++) {
    // if (!vis.add(sumArr[i] - sumArr[i - subLength])) {
    // return 1;
    // }
    // }
    // subLength++;
    // }
    // return 0;
    // }
}
