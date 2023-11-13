class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
         int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array using bottom-up dynamic programming.
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If one of the strings is empty, the length of the supersequence is the length of the other string.
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }
                // If the characters match, reduce both lengths.
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                // If the characters don't match, consider the minimum of adding a character from X or Y.
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of the shortest common supersequence is stored in dp[m][n].
        return dp[m][n];
    }
}
