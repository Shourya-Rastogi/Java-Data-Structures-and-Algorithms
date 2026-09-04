package StackAndQueues.Learning;
import java.util.*;
public class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st=new Stack<>();
        min=Integer.MIN_VALUE;
    }

    public void push(int value) {
        if(st.isEmpty()){
            min=value;
            st.push(value);
        }
        else{
            if(value>min) st.push(value);
            else{
                st.push(2*value-min);
                min=value;
            }
        }
    }

    public void pop() {
        int n=st.pop();
        if(n<min){
            min=2*min-n;
        }
    }

    public int top() {
        int x=st.peek();
        if(min<x) return x;
        return min;
    }

    public int getMin() {
        return min;
    }
}
