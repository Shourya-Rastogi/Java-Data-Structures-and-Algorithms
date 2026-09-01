package LinkedList.OneDLinkedList;

public class SortList {
    Node sortList(Node head) {
        if(head==null ||head.nextNode==null) return head;
        Node middle=findMiddle(head);
        Node leftHead=head;
        Node rightHead=middle.nextNode;
        middle.nextNode=null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        return mergeTwoLists(leftHead,rightHead);
    }

    Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.nextNode;
        while(fast!=null &&fast.nextNode!=null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
        }
        return slow;
    }
    Node mergeTwoLists(Node List1,Node List2){
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while(List1!=null && List2!=null){
            if(List1.data<List2.data){
                temp.nextNode=List1;
                temp=List1;
                List1=List1.nextNode;
            }
            else{
                temp.nextNode=List2;
                temp=List2;
                List2=List2.nextNode;
            }
        }
        if(List1!=null) temp.nextNode=List1;
        else temp.nextNode=List2;
        return dummyNode.nextNode;
    }
}
