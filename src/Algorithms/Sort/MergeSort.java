package Algorithms.Sort;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {12,73,-9,45,20,-21};
        mergeSort(numbers,0,numbers.length-1);
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }
    public static void mergeSort(int[] intArray,int lowermost,int upperbound){
        if(upperbound>lowermost){
            int mid = (upperbound+lowermost)/2;
            mergeSort(intArray,lowermost,mid);
            mergeSort(intArray,mid+1,upperbound);
            merge(intArray,lowermost,mid,upperbound);
        }
    }
    public static void merge(int[] myArray,int lowerbound,int mid,int upperbound){
        int i = lowerbound;
        int j = mid+1;
        int k = lowerbound;
        int[] temp = new int[myArray.length];

        while(i<=mid && j<=upperbound) {
            if (myArray[i] <= myArray[j]) {
                temp[k] = myArray[i];
                i++;
            } else {
                temp[k] = myArray[j];
                j++;
            }
            k++;
        }
        while(j<=upperbound) {
            temp[k] = myArray[j];
            j++;
            k++;
        }
        while (i <= mid) {
            temp[k] = myArray[i];
            i++;
            k++;
        }
        for(int l=lowerbound;l<=upperbound;l++){
            myArray[l] = temp[l];
        }
    }
}