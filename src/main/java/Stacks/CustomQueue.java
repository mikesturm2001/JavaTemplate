package Stacks;

public class CustomQueue {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }

        private Node head;  // remove from the head
        private Node tail;  // add to the tail

        public boolean isEmpty() {
            return head == null;
        }
        public int peek() {
            return head.data;
        }
        public void add(int data) {
            Node node = new Node(data);

            if(tail == null) {
                // inserting first element. Set both head and tail to the new node
                head = node;
                tail = node;
            }

            // update head to the new node
            tail.next = node;
            tail = node;
        }

        public int remove() {
            int value = head.peek();
            head = head.next;
            if(head == null) {
                tail = null;
            }

            return value;
        }
    }
}
