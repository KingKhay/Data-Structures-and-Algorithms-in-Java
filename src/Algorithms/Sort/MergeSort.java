package Algorithms.Sort;

public class MergeSort {
    private int data[];
    private int length;
    private int[] tempArray;

    public void sort(int[] inputData) {
        this.data = inputData;
        this.length = inputData.length;
        this.tempArray = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            //Sorts the left side of the array
            mergeSort(lowerIndex, middle);
            //Sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            //Merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = data[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                data[k] = tempArray[i];
                i++;
            } else {
                data[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            data[k] = tempArray[i];
            k++;
            i++;
        }
    }

    private static void printNumbers(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i != data.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        MergeSort test = new MergeSort();
        int[] data = {38, 27, 43, 3, 9, 82, 10};
        //Print array elements
        printNumbers(data);
        test.sort(data);
        //Print sorted array elements
        printNumbers(data);
    }
}
