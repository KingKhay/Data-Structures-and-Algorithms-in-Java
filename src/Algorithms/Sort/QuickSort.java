package Algorithms.Sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {12,73,-9,45,20,-21};
        quickSort(numbers,0,numbers.length-1);
        Arrays.stream(numbers)
                .forEach(System.out::println);

    }
    public static void quickSort(int[] theArray,int start, int end){
        if(start<end){
            int pivotIndex = partition(theArray,start,end);
            quickSort(theArray,start,pivotIndex);
            quickSort(theArray,pivotIndex+1,end);
        }
    }
    public static int partition(int[] intArray,int start, int end){
        int i = start;
        int j = end;
        int pivot = intArray[start];
        while(i<j){
            //Do increment i if the element is lesser than or equal to the pivot element//
            if(intArray[i]<=pivot){
                i++;
            }
            //Do decrement j if the element is greater than the pivot element
            if(intArray[j]>pivot){
                j--;
            }
            if(i<j) {
                swap(intArray, i, j);
            }
        }
        swap(intArray,start,j);
        return j;
    }
    public static void swap(int[] theArray, int i , int j){
        if(i==j){
            return;
        }
        else{
            int temp = theArray[i];
            theArray[i] = theArray[j];
            theArray[j] = temp;
        }
    }
}
