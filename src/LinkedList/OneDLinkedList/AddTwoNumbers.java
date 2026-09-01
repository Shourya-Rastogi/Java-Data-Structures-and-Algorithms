package LinkedList.OneDLinkedList;

public class AddTwoNumbers {
    Node add(Node l1,Node l2){
        Node t1=l1;
        Node t2=l2;
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        int carry=0;
        while(t1!= null || t2!=null){
            int sum =carry;
            if(t1!=null ) sum=sum+t1.data;
            if(t2!=null) sum=sum+t2.data;
            Node newNode=new Node(sum%10);
            carry=sum/10;
            curr.nextNode=newNode;
            curr=curr.nextNode;
            if(t1!=null) t1=t1.nextNode;
            if(t2!=null) t2=t2.nextNode;
        }
        if(carry!=0){
            Node newNode=new Node(carry);
            curr.nextNode=newNode;
        }
        return dummyNode.nextNode;
    }
}
