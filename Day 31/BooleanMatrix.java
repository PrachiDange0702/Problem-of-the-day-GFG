class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int r = matrix.length;
        int c = matrix[0].length;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 1){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(Integer i: row){
            for(int j=0;j<c;j++){
                matrix[i][j] = 1;
            }
        }
        for(Integer i : col){
            for(int j=0;j<r;j++){
                matrix[j][i] = 1;
            }
        }
    
    }
}
