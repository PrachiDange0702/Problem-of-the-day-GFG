class Solution {
    private static int sumofDigits(int n) {
        int ans=0;
        while(n>0) {
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
    
    static int isPossible(int N, int arr[]) {
        // code here
        int output=0;
        int sum=0;
        for (int i=0; i<N; ++i) {
            sum+=sumofDigits(arr[i]);
        }
        
        if(sum%3==0) {
            output=1;
        }
        return output;
    }
}
