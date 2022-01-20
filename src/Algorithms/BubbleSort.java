package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){

        int[] numbers = {3,7,-23,56,92,-54,7};
        //Outer Loop
        //Since the elements would be sorted from the back we start from the last index//
        for(int lastIndexToBeSorted = numbers.length-1;lastIndexToBeSorted > 0; lastIndexToBeSorted-- ){
            //Inner Loop
            //We traverse from the front and swap values that should be swapped to the last unsorted index//
            for(int i = 0; i<lastIndexToBeSorted;i++){
                //if the value at the current index is greater than that of the value in the next index we swap them or else move unto
                // the next index//
                if(numbers[i]>numbers[i+1]){
                    swap(numbers,i,i+1); 
                }
            }
        }
        Arrays.stream(numbers).forEach(System.out::println);
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
