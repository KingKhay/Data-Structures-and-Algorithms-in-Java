package Data_Structures.Linear;

import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {
        var names = new LinkedList<String>();
        LinkedListStack<String> stack = new LinkedListStack<>(names);
        stack.push("Khay");
        stack.push("King");
        stack.push("Rollie");
        stack.printList();
        System.out.println();
        System.out.println(stack.pop());

        System.out.println();
        System.out.println(stack.peek());
        System.out.println();

    }
}
class LinkedListStack<T>{
    private LinkedList<T> theList;

    public LinkedListStack(LinkedList<T> theList){
        this.theList = theList;
    }

    public void push(T data){
        theList.push(data);
    }

    public T pop(){
        return theList.pop();
    }
    public T peek(){
        return theList.peek();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void printList(){
        theList.forEach(System.out::println);
    }
}
