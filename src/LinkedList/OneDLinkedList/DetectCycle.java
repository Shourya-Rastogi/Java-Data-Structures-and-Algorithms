package LinkedList.OneDLinkedList;

public class DetectCycle {
    boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.nextNode!= null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
            if(slow==fast) return true;
        }
        return false;
    }
}
