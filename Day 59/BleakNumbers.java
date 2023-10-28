class Solution
{
     public static int countSetBits(int x) {
        int count = 0;
        while (x > 0) {
            x = x & (x - 1);
            count++;
        }
        return count;
    }

    public int is_bleak(int n) {
        int upperBound = 2 * (int) (Math.log(n) / Math.log(2));
        
        for (int x = n - upperBound; x < n; x++) {
            if (x + countSetBits(x) == n) {
                return 0; // n is not Bleak
            }
        }
        return 1; // n is Bleak
    }
}
