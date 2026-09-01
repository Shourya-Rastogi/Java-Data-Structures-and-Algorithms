package LinkedList.OneDLinkedList;

public class MiddleNode {
    Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.nextNode!=null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
        }
        return slow;
    }
}
