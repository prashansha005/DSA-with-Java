class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public class stackLinkedList {
        static Node top = null;
        // 1. Algorithm for push operation
        public void push(int element){
            Node newNode = new Node(20);

     // New node points to the current point
     newNode.next = top;

    //  Top moves to new node
    top = newNode;
    System.out.println("Pushed elements:" + element);
    }
    public static void main(String[] args){
        stackLinkedList stack = new stackLinkedList();
        stack.push(20);
    }

    // Algorithm for pop operation

        
    }
    class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.display();
    }
}
