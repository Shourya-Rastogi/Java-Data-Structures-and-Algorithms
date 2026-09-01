package LinkedList.OneDLinkedList;

public class ReverseLinkedList {
    static Node iterative(Node head){
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

    Node reverseList(Node head) {
        if(head==null || head.nextNode==null) return head;
        Node newHead=reverseList(head.nextNode);
        Node front=head.nextNode;
        front.nextNode=head;
        head.nextNode=null;
        return newHead;
    }

    private static Node convertArr2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.nextNode=temp;
            mover=temp;
        }
        return head;
    }
    private static Node traverse(int[] arr){
        Node head=convertArr2LL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nextNode;
        }
        return head;
    }
    static void main(String[] args) {
        Node head = traverse(new int[]{1, 1, 2, 1});
        Node reverse = iterative(head);
        Node temp=reverse;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nextNode;
        }

    }
}
