class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int[] inDegree = new int[V]; // Array to store in-degrees of nodes

        // Calculate in-degrees for each node
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        // Sum up the in-degrees to get the total number of dependencies
        int sum = 0;
        for (int i = 0; i < V; i++) {
            sum += inDegree[i];
        }

        return sum;
    }
};
