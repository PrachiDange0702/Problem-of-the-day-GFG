class GfG {
    Node buildBalancedTree(Node root) {
        // Step 1: Inorder traversal to extract elements into a sorted array
        List<Integer> elements = new ArrayList<>();
        inorderTraversal(root, elements);

        // Step 2: Build a balanced BST from the sorted array
        return sortedArrayToBST(elements, 0, elements.size() - 1);
    }

    void inorderTraversal(Node root, List<Integer> elements) {
        if (root != null) {
            inorderTraversal(root.left, elements);
            elements.add(root.data);
            inorderTraversal(root.right, elements);
        }
    }

    Node sortedArrayToBST(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(elements.get(mid));
        root.left = sortedArrayToBST(elements, start, mid - 1);
        root.right = sortedArrayToBST(elements, mid + 1, end);
        return root;
    }
}
