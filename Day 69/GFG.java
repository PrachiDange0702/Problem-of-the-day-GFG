class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        int sum1 = 0;
        int sum2  = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<=i){
                    sum2 += matrix[i][j];
                }
                
                if(j>=i){
                    sum1 += matrix[i][j];
                }
            }
        }
        
        
        list.add(sum1);
        list.add(sum2);
        
        return list;
    }
}
