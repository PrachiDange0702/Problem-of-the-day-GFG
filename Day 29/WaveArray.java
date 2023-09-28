class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=1;i<n;){
            int temp=a[i-1];
            a[i-1]=a[i];
            a[i]=temp;
            
            i+=2;
        }
        // for(int x:a)
        //     System.out.print(x+" ");
    }
}
