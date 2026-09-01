package LinkedList.OneDLinkedList;

public class LengthOfCycle {
    int lengthOfCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.nextNode!= null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
            if(slow==fast) return findLength(slow,fast);
        }
        return 0;
    }
    int findLength(Node slow,Node fast){
        int cnt=1;
        fast=fast.nextNode;
        while(fast!=slow){
            cnt++;
            fast=fast.nextNode;
        }
        return cnt;
    }
}
