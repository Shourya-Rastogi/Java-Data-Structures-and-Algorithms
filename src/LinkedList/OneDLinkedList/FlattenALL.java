package LinkedList.OneDLinkedList;

class ListNode{
    ListNode next;
    ListNode child;
    int val;
    ListNode(int val,ListNode next,ListNode child){
        this.val=val;
        this.next=next;
        this.child=child;
    }

    ListNode(int val){
        this.val=val;
        this.next=null;
        this.child=null;
    }
}
public class FlattenALL {
//    static ListNode merge2Lists(ListNode head1,ListNode head2){
//        ListNode dummyNode=new ListNode(-1);
//        ListNode res=dummyNode;
//        while(head1!=null && head2!=null){
//            if(head1.val<head2.val){
//                res.child=head1;
//                res=head1;
//                head1=head1.child;
//            }
//            else{
//                res.child=head2;
//                res=head2;
//                head2=head2.child;
//            }
//            res.next=null;
//        }
//        if (head1!=null) res.child=head1;
//        else res.child=head2;
//        if(dummyNode.child!=null){
//            dummyNode.child.next = null;
//        }
//        return dummyNode.next;
//    }
//    static ListNode flatten(ListNode head){
//        if(head==null || head.next==null) return head;
//        ListNode mergedHead = flatten(head.next);
//        return merge2Lists(head,mergedHead);
//    }
    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }

        if (list1 != null) res.child = list1;
        else res.child = list2;

        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }

    // Flatten a multi-level linked list
    public static ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mergedHead = flattenLinkedList(head.next);
        return merge(head, mergedHead);
    }

    static void main() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.child=new ListNode(10);
        head.next.next.child=new ListNode(7);
        head.next.next.child.child=new ListNode(11);
        head.next.next.child.child.child=new ListNode(12);
        head.next.next.next.child=new ListNode(9);
        head.next.next.next.next.child=new ListNode(6);
        head.next.next.next.next.child.child=new ListNode(8);
        ListNode flattened=flattenLinkedList(head);
        ListNode temp=flattened;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.child;
        }
    }
}
