class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int fco=0,ind=0;
        for(int i=0;i<N;i++){
            int zco=0;
            for(int j=0;j<N;j++){
                if((arr[j][i])==0){
                    zco+=1;
                }
            }
            if(zco>fco){
                fco=zco;
                ind =i;
            }
        }
        if(fco==0){
            return -1;
        }
        return ind;
        
    }
}
