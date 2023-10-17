 Problem of the Day - Transitive closure of a Graph.

Link of the Problem - https://practice.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1

Question - Given a directed graph, determine whether a vertex j is reachable from another vertex i for all vertex pairs (i, j) in the given graph. Here, vertex j is reachable from another vertex i means that there is a path from vertex i to j. The reachability matrix is called the transitive closure of a graph. The directed graph is represented by an adjacency matrix where there are N vertices. 

Example 1:

Input: N = 4
graph = {{1, 1, 0, 1}, 
         {0, 1, 1, 0}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Output: {{1, 1, 1, 1}, 
         {0, 1, 1, 1}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Explanation: 
The output list shows the reachable indexes.
Example 2:

Input: N = 3
graph = {{1, 0, 0}, 
         {0, 1, 0}, 
         {0, 0, 1}
Output: {{1, 0, 0}, 
         {0, 1, 0}, 
         {0, 0, 1}
Explanation: 
The output list shows the reachable indexes.

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(N2)

Constraints:
1 ≤ N ≤ 100  
