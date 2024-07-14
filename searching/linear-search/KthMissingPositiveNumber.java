//  Question: Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

//  Return the kth positive integer that is missing from this array.

public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        System.out.println(missingNumber(arr, 1));
    }

    static int missingNumber(int[] arr, int k) {
        int count = 0;
        int number = 1;
        int index = 0;
        while (count != k && index < arr.length) {
            if (number != arr[index]) {
                count++;
            } else {
                index++;
            }
            number++;

        }
        if (count == k) {
            return number - 1;
        } else {
            return -1;
        }
    }
}