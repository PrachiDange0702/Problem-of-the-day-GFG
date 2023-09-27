class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here4
        int minDiff = Integer.MAX_VALUE;
        int res1 = -1, res2 = -1; // Elements from arr and brr forming the closest pair

        int i = 0, j = m - 1; // Initialize pointers for the first and last elements in brr

        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            int diff = Math.abs(sum - x);

            // Check if the current pair has a smaller difference
            if (diff < minDiff) {
                minDiff = diff;
                res1 = arr[i];
                res2 = brr[j];
            }

            // If the sum is less than x, increment the pointer for arr
            if (sum < x) {
                i++;
            }
            // If the sum is greater than x, decrement the pointer for brr
            else {
                j--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);
        return result;
    }
}
