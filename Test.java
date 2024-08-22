import java.util.*;

public class Test {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 4, 4, 10, 9, 9 };
        int n = 7;
        int k = 3;
        for(int i = 0; i < arr.length; i++){
            System.out.print(Arrays.stream(arr).);
        }
        ArrayList<int[]> list = new ArrayList<int[]>();
        System.out.println("count: " + findCount(n, arr, k, list));

    }

    static int findCount(int n, int arr[], int k, ArrayList<int[]> list) {
        int remWithNum = 0;
        int remWithOutNum = 0;

        list.add(arr);
        if (arr.length == 0) {
            return 0;
        }
        int isIncluded = 0;
        int diff = Math.abs(Arrays.stream(arr).max().getAsInt() - arr[0] - arr[arr.length - 1]);
        // System.out.println("diff: " + diff);
        // System.out.println("left: ");
        // System.out.println("right: ");
        // System.out.println(Arrays.toString(arr));
        if (diff % k == 0) {
            isIncluded = 1;
            System.out.println(Arrays.toString(arr));
        }

        int[] leftSubArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
        // list.forEach(value -> {
        // if(Arrays.equals(leftSubArray, value)){
        // left = true;
        // };
        // });
        // Arrays.stream(arr).filter(i -> Arrays.equals(leftSubArray, i)).count();
        if (!(list.stream().anyMatch(item -> Arrays.equals(item, leftSubArray)))) {
            // list.forEach(value -> System.out.print(Arrays.toString(value)));
            // System.out.println(list.contains(leftSubArray) == false);
            remWithNum = findCount(n, leftSubArray, k, list);
        }

        int[] rightSubArary = Arrays.copyOfRange(arr, 1, arr.length);
        if (!(list.stream().anyMatch(item -> Arrays.equals(item, rightSubArary)))) {
            // System.out.println(list.contains(rightSubArary) == false);
            remWithOutNum = findCount(n, rightSubArary, k, list);
        }
        return isIncluded + remWithNum + remWithOutNum;
    }
}
