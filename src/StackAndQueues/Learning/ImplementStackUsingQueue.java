package StackAndQueues.Learning;

import java.util.*;
class MyStack{
    Queue<Integer> queue;

    public MyStack(){
        queue =new LinkedList<>();
    }

    public void push(int x){
        int size = queue.size();
        queue.add(x);
        for(int i=1;i<size;i++){
            queue.add(queue.poll());
        }
    }

    public int pop(){
        int n=queue.peek();
        queue.poll();
        return n;
    }

    public int top(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
public class ImplementStackUsingQueue {
}
