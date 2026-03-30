class Solution {
    
private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }


    
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int longest = 1;
        for(int i = 0;i<nums.length;i++){
            int x = nums[i];
            int length = 1;
            while(contains(nums,x+1)){
                x++;
                length++;
            }
           longest = Math.max(longest,length);
           


                
            
            
        }
        return longest;
        
    }
}
