package StackAndQueues.Implementation;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class LFUCache {
    class DLLNode{
        int key,value,frequency;
        DLLNode prev, next;
        public DLLNode(int key,int value){
            this.key=key;
            this.value=value;
            this.frequency=1;
        }
    }
    class DoubleLinkedList{
        int listSize;
        DLLNode head, tail;
        public DoubleLinkedList(){
            this.listSize=0;
            this.head=new DLLNode(-1,-1);
            this.tail=new DLLNode(-1,-1);
            head.next=tail;
            tail.prev=head;
        }
        void addNode(DLLNode newNode) {
            DLLNode temp = head.next;
            newNode.next = temp;
            newNode.prev = head;
            head.next = newNode;
            temp.prev = newNode;
            listSize++;
        }

        // Function to remove a given node from list
        void deleteNode(DLLNode delNode) {
            DLLNode delPrev = delNode.prev;
            DLLNode delNext = delNode.next;
            delPrev.next = delNext;
            delNext.prev = delPrev;
            listSize--;
        }
    }

    int capacity;
    int currSize;
    int minFrequency;
    Map<Integer,DLLNode> cache;
    Map<Integer,DoubleLinkedList> freqMap;

    public LFUCache(int capacity){
        this.capacity=capacity;
        this.currSize=0;
        this.minFrequency=0;
        this.cache=new HashMap<>();
        this.freqMap=new HashMap<>();
    }
    public int get(int key){
        DLLNode currNode=cache.get(key);
        if(currNode==null) return -1;
        updateNode(currNode);
        return currNode.value;
    }

    public void put(int key,int value){
        if(capacity==0) return;
        if(cache.containsKey(key)){
            DLLNode currNode=cache.get(key);
            currNode.value=value;
            updateNode(currNode);
        }
        else{
            currSize++;
            if(currSize>capacity){
                DoubleLinkedList minFreqList=freqMap.get(minFrequency);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.deleteNode(minFreqList.tail.prev);
                currSize--;
            }
            minFrequency=1;
            DLLNode newNode=new DLLNode(key,value);
            DoubleLinkedList currList=freqMap.getOrDefault(1,new DoubleLinkedList());
            currList.addNode(newNode);
            freqMap.put(1,currList);
            cache.put(key,newNode);
        }
    }

    public void updateNode(DLLNode currNode){
        int currFreq=currNode.frequency;
        DoubleLinkedList currList=freqMap.get(currFreq);
        currList.deleteNode(currNode);
        if(currFreq==minFrequency && currList.listSize==0){
            minFrequency++;
        }
        currNode.frequency++;
        DoubleLinkedList newList=freqMap.getOrDefault(currNode.frequency,new DoubleLinkedList());
        newList.addNode(currNode);
        freqMap.put(currNode.frequency,newList);
    }
}
