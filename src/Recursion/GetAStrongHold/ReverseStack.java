package Recursion.GetAStrongHold;

import java.util.Stack;

public class ReverseStack {
    void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp=stack.pop();
        reverseStack(stack);
        insert(stack,temp);
    }

    void insert(Stack<Integer> stack,int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        int val=stack.pop();
        insert(stack, temp);
        stack.push(val);
    }
}
