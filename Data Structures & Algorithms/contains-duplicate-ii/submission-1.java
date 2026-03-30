class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int j = 0;j<nums.length;j++){
            for(int i =j+1 ;i<Math.min(nums.length,j+k+1);i++){
                if(nums[j] == nums[i]){
                    return true;
                }
            }
        }
        return false;
        
    }
}