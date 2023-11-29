class Solution {
    public int isEulerCircuit(int V, List<Integer>[] adj) {
        int[] degrees = new int[V];

        // Calculate degrees of all vertices
        for (int i = 0; i < V; i++) {
            degrees[i] = adj[i].size();
        }

        // Count vertices with odd degrees
        int oddDegreeCount = 0;
        for (int degree : degrees) {
            if (degree % 2 != 0) {
                oddDegreeCount++;
            }
        }

        // Analyze the degrees to determine the result
        if (oddDegreeCount == 0) {
            // All vertices have even degrees, Eulerian circuit
            return 2;
        } else if (oddDegreeCount == 2) {
            // Exactly two vertices have odd degrees, Eulerian path
            return 1;
        } else {
            // Any other combination of degrees, no Eulerian path or circuit
            return 0;
        }
    }
}
