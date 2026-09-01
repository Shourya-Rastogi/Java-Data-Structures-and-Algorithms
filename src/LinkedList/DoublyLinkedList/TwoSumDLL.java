package LinkedList.DoublyLinkedList;
import java.util.*;
public class TwoSumDLL {
    List<List<Integer>> twoSumPairs(Node head,int sum){
        List<List<Integer>> res=new ArrayList<>();
        if(head==null) return res;
        Node left=head;
        Node right=head;
        while(right!=null) right=right.nextNode;
        while(left.data<right.data){
            if(left.data+right.data==sum){
                List<Integer> pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                res.add(pair);
                left=left.nextNode;
                right=right.prevNode;
            }
            else if(left.data+right.data<sum) left=left.nextNode;
            else right=right.prevNode;
        }
        return res;
    }
}
