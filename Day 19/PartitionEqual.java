class Solution {
    public int equalPartition(int N, int arr[]) {
        int n = arr.length;
        int sum = 0;

        // Calculate the sum of all elements
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // If the sum is odd, it's impossible to partition into two subsets with equal sums
        if (sum % 2 != 0)
            return 0;

        boolean part[][] = new boolean[sum / 2 + 1][n + 1];

        // Initialize the top row as true
        for (int i = 0; i <= n; i++)
            part[0][i] = true;

        // Initialize the leftmost column (except part[0][0]) as false
        for (int i = 1; i <= sum / 2; i++)
            part[i][0] = false;

        // Fill the partition table in a bottom-up manner
        for (int i = 1; i <= sum / 2; i++) {
            for (int j = 1; j <= n; j++) {
                part[i][j] = part[i][j - 1];
                if (i >= arr[j - 1])
                    part[i][j] = part[i][j] || part[i - arr[j - 1]][j - 1];
            }
        }

        // Check if it's possible to partition into two subsets with equal sums
        if (part[sum / 2][n])
            return 1;
        else
            return 0;
    }
}
