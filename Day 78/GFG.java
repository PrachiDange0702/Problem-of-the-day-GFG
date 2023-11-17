class Solution
{ 
    Node head, prev, tail;

    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        if (root == null) {
            return null;
        }

        // Initialize global pointers
        head = null;
        prev = null;
        tail = null;

        // Convert the tree to CDLL
        convertToCDLL(root);

        // Make the CDLL circular
        if (head != null && tail != null) {
            head.left = tail;
            tail.right = head;
        }

        return head;
    }

    // Helper function to perform in-order traversal and convert to CDLL
    void convertToCDLL(Node root)
    {
        if (root == null) {
            return;
        }

        // Recursively convert the left subtree
        convertToCDLL(root.left);

        // Process the current node
        if (prev == null) {
            // If prev is null, this is the leftmost node (head of CDLL)
            head = root;
        } else {
            // Otherwise, update the right pointer of the previous node
            prev.right = root;
        }

        // Update the left pointer of the current node
        root.left = prev;

        // Update the tail to the current node
        tail = root;

        // Update prev to the current node
        prev = root;

        // Recursively convert the right subtree
        convertToCDLL(root.right);
    }
}
