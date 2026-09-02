package Recursion.GetAStrongHold;

import java.util.Stack;

public class SortStack {
    void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp=stack.pop();
            sortStack(stack);
            insert(stack,temp);
        }
    }
    void insert(Stack<Integer> stack,int temp){
        if(stack.isEmpty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int val=stack.pop();
        insert(stack,temp);
        stack.push(val);
    }
}
