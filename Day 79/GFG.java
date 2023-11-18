public static Node reverseDLL(Node head) {
        Node current = head;
        Node temp = null;

        // Swap next and prev pointers for all nodes of the doubly linked list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }

        // Check if the list is not empty
        if (temp != null) {
            head = temp.prev; // The new head is the last node we processed
        }

        return head;
    }

    // Helper function to print the doubly linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
