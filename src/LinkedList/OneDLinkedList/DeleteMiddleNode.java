package LinkedList.OneDLinkedList;

public class DeleteMiddleNode {
    Node deleteMiddle(Node head) {
        if(head.nextNode==null) return null;
        Node slow=head;
        Node fast=head;
        fast=fast.nextNode.nextNode;
        while(fast!=null && fast.nextNode!=null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
        }
        slow.nextNode=slow.nextNode.nextNode;
        return head;
    }
}
