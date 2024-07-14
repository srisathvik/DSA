//Question:     ou are given an array arr. You are given number target which you have to search in the array 
//  and return the index of that element. If there are multiple matches then tell the index of the first matched element. 
//If there is no match, print -1.
public class IndexOfElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 2, 50, 60 };
        int ans = findIndex(arr, 77);
        System.out.println(ans);
    }

    static int findIndex(int[] arr, int target) {
        // if the array exists runs a loop for the array.
        for (int index = 0; index < arr.length; index++) {
            // if the target exists in the array returns the index.
            if (arr[index] == target) {
                return index;
            }
        }
        // if the array is doesnt exists or the target doesnt exist in the array returns
        // -1
        return -1;
    }
}