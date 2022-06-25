package Algorithms.Search;

import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {

        //Since BinarySearch works on sorted Elements only we need to sort the Array First//
        int[] numbers = {3, 7, -23, 56, 92, -54, 17};
        Arrays.sort(numbers);
        //The sorted Array becomes {-54,-23,3,7,17,56,92}
        System.out.println(binarySearch(numbers, 3));
        System.out.println(binarySearch(numbers, -54));
        System.out.println(binarySearch(numbers, 92));
        System.out.println(binarySearch(numbers, 8));
    }

    public static int binarySearch(int[] theArray, int target) {
        int start = 0;
        int end = theArray.length;

        while (start < end) {
            int middle = (start + end) / 2;
            if (theArray[middle] == target) {
                return middle;
            } else if (theArray[middle] > target) {
                end = middle;
            } else {
                start = middle + 1;

            }
        }
        return -1;
    }
}
