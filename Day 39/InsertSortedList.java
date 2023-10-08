class Solution {
    Node sortedInsert(Node head1, int key) {
        // Create a new node with the given key
        Node newNode = new Node(key);

        // If the linked list is empty or the key is smaller than the head's data
        // Insert the new node at the beginning
        if (head1 == null || key < head1.data) {
            newNode.next = head1;
            return newNode;
        }

        // Find the correct position to insert the new node
        Node current = head1;
        while (current.next != null && current.next.data < key) {
            current = current.next;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;

        return head1;
    }
}
