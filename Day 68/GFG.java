class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][]) {
        // code here
        int[] dx1 = {-1,-1,-1,0,0,1,1,1};
        int[] dy1 = {-1,0,1,-1,1,-1,0,1};
        int[] dx2 = {-2,-2,-2,-2,-2,-1,-1,0,0,1,1,2,2,2,2,2,};
        int[] dy2 = {-2,-1,0,1,2,-2,2,-2,2,-2,2,-2,-1,0,1,2 };
            
        List<Integer> ls = new ArrayList<>();
        for (int x = 0; x<q; x++) {
            int sum = 0;
            int row = queries[x][1], col = queries[x][2];

            if (queries[x][0] == 1) {
                for (int i = 0; i<dx1.length; i++) {
                    int nRow = row + dx1[i];
                    int nCol = col + dy1[i];

                    if (isSafe(nRow, nCol, n, m)) {
                        sum += mat[nRow][nCol];
                    }
                }
            } else {
                for (int i = 0; i < dx2.length; i++) {
                    int nRow = row + dx2[i];
                    int nCol = col + dy2[i];

                    if (isSafe(nRow, nCol, n, m)) {
                        sum += mat[nRow][nCol];
                    }
                }
            }
            ls.add(sum);
        }
        return ls;
    }

    private static boolean isSafe(int nRow, int nCol, int n, int m) {
        return (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m);
    }
}
