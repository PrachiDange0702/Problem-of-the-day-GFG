class Solution {
    // Convert binary tree to BST
    Node binaryTreeToBST(Node root) {
        // Step 1: Traverse the binary tree and store values in a list
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);

        // Step 2: Sort the values
        values.sort(null);

        // Step 3: Build a new BST using the sorted values
        return buildBST(values, 0, values.size() - 1);
    }

    // In-order traversal to populate the values list
    void inorderTraversal(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, values);
        values.add(node.data);
        inorderTraversal(node.right, values);
    }

    // Build BST from sorted values
    Node buildBST(List<Integer> values, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle index
        int mid = (start + end) / 2;

        // Create the root node using the middle value
        Node root = new Node(values.get(mid));

        // Recursively build left and right subtrees
        root.left = buildBST(values, start, mid - 1);
        root.right = buildBST(values, mid + 1, end);

        return root;
    }
}
