Problem of the Day - Find Common Nodes in BST.

Link - https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

Question - Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.

Note: Return the common nodes in sorted order.

Example 1:

Input:
BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
BST2:
                10 
              /    \
             7     20
           /   \ 
          4     9
Output: 4 7 9 10

Example 2:

Input:
BST1:
     10
    /  \
   2   11
  /  \
 1   3
BST2:
       2
     /  \
    1    3
Output: 1 2 3

Expected Time Complexity: O(N1 + N2) where N1 and N2 are the sizes of the 2 BSTs.
Expected Auxiliary Space: O(H1 + H2) where H1 and H2 are the heights of the 2 BSTs.

Constraints:
1 <= Number of Nodes <= 105
1 <= Node data <= 109
