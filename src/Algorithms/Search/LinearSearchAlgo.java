package Algorithms.Search;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] numbers = {3, 7, -23, 56, 92, -54, 7};
        System.out.println(linearSearch(numbers, 56));
        System.out.println(linearSearch(numbers, -54));
        System.out.println(linearSearch(numbers, 8));
        System.out.println(linearSearch(numbers, -23));
        System.out.println(linearSearch(numbers, 3));
    }

    public static int linearSearch(int[] theArray, int target) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
