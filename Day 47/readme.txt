Problem of the Day - Making A Large Island.

Link of the Problem - https://practice.geeksforgeeks.org/problems/making-a-large-island/1

Question - You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1. A group of connected 1s forms an island. Two 1s are connected if they share one of their sides with each other.

Return the size of the largest island in the grid after applying this operation.

Example 1:

Input: 
grid = [[1,0],[0,1]]
Output:
3
Explanation:
Change any one 0 to 1 and connect two 1s, then we get an island with area = 3.
Example 2:

Input: 
grid = [[1,1],[1,0]]
Output:
4
Explanation:
Change the only 0 to 1 and make the island bigger, then we get an island with area = 4.
Example 3:

Input: 
grid = [[1,1],[1,1]]
Output:
4
Explanation:
Can't change any 0 to 1, only one island possible with area = 4.

Constraints:

1 <= n <= 500
0 <= grid[i][j] <= 1 (grid[i][j] ∈ {0, 1} and 0<=i,j<n)

