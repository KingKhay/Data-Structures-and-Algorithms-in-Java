package Data_Structures.Linear;

import java.util.NoSuchElementException;

public class Queue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.add("King");
        queue.add("Mal");
        queue.add("Khay");
        queue.add("Mason");
        queue.add("Rollie");
        queue.printQueue();
        System.out.println();
        System.out.println(queue.remove());
        System.out.println();
        queue.printQueue();
        System.out.println();
    }
}
class ArrayQueue{
    private String[] integerArray;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        integerArray = new String[capacity];
    }
    public boolean isEmpty(){
        return integerArray.length<1;
    }
    public void add(String data){
        if(back==integerArray.length){
            String[] newArray = new String[2 * integerArray.length];
            System.arraycopy(integerArray,0,newArray,0,integerArray.length);
            integerArray = newArray;
        }
        integerArray[back] = data;
        back++;
    }
    public String remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        String valueToBeRemoved = integerArray[front];
        integerArray[front] = null;
        front++;
        if(size()==0){
            front = 0;
            back = 0;
        }
        return valueToBeRemoved;
    }
    public String peek(){
        if(this.isEmpty()){
            return null;
        }
        return integerArray[front];
    }
    public void printQueue(){
        for(int i=front;i<back;i++){
            System.out.println(integerArray[i]);
        }
    }
    public int size(){
        return back - front;
    }
}
