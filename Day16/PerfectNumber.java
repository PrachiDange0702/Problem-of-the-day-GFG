class Solution {
    static int isPerfectNumber(long N) {
        // code here
         if (N <= 1) {
            return 0;
        }

        long sum = 1;
        long sqrtN = (long) Math.sqrt(N);

        for (int i = 2; i <= sqrtN; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }

        if (sum == N) {
            return 1; // N is a perfect number
        } else {
            return 0; // N is not a perfect number
        }
    }
};
