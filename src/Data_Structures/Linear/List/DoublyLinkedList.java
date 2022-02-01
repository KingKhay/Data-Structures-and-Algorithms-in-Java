package Data_Structures.Linear.List;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL<String> names = new DLL<>();
        names.insertToFront("King");
        names.insertToFront("Khay");
        names.insertToFront("Miley");
        names.printListFromFront();

        System.out.println();

        names.insertToBack("Rollie");
        names.printListFromBack();

        System.out.println();

        names.removeFromFront();
        names.printListFromFront();
    }
}
//This is the doublyLinkedList class
class DLL<T>{
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    //Method to add Data to the head of the list//
    public void insertToFront(T theData){
        //Create the new Node to be inserted at the front of the list//
        DoublyNode<T> newNodeToBeTheHead = new DoublyNode<>(theData);
        //Set the new Node to point to the current head//
        newNodeToBeTheHead.setNext(head);
        //If the head is null ie the list is empty then we set the tail to the new node;
        if(head == null){
            tail = newNodeToBeTheHead;
        }
        else{
            head.setPrev(newNodeToBeTheHead);
        }
        //Set the head as the new Node//
        head = newNodeToBeTheHead;
    }

    //Method to add Nodes to the back of the list//
    public void insertToBack(T theData){
        //Create the new node to be inserted to the tail of the list//
        DoublyNode<T> newNodeToBeTail = new DoublyNode<>(theData);
        //If the tail is null ie the list is empty//
        if(tail == null){
            tail = newNodeToBeTail;
        }
        else{
            tail.setNext(newNodeToBeTail);
            newNodeToBeTail.setPrev(tail);
        }
        //Let the new Node be the tail//
        tail = newNodeToBeTail;
    }

    public void printListFromFront(){
        DoublyNode<T> current = head;
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current+" -> ");
            current = current.getNext();
        }
        System.out.println(" null");
    }
    public void printListFromBack(){
        DoublyNode<T> current = tail;
        System.out.print("Tail ->");
        while(current!=null){
            System.out.print(current+" -> ");
            current = current.getPrev();
        }
        System.out.println(" null");
    }
    public boolean isEmpty(){
        return tail == null;
    }
    public DoublyNode<T> removeFromFront(){
        DoublyNode<T> toBeRemoved = head;
        if(isEmpty()){
            return null;
        }
        else{
            DoublyNode<T> newHead = toBeRemoved.getNext();
            newHead.setPrev(null);
            head = newHead;
        }
        return toBeRemoved;
    }

}
class DoublyNode<T>{
    /*
    * Every Node has the object to be stored ie Strings, Integers, Custom Classes ...
    * Each Node has a reference to the next and previous nodes//
    * */
    private T data;
    private DoublyNode<T> next;
    private DoublyNode<T> prev;

    public DoublyNode(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
