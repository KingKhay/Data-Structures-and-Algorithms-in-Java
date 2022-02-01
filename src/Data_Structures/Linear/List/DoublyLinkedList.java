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

    }
}
//This is the doublyLinkedList class
class DLL<T>{
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public void insertToFront(T theData){
        DoublyNode<T> newNodeToBeTheHead = new DoublyNode<>(theData);
        newNodeToBeTheHead.setNext(head);
        if(head == null){
            tail = newNodeToBeTheHead;
        }
        else{
            head.setPrev(newNodeToBeTheHead);
        }
        head = newNodeToBeTheHead;
    }
    public void insertToBack(T theData){
        DoublyNode<T> newNodeToBeTail = new DoublyNode<>(theData);
        if(tail == null){
            tail = newNodeToBeTail;
        }
        else{
            tail.setNext(newNodeToBeTail);
            newNodeToBeTail.setPrev(tail);
        }
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
}
class DoublyNode<T>{
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
