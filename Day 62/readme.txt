class Solution {
    void pushZerosToEnd(int[] nums, int n) {
       int i = 0;
        for(int arr : nums){
            if(arr!=0){
                nums[i] = arr;
                i++;
            }
        }
        while(i<nums.length){
            nums[i++] = 0;
        }
    }
}
