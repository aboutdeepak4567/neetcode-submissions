class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        int i = 0;
        // int j = nums.length;
        while(i<nums.length){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
            i++;
            // j++;
        }
        return res;
        
    }
}