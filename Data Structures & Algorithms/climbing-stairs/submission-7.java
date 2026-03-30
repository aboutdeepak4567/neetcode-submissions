class Solution {
    private int stair(int n, int[] arr){
         if(n == 0 || n == 1 ){
            return 1;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        arr[n] = stair(n-2,arr) + stair(n-1,arr);
        return arr[n];
    }
    public int climbStairs(int n) {
       
        int[] dp = new int[n+1];
        return stair(n,dp);
        
        
    }
}
