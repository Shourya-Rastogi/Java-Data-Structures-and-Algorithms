package LinkedList.OneDLinkedList;

class Node{
    int data;
    Node nextNode;

    Node(int data,Node node){
        this.data=data;
        this.nextNode=node;
    }

    Node(int data){
        this.data=data;
        this.nextNode=null;
    }

}
public class LinkedList {
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

    private static int lengthOfll(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.nextNode;
            cnt++;
        }
        return cnt;
    }

    private static int checkIfPresent(Node head,int k){
        Node temp=head;
        while(temp!=null){
            if(temp.data==k) return 1;
            temp=temp.nextNode;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={2,4,5,1,7};
        Node y=new Node(arr[3]);
        Node head=convertArr2LL(arr);
        traverse(arr);
        int len=lengthOfll(head);
        System.out.println(y.data);
    }
}
