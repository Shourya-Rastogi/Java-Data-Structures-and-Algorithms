package LinkedList.OneDLinkedList;

public class MergeTwoSortedLists {
    Node mergeTwoLists(Node List1,Node List2){
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while(List1!=null && List2!=null){
            if(List1.data<List2.data){
                temp.nextNode=List1;
                temp=List1;
                List1=List1.nextNode;
            }
            else{
                temp.nextNode=List2;
                temp=List2;
                List2=List2.nextNode;
            }
        }
        if(List1!=null) temp.nextNode=List1;
        else temp.nextNode=List2;
        return dummyNode.nextNode;
    }
}
