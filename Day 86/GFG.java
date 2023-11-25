class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int mid = n/2;
        long a[] = new long[n];
        for(int i = 0;i<n;i++){
            a[i] = arr[i];
        }
        int k = mid;
        int m = 0;
        for(int j = 0;j<n;j++){
            
            if(j%2==0){
                arr[j] = a[m];
                m++;
            }
            else{
                arr[j] = a[k];
                k++;
            }
        }
    }
}
