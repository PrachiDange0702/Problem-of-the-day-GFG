 problem of the Day - Floor in BST.

Link of the Problem - https://practice.geeksforgeeks.org/problems/floor-in-bst/1

Question - You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
Note: when x is smaller than the smallest node of BST then returns -1.

Example:

Input:
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
Output:
87
Explanation:
87 is present in tree so floor will be 87.
Example 2:

Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
Output:
9

Constraint:
1 <= Noda data <= 109
1 <= n <= 105

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
