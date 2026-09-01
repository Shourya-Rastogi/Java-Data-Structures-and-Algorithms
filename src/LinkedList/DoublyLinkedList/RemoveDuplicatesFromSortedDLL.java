package LinkedList.DoublyLinkedList;

public class RemoveDuplicatesFromSortedDLL {
    Node removeDuplicates(Node head){
        Node temp=head;
        while(temp!=null && temp.nextNode!=null){
            Node next=temp.nextNode;
            while(next!=null && next.data==temp.data) next=next.nextNode;
            temp.nextNode=next;
            if(next!=null) next.prevNode=temp;
            temp=temp.nextNode;
        }
        return head;
    }
}