

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
         Node dummy = new Node(0); // Dummy node to simplify code
        Node current = dummy; // Pointer to the current node in the result list

        // Traverse both linked lists
        while (head1 != null && head2 != null)
        {
            if (head1.data == head2.data)
            {
                // Add the common element to the result list
                current.next = new Node(head1.data);
                current = current.next;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if (head1.data < head2.data)
            {
                // Move to the next node in the first list
                head1 = head1.next;
            }
            else
            {
                // Move to the next node in the second list
                head2 = head2.next;
            }
        }

        return dummy.next; // Return the head of the result list (excluding the dummy node)
    }
}
