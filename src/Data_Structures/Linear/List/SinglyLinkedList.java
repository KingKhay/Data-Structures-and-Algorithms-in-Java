package Data_Structures.Linear.List;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL<String> theList = new SLL<>();
        theList.insert("King");
        theList.insert("Khay");
        theList.insert("Johnny");

        theList.printList();
        System.out.println();

        theList.remove();
        theList.printList();
    }
}
//This is the Singly LinkedList class
class SLL<T>{
    //Every LinkedList has a head node to represent the beginning of the list//
    private Node<T> head;
    //Method to insert data into the LinkedList//
   public void insert(T theData){
       //Create a new Node to contain the data you want to store
       Node<T> newNode = new Node<>(theData);
       //Set that node to point to the head//
       newNode.setNext(head);
       //Set that node as the new Head of the list since it will be stored at the beginning//
       head = newNode;
   }

   public Node<T> remove(){
       if(isEmpty()){
           return null;
       }
       Node<T> toBeRemovedNode = head;
       head = head.getNext();
       return toBeRemovedNode;
   }
   public boolean isEmpty(){
       return head == null;
   }

   public void printList(){
       System.out.print("Head -> ");
       //Set the head to a temp variable named current//
       Node<T> current = head;
       //While the current is not pointing to null....That is as the current node is not null print out the data//
       while(current!=null){
           System.out.print(current +" -> ");
           current = current.getNext();
       }
       //Print null when we get to the end of the list//
       System.out.println("null");
   }
}
class Node <T>{
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
}
