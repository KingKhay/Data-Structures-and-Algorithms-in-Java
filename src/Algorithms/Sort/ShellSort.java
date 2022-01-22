package Algorithms.Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {34,61,-9,4,-31,13,92};
        //Select your gap size using the length of the array. I used the Knuth sequence {1,4,13,40,121....}//
        //Since my array is of size 7 i used a gap size of 4//
        for(int gap =4; gap>0;gap/=2){
            //Inner for loop traverses from the middle to the front of the array//
            for(int i=gap;i<arrayOfIntegers.length;i++){
                int newElement = arrayOfIntegers[i];
                int j = i;
                //while loop runs as long as there is space of viable length to the back of the array
                //and the values behind are sorted we move to the back of the array//
                while(j>=gap && newElement<arrayOfIntegers[j-gap]){
                    arrayOfIntegers[j] = arrayOfIntegers[j-1];
                    j-=gap;
                }
                arrayOfIntegers[j] = newElement;
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
