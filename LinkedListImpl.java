import java.util.Scanner;

public class LinkedListImpl {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int _data){
            this.data = _data;
            this.next = null;
        }
    }

    //Insert at begining

    public void insertAtBegining(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        System.out.println("Elements inserted at the begining.");
    }

    // Traverse

    public void traverse(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.println("List of elements");
        while(temp != null){
            System.out.println(temp.data + "" );
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedListImpl linkeList = new LinkedListImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========STACK MENU=========");
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Traverse");
            System.out.println("4. Size");
            System.out.println("5. Search for an element");
            System.out.println("6. Delete from begining");
            System.out.println("7. Delete from end");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter element:") ;
                    linkeList.insertAtBegining(sc.nextInt());
                    break;

                // case 2:
                //     System.out.println("Insert at last: ");
                //     break;

                case 3:
                    System.out.println("Traverse: ");
                    break;

                // case 4:
                //     System.out.print("Size: ");
                //     int element = sc.nextInt();
                //     push(element);
                //     break;
                    
                // case 5:
                //     pop();
                //     break;

                // case 6:
                //     peek();
                //     break;
                    
                // case 7:


                case 8:
                    System.out.println("Thank you. Exiting....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }

}
