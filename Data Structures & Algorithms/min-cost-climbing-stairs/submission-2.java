class Solution {
    private HashMap<Integer,Integer> dpp = new HashMap<>();
    private int dfs(int[] dp,int[] arr,int i){
        if(i >= arr.length){
            return 0;
        }
        // if(dp[i] != 0){
        //     return dp[i];
        // }
        if(dpp.containsKey(i)){
            return dpp.get(i);
        }
        dpp.put(i, arr[i] + Math.min(dfs(dp,arr,i+1),dfs(dp,arr,i+2)));
        return dpp.get(i);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        return Math.min(dfs(dp,cost,0),dfs(dp,cost,1));
        
    }
}
