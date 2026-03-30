class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            if(seen.contains(i)){
                return i;
            }else{
                seen.add(i);
            }
        }
        return -1;
        
    }
}
