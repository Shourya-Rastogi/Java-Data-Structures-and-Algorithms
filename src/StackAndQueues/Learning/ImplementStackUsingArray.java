package StackAndQueues.Learning;

public class ImplementStackUsingArray {
    static class ArrayStack{
        private int[] stack;
        private int capacity;
        private int topIndex;

        public ArrayStack(int size){
            stack=new int[size];
            capacity=size;
            topIndex=-1;
        }
        public ArrayStack(){
            this(100);
        }
        public void push(int x){
            if(capacity==topIndex+1){
                System.out.println("Stack Overflow../nExiting");
                return;
            }
            stack[++topIndex]=x;
        }
        public int pop(){
            if(topIndex==-1){
                System.out.println("Stack Underflow Exception../nExiting");
                System.exit(1);
            }
            return stack[topIndex--];
        }
        public int peek(){
            if(topIndex==-1){
                System.out.println("Stack is Empty");
                System.exit(1);
            }
            return stack[topIndex];
        }
        public boolean isEmpty(){
            return topIndex==-1;
        }
    }

    static void main() {
        ArrayStack stack=new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
