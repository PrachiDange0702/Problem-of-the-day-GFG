class Solution
{
    Node compute(Node head)
    {
        if (head == null || head.next == null) {
            return head; // No need to process if list has 0 or 1 elements
        }

        Node reversed = reverse(head);
        Node current = reversed;
        Node maxNode = reversed;
        Node prev = null;

        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                current.next = current.next.next;
            } else {
                maxNode = current.next;
                current = current.next;
            }
        }

        return reverse(reversed);
    }

    // Helper function to reverse the linked list
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
