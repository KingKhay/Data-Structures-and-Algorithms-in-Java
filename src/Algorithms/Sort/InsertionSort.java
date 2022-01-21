package Algorithms.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arrayOfIntegers = {34,61,-9,4,-31,13,92};
        for(int firstUnsortedIndex=1; firstUnsortedIndex<arrayOfIntegers.length;firstUnsortedIndex++){
            int elementInTheCurrentFirstUnsortedIndex = arrayOfIntegers[firstUnsortedIndex];
            for(int step =firstUnsortedIndex;step>0 && elementInTheCurrentFirstUnsortedIndex<arrayOfIntegers[step-1];step--){
                arrayOfIntegers[step] = arrayOfIntegers[step-1];
                arrayOfIntegers[step-1] = elementInTheCurrentFirstUnsortedIndex;
            }
        }
        Arrays.stream(arrayOfIntegers)
                .forEach(System.out::println);
    }
}
