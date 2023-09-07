class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        int n=arr.length;
        // Your code here
         int ans[] = new int[100001];
 
        // -1 indicated the state has not been visited
        Arrays.fill(ans, -1);
        int mod = 100000;
 
        // queue to store all possible states
        Queue<Integer> q = new LinkedList<>();
 
        // initially push the start
        q.add(start % mod);
 
        // to reach start we require 0 steps
        ans[start] = 0;
 
        // till all states are visited
        while (!q.isEmpty()) {
 
            // get the topmost element in the queue
            int top = q.peek();
 
            // pop the topmost element
            q.remove();
 
            // if the topmost element is end
            if (top == end) {
                return ans[end];
            }
 
            // perform multiplication with all array elements
            for (int i = 0; i < n; i++) {
                int pushed = top * arr[i];
                pushed = pushed % mod;
 
                // if not visited, then push it to queue
                if (ans[pushed] == -1) {
                    ans[pushed] = ans[top] + 1;
                    q.add(pushed);
                }
            }
        }
        return -1;
 
    }
}
