package Algorithms.Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {34,61,-9,4,-31,13,92};
        for(int gap =4; gap>0;gap/=2){
            for(int i=4;i<arrayOfIntegers.length;i++){
                int j = i;
                while(j>=0 && arrayOfIntegers[j]>arrayOfIntegers[j-gap]){
                    swap(arrayOfIntegers,j-gap,j);
                    j-=gap;
                }
            }
        }
        Arrays.stream(arrayOfIntegers)
                .forEach(System.out::println);
    }
    public static void swap(int array[], int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
