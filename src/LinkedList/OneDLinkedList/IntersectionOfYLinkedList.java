package LinkedList.OneDLinkedList;

public class IntersectionOfYLinkedList {
    Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = a != null ? a.nextNode : headB;
            b = b != null ? b.nextNode : headA;
        }

        return a;
    }
}
