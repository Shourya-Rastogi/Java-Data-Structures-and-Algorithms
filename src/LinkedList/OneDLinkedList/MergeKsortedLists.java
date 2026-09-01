package LinkedList.OneDLinkedList;

import java.util.PriorityQueue;

public class MergeKsortedLists {
    Node mergeKLists(Node[] lists) {
        // Create a priority queue (min-heap) to store nodes
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> a.data - b.data
        );

        // Push the head of each non-null list into the heap
        for (Node node : lists) {
            if (node != null) pq.add(node);
        }

        // Create a dummy node to build the result list
        Node dummy = new Node(0);
        Node tail = dummy;

        // While the heap is not empty
        while (!pq.isEmpty()) {
            // Extract the node with the smallest value
            Node smallest = pq.poll();

            // Add it to the result list
            tail.nextNode = smallest;
            tail = tail.nextNode;

            // If there's a next node, push it into the heap
            if (smallest.nextNode != null) {
                pq.add(smallest.nextNode);
            }
        }

        // Return the head of the merged list
        return dummy.nextNode;
    }
}
