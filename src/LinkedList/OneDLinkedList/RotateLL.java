package LinkedList.OneDLinkedList;

public class RotateLL {
    Node rotateByk(Node head,int k){
        if (head == null || head.nextNode == null || k == 0)
            return head;
        Node tail=head;
        int len=1;
        while(tail.nextNode!=null){
            len++;
            tail=tail.nextNode;
        }
        k=k%len;
        if(k==0) return head;
        tail.nextNode=head;
        int stepsToNewTail = len - k;
        Node newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.nextNode;
        }
        Node newhead=newTail.nextNode;
        newTail.nextNode=null;
        return newhead;
    }
}
