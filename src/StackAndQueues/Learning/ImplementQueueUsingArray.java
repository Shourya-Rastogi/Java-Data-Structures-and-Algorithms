package StackAndQueues.Learning;

public class ImplementQueueUsingArray {
    static class ArrayQueue {
        private int[] queue;
        private int capacity;
        private int currSize;
        private int front;
        private int back;

        public ArrayQueue(int size) {
            queue = new int[size];
            capacity = size;
            currSize = 0;
            front = -1;
            back = -1;
        }

        public ArrayQueue() {
            this(100);
        }

        public void push(int x) {
            if (capacity == currSize) {
                System.out.println("Queue is full ../nExiting");
                System.exit(1);
            }
            if (back == -1) {
                front = 0;
                back = 0;
            } else {
                back = (back + 1) % capacity;
            }
            queue[back] = x;
        }

        public int pop() {
            if (currSize == 0) {
                System.out.println("Queue is Empty../nExiting");
                System.exit(1);
            }
            int popped = queue[front];
            if (currSize == 1) {
                front = -1;
                back = -1;
            } else {
                front = (front + 1) % capacity;
            }
            currSize--;
            return popped;
        }

        public int peek() {
            if (currSize == 0) {
                System.out.println("Queue is Empty");
                System.exit(1);
            }
            return queue[front];
        }

        public boolean isEmpty() {
            return currSize == 0;
        }
    }
}
