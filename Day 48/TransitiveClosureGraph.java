class Solution{
    static void dfs(int v, int p, ArrayList<ArrayList<Integer>> adj, int[][] arr)
    {
        if(arr[p][v]==1)
            return;
        
        arr[p][v]=1;
        
        for(int a : adj.get(v)){
            dfs(a,p,adj,arr);
        }
    }
    static ArrayList<ArrayList<Integer>> transitiveClosure(int n, int graph[][])
    {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i!=j && graph[i][j]==1)
                    adj.get(i).add(j);
        
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            if(arr[i][i]==0)
            {
                dfs(i,i,adj,arr);
            }
        }
        adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            for(int j=0;j<n;j++)
                adj.get(i).add(arr[i][j]);
        }
                
        return adj;
    }
}
