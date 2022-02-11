package Data_Structures.Linear;

import java.util.Arrays;

public class ArrayHashTable {
    public static void main(String[] args) {
        HashTableArray hashMap = new HashTableArray();
        hashMap.put("computer","An electronic device used to store and process data into information");
        hashMap.put("mouse","An electronic device used to serve as one of the primary input devices of a computer");
        hashMap.printHashTable();
        System.out.println();

    }
}
class HashTableArray{
    private String[] theArray;

    public HashTableArray(){
        this.theArray = new String[10];
    }
    //This is my HashFunction to map key to integer value
    public int hashKey(String word){
        return word.length() % theArray.length;
    }

    //Method to add items to the hashTable//
    public void put(String key, String value){
        int hashedKey = hashKey(key);
        if(theArray[hashedKey]!=null){
            System.out.println("Sorry there is already an Employee stored in index "+key);
        }
        else{
            theArray[hashedKey] = value;
        }
    }
    //This method returns the string value using the string key//
    public String get(String key){
        int hashedKey = hashKey(key);
        if(theArray[hashedKey]==null){
            System.out.println("Sorry there is no value for such key");
        }
        return theArray[hashedKey];
    }
    //This method streams through the array and prints out the values//
    public void printHashTable(){
        Arrays.stream(theArray)
                .forEach(System.out::println);
    }
}
