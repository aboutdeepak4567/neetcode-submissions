class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int k = n/2;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=k){
                return nums[i];
            }
        }
        return -1;
        
    }
}