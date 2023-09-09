class Solution
{
    int count = 0;
    int result = -1;

    public int kthLargest(Node root, int K)
    {
        reverseInorderTraversal(root, K);
        return result;
    }

    private void reverseInorderTraversal(Node node, int K)
    {
        if (node == null || count >= K)
            return;

        // Recur on the right subtree
        reverseInorderTraversal(node.right, K);

        // Increment the count of visited nodes
        count++;

        // If the count is equal to K, we have found the Kth largest element
        if (count == K)
        {
            result = node.data;
            return;
        }

        // Recur on the left subtree
        reverseInorderTraversal(node.left, K);
    }
}
