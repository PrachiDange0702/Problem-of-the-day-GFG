class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
   private static boolean isMirror(Node left, Node right) {
        // If both trees are empty, they are symmetric
        if (left == null && right == null)
            return true;

        // If one of the trees is empty and the other is not, they are not symmetric
        if (left == null || right == null)
            return false;

        // Check if the values of the current nodes are equal and if the left subtree of the left
        // node is symmetric to the right subtree of the right node, and vice versa
        return (left.data == right.data) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    // Main function to check if the tree is symmetric
    public static boolean isSymmetric(Node root)
    {
        // If the tree is empty, it is symmetric
        if (root == null)
            return true;

        // Check if the left and right subtrees are symmetric
        return isMirror(root.left, root.right);
    }
}
