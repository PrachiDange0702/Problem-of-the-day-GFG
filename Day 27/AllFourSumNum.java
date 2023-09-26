class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> quadruples = new ArrayList<>();
        
        // Sort the input array
        Arrays.sort(arr);
        
        // Iterate through the array to select the first two elements
        for (int i = 0; i < arr.length - 3; i++) {
            // Skip duplicates for the first element of the quadruple
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            
            for (int j = i + 1; j < arr.length - 2; j++) {
                // Skip duplicates for the second element of the quadruple
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                
                int left = j + 1;  // Initialize left pointer
                int right = arr.length - 1;  // Initialize right pointer
                
                while (left < right) {
                    int currentSum = arr[i] + arr[j] + arr[left] + arr[right];
                    
                    if (currentSum == k) {
                        // Found a valid quadruple, add to the result list
                        ArrayList<Integer> quadruple = new ArrayList<>();
                        quadruple.add(arr[i]);
                        quadruple.add(arr[j]);
                        quadruple.add(arr[left]);
                        quadruple.add(arr[right]);
                        quadruples.add(quadruple);
                        
                        // Move pointers to avoid duplicates
                        while (left < right && arr[left] == arr[left + 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (currentSum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return quadruples;
    }
}
