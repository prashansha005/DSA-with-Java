// import java.util.Stack;
// public class InfixToPostfixConversion{
//     /*
//     * determines the precedence of an operator 
//     *@pqaram op the operator character
//     *@return an integer representing the precedence
//     */
//     private static int getPrecendence(char op){
//         switch (op) {
//             case '+':
//             case '-':
//               return 1; //lowest precedence: addition and subtraction

//             case '*':
//             case '/':
//               return 2; //medium precedence : multiplication and division

//             case '^': 
//             case '$':
//                return 3; //highest precedence : expontiation and dollar sign
//             default:
//                 return 0;   


//         }
//     }
//     public static String convertToPostfix(String infixExpression){
//     // 1. create a stringbuilder to build the final postfix expression 
//     StringBuilder postfixResult = new StringBuilder();

//     // 2. create a stack to hold operators and paranthesis
//     Stack<Character> operatorStack = new Stack<>();

//     //3 . loop through every character in the infix expression
//     for(int i=0; i<infixExpression.length(); i++){
//       char token = infixExpression.charAt(i);

//       //Ignore any blank space
//       if(Character.isWhitespace(token)){
//         continue;
//       }

//       //CASE 1: the token is an operand (letter or digit)
//       if(Character.isLetterOrDigit(token)){
//         //if it is a number or a variable, just add it diswrectly to the postfix result
//         postfixResult.append(token);
//       }

//       //CASE 2: the token is opening parenthesis '('
//       else if(token == '('){
//         //push '(' on to the stack.
//         operatorStack.push(token);
//       }

//       //CASE 3: the token is closing parenthesis ')'
//       else if(token == ')'){
//         //pop operators from the stack and append to the postfix result until the matching '(' is found.
//         while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
//           postfixResult.append(operatorStack.pop());
//         }

//         //if the stack is empty, discard/remove '('
//         if(operatorStack.isEmpty() && operatorStack.peek() == '('){
//           operatorStack.pop();
//         }

//         //CASE 4 : the token is an operator( +, -*, /) --
//         else{
//           //while the stack is not empty AND the operator has greater or equal precedence than the current token:
//           while(!operatorStack.isEmpty() &&
//           getPrecendence(operatorStack.peek()) >= getPrecendence(token))
//           {
//             //crucial check : dont push the opening parenthesis '('
//             //it belong to CASE 3

//             if(operatorStack.peek()== '('){
//               break;
//             }

//             //pop the higher precedence operator and push it to the result
//             postfixResult.append(operatorStack);
//           }

//           //now, push the current operator on to the stack
//           operatorStack.push(token);
//         }        
//       }
//       //after scanning the expression , pop all the remaining operators from the stack

//       while(!operatorStack.isEmpty()){
//         postfixResult.append(operatorStack.pop());
//       }
//       return postfixResult.toString();
//     }
//     return infixExpression;

//   }
//   // public static String ConverttoPostfix(String infixExpression) {
//     public static void main (String[] args){
//       String infixExpression = "A+B*C";

//       String postfixResult = convertToPostfix(infixExpression);
//       System.out.println("Infix Expression" + infixExpression);
//       System.out.println("Post Expression" + postfixResult);

//     }
//   }




import java.util.Stack;
import java.util.Scanner;

public class InfixToPostfixConversion {

    // Determines precedence of operators
    private static int getPrecedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1; // Lowest precedence
            case '*':
            case '/':
                return 2; // Medium precedence
            case '^':
            case '$':
                return 3; // Highest precedence
            default:
                return 0;
        }
    }

    // Converts infix expression to postfix
    public static String convertToPostFix(String infixExpression) {
        StringBuilder postFixResult = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char token = infixExpression.charAt(i);

            // Ignore spaces
            if (Character.isWhitespace(token)) {
                continue;
            }

            // Case 1: Operand → directly append
            if (Character.isLetterOrDigit(token)) {
                postFixResult.append(token);
            } // Case 2: Opening parenthesis → push
            else if (token == '(') {
                operatorStack.push(token);
            } // Case 3: Closing parenthesis → pop until '('
            else if (token == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postFixResult.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop(); // discard '('
                }
            } // Case 4: Operator
            else {
                while (!operatorStack.isEmpty()
                        && getPrecedence(operatorStack.peek()) >= getPrecedence(token)) {
                    postFixResult.append(operatorStack.pop());
                }
                operatorStack.push(token);
            }
        }

        // Pop remaining operators
        while (!operatorStack.isEmpty()) {
            postFixResult.append(operatorStack.pop());
        }

        return postFixResult.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an infix expression");


        String infix = sc.nextLine().toUpperCase();
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + convertToPostFix(infix));
    sc.close();
    }
}