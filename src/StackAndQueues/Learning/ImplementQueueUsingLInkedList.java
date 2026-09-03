package StackAndQueues.Learning;
import LinkedList.OneDLinkedList.Node;

public class ImplementQueueUsingLInkedList {
    private class LinkedListQueue{
        private Node head;
        private Node tail;
        private int size;

        public LinkedListQueue(){
            head = null;
            tail = null;
            size=0;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.nextNode=newNode;
                tail=newNode;
            }
            size++;
        }

        public int pop(){
            if(head==null){
                System.out.println("Queue is Empty");
                System.exit(1);
            }
            int data=head.data;
            if(head.nextNode==null){
                head=null;
                tail=null;
            }
            else{
                head=head.nextNode;
            }
            size--;
            return data;
        }
        public int top(){
            if(size==0){
                System.out.println("Queue is empty");
                System.exit(1);
            }
            return head.data;
        }
    }

}
