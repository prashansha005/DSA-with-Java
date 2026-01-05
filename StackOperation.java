import java.util.Scanner;

public class StackOperation {
    static final int Max = 100; // maximum size of the stack
    static int[] stack = new int[Max];
    static int top = -1;

    // check if the stack is empty
    static boolean isEmpty() {
        return top < 0;
    }

    // check if the stack is full
    static boolean isFull() {
        return top >= Max - 1; // fixed MAX → Max
    }

    // check the size of the stack
    static int stackSize() {
        return top + 1;
    }

    // PUSH operation
    static void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push element");
            return;
        }
        stack[++top] = element;
        System.out.println("The pushed element in the stack is: " + element);
    }



//pop operation

static int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;

    }
    int element =stack[top--];
    System.out.println("the pooped element is :" + element);
    return element;
}
// peak operation

static void peek(){
    if(top == -1) {
        System.out.println("stack is empty");
    }
       System.out.println("top element:" + stack[top]);
}

// display operation

static void display(){
    System.out.println("stack is empty");
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========STACK MENU=========");
            System.out.println("1. Is stack empty?");
            System.out.println("2. Is stack full?");
            System.out.println("3. Stack Size");
            System.out.println("4. Stack PUSH");
            System.out.println("5. Stack POP");
            System.out.println("6.Stack peek");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Is stack empty?: " + isEmpty());
                    break;

                case 2:
                    System.out.println("Is stack full?: " + isFull());
                    break;

                case 3:
                    System.out.println("Stack size: " + stackSize());
                    break;

                case 4:
                    System.out.print("Enter the element: ");
                    int element = sc.nextInt();
                    push(element);
                    break;
                    
                case 5:
                    pop();
                    break;

                case 6:
                    peek();
                    break;    

                case 7:
                    System.out.println("Thank you. Exiting....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}


