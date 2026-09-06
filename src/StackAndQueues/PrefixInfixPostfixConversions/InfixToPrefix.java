package StackAndQueues.PrefixInfixPostfixConversions;

import java.util.Stack;

public class InfixToPrefix {
    // Function to return precedence of operators
    static int getPriority(char C) {
        if (C == '^')  // Exponent operator has highest precedence
            return 3;
        else if (C == '*' || C == '/')  // Multiplication and division have higher precedence than addition
            return 2;
        else if (C == '+' || C == '-')  // Addition and subtraction have lowest precedence
            return 1;
        return 0;
    }

    // Modified Function to convert infix expression to Nearly postfix expression
    static String infixToPostfix(String infix) {
        infix = '(' + infix + ')';  // Add parentheses to handle edge cases
        int l = infix.length();
        Stack<Character> stack = new Stack<>();  // Stack to store operators
        StringBuilder result = new StringBuilder();  // StringBuilder to store the resulting postfix expression

        for (int i = 0; i < l; i++) {
            char c = infix.charAt(i);

            // If the scanned character is an operand, add it to output
            if (Character.isLetterOrDigit(c))
                result.append(c);

                // If the scanned character is ‘(’, push it to the stack
            else if (c == '(')
                stack.push('(');

                // If the scanned character is ‘)’, pop and output from the stack until an ‘(‘ is encountered
            else if (c == ')') {
                while (stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();  // Remove '(' from the stack
            }

            // If an operator is found
            else {
                if(c=='^'){
                    while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                        result.append(stack.pop());
                    }
                }
                else{
                    while (!stack.isEmpty() && getPriority(c) < getPriority(stack.peek())) {
                        result.append(stack.pop());
                    }
                }
                stack.push(c);  // Push current operator on stack
            }
        }

        // Pop all remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();  // Return the postfix expression
    }

    // Function to convert infix expression to prefix expression
    static String infixToPrefix(String infix) {
        StringBuilder sb = new StringBuilder(infix);

        // Reverse the infix expression
        sb.reverse();

        // Replace '(' with ')' and vice versa
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        // Get the postfix of the modified string
        String prefix = infixToPostfix(sb.toString());

        // Reverse the postfix to get the prefix
        return new StringBuilder(prefix).reverse().toString();  // Return the prefix expression
    }

    static void main() {
        String infix="(A+B)*C-D+F";
        System.out.println(infixToPrefix(infix));
    }
}
