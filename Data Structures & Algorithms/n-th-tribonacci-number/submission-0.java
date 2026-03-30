class Solution {
    private int dfs(int[] dp , int n){
        if(n == 0 || n== 1){
            return n;

        }
        if(n == 2){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = dfs(dp,n-1) + dfs(dp,n-2) + dfs(dp,n-3);
        return dp[n];
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+2];
        // Arrays.fill(dp,-1);
        return dfs(dp,n);
        
    }
}