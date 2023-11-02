class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
              int idx_x = -1; int idx_y = -1; int dis = 1000000;
        for(int i = 0; i < n; i++) {
            if(a[i] == x || a[i] == y) {
                if(a[i] == x) idx_x = i;
                else idx_y = i;
          if(idx_x >= 0 && idx_y >= 0) dis = Math.min(dis, Math.abs(idx_x-idx_y));
            }
        }
        if(dis == 1000000) dis = -1;
        return dis;
    }

}
