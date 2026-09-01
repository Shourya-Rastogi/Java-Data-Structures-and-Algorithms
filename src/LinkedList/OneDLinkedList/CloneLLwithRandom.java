package LinkedList.OneDLinkedList;


class Node2{
    int val;
    Node2 next;
    Node2 random;
    Node2(int val){
        this.val = val;
        this.next=null;
        this.random=null;
    }
    Node2(int val,Node2 next,Node2 random){
        this.val = val;
        this.next=next;
        this.random=random;
    }
}
public class CloneLLwithRandom {
    Node2 cloneLL(Node2 head){
        Node2 temp=head;
        while(temp!=null){
            Node2 copyNode=new Node2(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        temp=head;
        while (temp!=null){
            Node2 copyNode=temp.next;
            if(temp.random!=null){
                copyNode.random=temp.random.next;
            }
            else{
                copyNode.random=null;
            }
            temp=temp.next.next;
        }
        Node2 dummy=new Node2(-1);
        Node2 res=dummy;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}
