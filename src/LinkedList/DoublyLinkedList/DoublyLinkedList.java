package LinkedList.DoublyLinkedList;
class Node{
    int data;
    Node nextNode;
    Node prevNode;

    Node(int data,Node nextNode,Node prevNode){
        this.data=data;
        this.nextNode=nextNode;
        this.prevNode=prevNode;
    }

    Node(int data){
        this.data=data;
        this.nextNode=null;
        this.prevNode=null;
    }
}
public class DoublyLinkedList {
    static Node convertarr2ll(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.nextNode=temp;
            prev=temp;
        }
        return head;
    }

    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nextNode;
        }
    }

    static Node deleteHead(Node head){
        if(head==null || head.nextNode==null) return null;
        Node prev=head;
        head=head.nextNode;
        head.prevNode=null;
        prev.nextNode=null;
        return head;
    }

    static Node deleteTail(Node head){
        if(head==null || head.nextNode==null) return null;
        Node tail=head;
        while(tail.nextNode!=null){
            tail=tail.nextNode;
        }
        Node newTail=tail.prevNode;
        newTail.nextNode=null;
        tail.prevNode=null;
        return head;
    }
    static Node deleteKthEl(Node head,int k){
        if(head==null) return null;
        Node kNode=head;
        int cnt=0;
        while(kNode!=null){
            cnt++;
            if(cnt==k) break;
            kNode=kNode.nextNode;
        }
        Node prev=kNode.prevNode;
        Node next=kNode.nextNode;
        if(prev==null && next==null) return null;
        else if(prev==null) return deleteHead(head);
        else if(next==null) return deleteTail(head);
        else{
            prev.nextNode=next;
            next.prevNode=prev;
            kNode.nextNode=null;
            kNode.prevNode=null;
        }
        return head;
    }

    static void deleteNode(Node node){
        Node prev=node.prevNode;
        Node next=node.nextNode;
        if(next==null){
            prev.nextNode=null;
            node.prevNode=null;
            return;
        }
        prev.nextNode=next;
        next.prevNode=prev;
        node.nextNode=null;
        node.prevNode=null;
    }
    static Node insertBeforeHead(Node head,int val){
        Node newHead=new Node(val,head,null);
        head.prevNode=newHead;
        return newHead;
    }
    static Node insertAfterHead(Node head,int val){
        if(head.nextNode==null){
            Node newNode=new Node(val,null,head);
            return head;
        }
        Node next=head.nextNode;
        Node temp=new Node(val,next,head);
        next.prevNode=temp;
        head.nextNode=temp;
        return head;
    }

    static Node insertBeforeTail(Node head,int val){
        if(head.nextNode==null) return insertBeforeHead(head,val);
        Node tail=head;
        while(tail.nextNode!=null) tail=tail.nextNode;
        Node prev=tail.prevNode;
        Node newNode=new Node(val,tail,prev);
        prev.nextNode=newNode;
        tail.prevNode=newNode;
        return head;
    }

    static Node insertBeforeKthEl(Node head,int k,int val){
        if(k==1) return insertBeforeHead(head,val);
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k) break;
            temp=temp.nextNode;
        }
        Node prev=temp.prevNode;
        Node newNode=new Node(val,temp,prev);
        prev.nextNode=newNode;
        temp.prevNode=newNode;
        return head;
    }

    static void insertBeforeNode(Node node,int val){
        Node prev=node.prevNode;
        Node newNode=new Node(val,node,prev);
        prev.nextNode=newNode;
        node.prevNode=newNode;
    }

    static Node reverseDLL(Node head){
        if(head==null || head.nextNode==null) return head;
        Node prev=null;
        Node current=head;
        while(current!=null){
            prev=current.prevNode;
            current.prevNode=current.nextNode;
            current.nextNode=prev;
            current=current.prevNode;
        }
        return prev.prevNode;
    }


    static void main() {
        int[] arr={12,4,5,2};
        Node head = convertarr2ll(arr);
        head=reverseDLL(head);
        print(head);
    }

}
