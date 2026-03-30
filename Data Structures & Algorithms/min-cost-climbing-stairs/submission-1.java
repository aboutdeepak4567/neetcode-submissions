class Solution {
    private int dfs(int[] dp,int[] arr,int i){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != 0){
            return dp[i];
        }
        dp[i] = arr[i] + Math.min(dfs(dp,arr,i+1),dfs(dp,arr,i+2));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        return Math.min(dfs(dp,cost,0),dfs(dp,cost,1));
        
    }
}
