class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
            if(map.get(i)>nums.length/2){
                res=i;
            }
        }
        return res;

        
    }
}