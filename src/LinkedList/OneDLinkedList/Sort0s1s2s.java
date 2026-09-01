package LinkedList.OneDLinkedList;

public class Sort0s1s2s {
    Node sort(Node head){
        if(head==null || head.nextNode==null) return head;
        Node zeroHead=new Node(-1);
        Node zero=zeroHead;
        Node oneHead=new Node(-1);
        Node one=oneHead;
        Node twoHead=new Node(-1);
        Node two=twoHead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.nextNode=temp;
                zero=temp;
            } else if (temp.data==1) {
                one.nextNode=temp;
                one=temp;
            }
            else{
                two.nextNode=temp;
                two=temp;
            }
            temp=temp.nextNode;
        }
        zero.nextNode=oneHead.nextNode!=null?oneHead.nextNode:twoHead.nextNode;
        one.nextNode=twoHead.nextNode;
        two.nextNode=null;
        return zeroHead.nextNode;
    }
}
