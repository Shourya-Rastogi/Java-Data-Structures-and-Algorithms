package StackAndQueues.Learning;
import LinkedList.OneDLinkedList.Node;


public class ImplementStackUsingLinkedList {
    class LinkedListStack{
        private Node top;
        private int size;
        public LinkedListStack(){
            top = null;
            size = 0;
        }
        public void push(int x){
            Node temp=new Node(x);
            temp.nextNode=top;
            top=temp;
            size++;
        }

        public int pop(){
            int popped=top.data;
            top=top.nextNode;
            size--;
            return popped;
        }

        public int top(){
            if(top==null){
                System.out.println("Stack is empty");
                System.exit(1);
            }
            return top.data;
        }

        public int size(){
            return size;
        }
    }
}
