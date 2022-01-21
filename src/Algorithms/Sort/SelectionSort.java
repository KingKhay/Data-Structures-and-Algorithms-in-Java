package Algorithms.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){

       int[] arrayOfIntegers = {34,61,-9,4,-31,13,92};
        //Outer Loop starting from the last index to index 1//
       for(int lastIndexToBeSorted = arrayOfIntegers.length-1;lastIndexToBeSorted>0;lastIndexToBeSorted--){
           //Assume the largest element is at index 0//
           int largestElementIndex = 0;
           //Start from index 1 and compare each value to the largest element index//
           for(int i=1; i<=lastIndexToBeSorted;i++){
               if(arrayOfIntegers[i]>arrayOfIntegers[largestElementIndex]){
                   largestElementIndex = i;
               }
           }
           swap(arrayOfIntegers,largestElementIndex,lastIndexToBeSorted);
       }
        Arrays.stream(arrayOfIntegers)
                .forEach(System.out::println);
    }

    //A swap method to interchange the values//
    public static void swap(int[] intArray,int i,int j){
        if(i==j){
            return;
        }
        else{
            //Store the value of one of the elements in a temporary variable//
            int temp = intArray[i];
            //Set the stored element to the un-stored element//
            intArray[i]= intArray[j];
            //Set the un-stored element to the temporary variable//
            intArray[j] = temp;
        }
    }
}
