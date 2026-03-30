class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int complement = 0;
        for(int i = 0;i<nums.length;i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
            int j = map.get(complement);
            return new int[]{j,i};
            }else{
            map.put(nums[i],i);
            }



        }
        throw new IllegalArgumentException("not found");
        
    }
}
