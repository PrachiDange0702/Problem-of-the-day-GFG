Problem of the day - Kth Lagrest element in BST

Link of the Problem - https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

Question - Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

Example 1:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4
Example 2:

Input:
       9
        \ 
          10
K = 1
Output: 10

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H) where H is max recursion stack of height H at a given time.

Constraints:
1 <= N <= 105
1 <= K <= N
