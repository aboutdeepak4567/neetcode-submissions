class Solution {
    private void dfs(List<List<Integer>> res,List<Integer> subSet,int i ,int[] nums){
        if(i >= nums.length){
            res.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[i]);
        dfs(res,subSet,i+1,nums);
        subSet.remove(subSet.size() - 1);
        dfs(res,subSet,i+1,nums);


    }



    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        dfs(res,subSet,0,nums);
        return res;
        
    }
}
