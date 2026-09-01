package LinkedList.DoublyLinkedList;

public class DeleteAllOccurences {
    Node deleteAll(Node head,int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                if(temp==head) head=head.nextNode;
                Node next=temp.nextNode;
                Node prev=temp.prevNode;
                if(next!=null) next.prevNode=prev;
                if(prev!=null) prev.nextNode=next;
                temp=next;
            }
            else temp=temp.nextNode;
        }
        return head;
    }
}
