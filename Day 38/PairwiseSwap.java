class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
         if (head == null || head.next == null) {
            return head;
        }
 
        // Initialize previous and current pointers
        Node prev = head;
        Node curr = head.next;
 
        head = curr; // Change head before proceeding
 
        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node
 
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
 
            // Change next of previous to next next
            prev.next = next.next;
 
            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return head;
    }
}
