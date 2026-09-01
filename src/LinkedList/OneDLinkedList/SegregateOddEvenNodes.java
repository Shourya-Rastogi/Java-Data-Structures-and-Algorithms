package LinkedList.OneDLinkedList;

public class SegregateOddEvenNodes {
    Node oddEvenList(Node head){
        if(head==null || head.nextNode==null) return head;
        Node odd=head;
        Node even=head.nextNode;
        Node evenHead=head.nextNode;
        while(even!=null &&even.nextNode!=null){
            odd.nextNode=odd.nextNode.nextNode;
            even.nextNode=even.nextNode.nextNode;

            odd=odd.nextNode;
            even=even.nextNode;
        }
        odd.nextNode=evenHead;
        return head;

    }
}
