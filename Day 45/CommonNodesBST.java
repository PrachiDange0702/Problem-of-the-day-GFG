class Solution {
    // Function to find the nodes that are common in both BSTs.
    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root1, root2, result);
        return result;
    }

    private static void inOrderTraversal(Node root1, Node root2, ArrayList<Integer> result) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        while (!stack1.isEmpty() || !stack2.isEmpty() || root1 != null || root2 != null) {
            while (root1 != null) {
                stack1.push(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                stack2.push(root2);
                root2 = root2.left;
            }

            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                Node top1 = stack1.peek();
                Node top2 = stack2.peek();

                if (top1.data == top2.data) {
                    result.add(top1.data);
                    stack1.pop();
                    stack2.pop();
                    root1 = top1.right;
                    root2 = top2.right;
                } else if (top1.data < top2.data) {
                    stack1.pop();
                    root1 = top1.right;
                } else {
                    stack2.pop();
                    root2 = top2.right;
                }
            } else if (!stack1.isEmpty()) {
                root1 = stack1.pop();
                root1 = root1.right;
            } else if (!stack2.isEmpty()) {
                root2 = stack2.pop();
                root2 = root2.right;
            }
        }
    }
}
