package LinkedList.OneDLinkedList;

public class PalindromeList {
    static Node reverseList(Node head){
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
    static boolean isPalindrome(Node head){
        if(head==null || head.nextNode==null) {
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.nextNode!=null&&fast.nextNode.nextNode!=null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
        }
        Node newHead=reverseList(slow.nextNode);
        Node first=head;
        Node second=newHead;
        while(second!=null){
            if(first.data!=second.data){
                reverseList(newHead);
                return false;
            }
            first=first.nextNode;
            second=second.nextNode;
        }
        reverseList(newHead);
        return true;
    }

    static void main() {

    }
}
