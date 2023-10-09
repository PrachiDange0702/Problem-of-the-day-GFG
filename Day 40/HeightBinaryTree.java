class Solution {
    //Function to find the height of a binary tree.
    int height(Node root) {
        // code here 
        if (root == null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
