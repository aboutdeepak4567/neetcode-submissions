class Solution {
    private int stair(int n, int[] cache){
        if(n == 0 || n == 1){
            return 1;
        }
        if(cache[n] != 0){
            return cache[n];
        }
        cache[n] = stair(n-2,cache) + stair(n-1,cache);

        return cache[n];

    }
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        return stair(n,cache);
        
    }
}
