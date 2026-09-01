package LinkedList.OneDLinkedList;

public class ReverseNodesInKGroups {

    public Node reverseKGroup(Node head, int k) {
        // Create a dummy node to handle edge cases
        Node dummy = new Node(0);
        dummy.nextNode = head;

        // Pointer to the tail of the last reversed group
        Node groupPrev = dummy;

        while (true) {
            // Get the k-th node in the current group
            Node kth = getKthNode(groupPrev, k);
            if (kth == null) break;

            // Store the next group’s head
            Node groupNext = kth.nextNode;

            // Reverse the current k-group
            Node prev = groupNext;
            Node curr = groupPrev.nextNode;

            for (int i = 0; i < k; i++) {
                Node temp = curr.nextNode;
                curr.nextNode = prev;
                prev = curr;
                curr = temp;
            }

            // Connect the previous group to the reversed group
            Node temp = groupPrev.nextNode;
            groupPrev.nextNode = kth;
            groupPrev = temp;
        }

        // Return the new head
        return dummy.nextNode;
    }

    // Helper function to get the k-th node from the current node
    private Node getKthNode(Node curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.nextNode;
            k--;
        }
        return curr;
    }
}
