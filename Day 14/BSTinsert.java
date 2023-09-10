class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Node(Key);
            return root;
        }
 
        // Otherwise, recur down the tree
        else if (Key < root.data)
            root.left = insert(root.left, Key);
        else if (Key > root.data)
            root.right = insert(root.right, Key);
 
        // Return the (unchanged) node pointer
        return root;
    }
}
