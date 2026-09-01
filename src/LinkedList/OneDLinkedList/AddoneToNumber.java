package LinkedList.OneDLinkedList;

public class AddoneToNumber {
    int helper(Node temp){
        if(temp==null) return 1;
        int carry =helper(temp.nextNode);
        temp.data=temp.data+carry;
        if(temp.data<10) return 0;
        temp.data=0;
        return 1;
    }
    Node recursive(Node head){
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(1,head);
            return newNode;
        }
        return head;
    }

    Node reverseList(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.nextNode;
            temp.nextNode=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    Node iterative(Node head){
        head=reverseList(head);
        Node temp=head;
        int carry=1;
        while(temp!=null){
            temp.data=temp.data+carry;
            if(temp.data<10){
                carry=0;
                break;
            }
            else{
                temp.data=0;
                carry=1;
            }
            temp=temp.nextNode;
        }
        if(carry==1){
            Node newNode=new Node(1);
            head=reverseList(head);
            newNode.nextNode=head;
            return newNode;
        }
        head=reverseList(head);
        return head;
    }
}
