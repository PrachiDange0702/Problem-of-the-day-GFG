Problem of the Day - Level of Nodes

Link of the Problem -https://practice.geeksforgeeks.org/problems/level-of-nodes-1587115620/1

Question - Given an integer X and an undirected acyclic graph with V nodes, labeled from 0 to V-1, and E edges, find the level of node labeled as X.

Level is the minimum number of edges you must travel from the node 0 to some target.

If there doesn't exists such a node that is labeled as X, return -1.

Example 1:

Input:

X = 4
Output:
2
Explanation:

We can clearly see that Node 4 lies at Level 2.
Example 2:

Input:

X = 1
Output:
1
Explanation:
Node 1 lies at level 1, immediate after Node 0.

Expected Time Complexity: O(V)
Expected Auxiliary Space: O(V)

Constraints:
2 ≤ V ≤ 104
1 ≤ E ≤ 104
0 ≤ adji, j < V
1 ≤ X < V
Graph doesn't contain multiple edges and self loops.
