class Solution
{
    //Function to find the maximum money the thief can get.
    int dp[];
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(arr, n, 0);
    }
    
    int helper(int arr[], int n, int idx){
        if(idx >= n)return 0;
        if(dp[idx] != -1)return dp[idx];
        int take = arr[idx] + helper(arr, n, idx+2);
        int notTake = helper(arr, n, idx+1);
        
        return dp[idx] = Math.max(take, notTake);
    }
}
