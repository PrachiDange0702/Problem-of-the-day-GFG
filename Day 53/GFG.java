class Solution {
    int MOD = 1000000007;

    long power(long x, long y) {
        long result = 1;
        x = x % MOD;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y = y / 2;
        }
        return result;
    }

    long numberOfPaths(int M, int N) {
        long result = 1;

        // Calculate (M + N - 2) choose (M - 1) using modular arithmetic.
        for (int i = 0; i < M - 1; i++) {
            result = (result * (M + N - 2 - i)) % MOD;
            result = (result * power(i + 1, MOD - 2)) % MOD;
        }

        return result;
    }
}
