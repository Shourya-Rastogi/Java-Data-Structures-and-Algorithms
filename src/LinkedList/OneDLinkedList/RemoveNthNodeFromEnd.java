package LinkedList.OneDLinkedList;

public class RemoveNthNodeFromEnd {
    Node removeNthFromEnd(Node head, int n) {
        Node dummy=new Node(0,head);
        Node fast=dummy;
        Node slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.nextNode;
        }
        while(fast!= null){
            slow=slow.nextNode;
            fast=fast.nextNode;

        }
        slow.nextNode=slow.nextNode.nextNode;
        return dummy.nextNode;
    }
}
