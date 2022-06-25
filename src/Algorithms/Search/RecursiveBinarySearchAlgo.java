package Algorithms.Search;

import java.util.Arrays;

public class RecursiveBinarySearchAlgo {
    public static void main(String[] args) {
        //Binary Search works on sorted Elements only so we sort the array first//
        int[] numbers = {3, 7, -23, 56, 92, -54, 17};
        Arrays.sort(numbers);
        System.out.println(recursiveBinarySearch(numbers,3));
        System.out.println(recursiveBinarySearch(numbers, -54));
        System.out.println(recursiveBinarySearch(numbers, 92));
        System.out.println(recursiveBinarySearch(numbers, 8));
    }
    public static int recursiveBinarySearch(int[] theArray, int target){
       return recursiveBinarySearch(theArray,target,0,theArray.length);
    }
    public static int recursiveBinarySearch(int[] anArray, int target, int start, int end){
        if(start >= end){
            return -1;
        }
        int middle = (start + end)/2;
        if(anArray[middle] == target){
            return middle;
        }
        else if(anArray[middle] < target){
            return recursiveBinarySearch(anArray,target,middle + 1,end);
        }
        else{
            return recursiveBinarySearch(anArray,target,start,middle);
        }
    }
}
