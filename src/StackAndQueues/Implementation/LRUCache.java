package StackAndQueues.Implementation;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key;
        int val;
        Node next;
        Node prev;
        // Constructor to initialize node
        Node(int _key, int _val) {
            key = _key;
            val = _val;
        }
    }
    Map<Integer,Node> mpp;
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        mpp=new HashMap<>();
        head= new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }

    void addNode(Node newNode) {
        Node temp = head.next;
        newNode.next = temp;
        newNode.prev = head;
        head.next = newNode;
        temp.prev = newNode;
    }

    // Function to remove a given node from list
    void deleteNode(Node delNode) {
        Node delPrev = delNode.prev;
        Node delNext = delNode.next;
        delPrev.next = delNext;
        delNext.prev = delPrev;
    }

    int get(int key){
        if(!mpp.containsKey(key)) return -1;
        Node node=mpp.get(key);
        deleteNode(node);
        addNode(node);
        return node.val;
    }

    void put(int key,int value){
        if(mpp.containsKey(key)){
            Node node=mpp.get(key);
            node.val=value;
            deleteNode(node);
            addNode(node);
        }
        else{
            if(mpp.size()==capacity){
                Node node=tail.prev;
                mpp.remove(node.key);
                deleteNode(node);
            }
            Node node=new Node(key,value);
            mpp.put(key,node);
            addNode(node);
        }
    }
}
