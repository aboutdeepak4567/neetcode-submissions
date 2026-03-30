class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        int[] lb = new int[n];
        int[] rb = new int[n];
        int max1 = 0;
        int max2 = 0;
        for(int i = 0;i<n;i++){
            lb[i] = Math.max(max1,height[i]);
            max1 = lb[i];
            
        }
        for(int i = n-1;i>=0;i--){
            rb[i] = Math.max(max2,height[i]);
            max2 = rb[i];
            
        }int water = 0;

        for(int i = 0;i<n;i++){
            water += Math.min(lb[i],rb[i]) - height[i];
        }
        return water;

        
    }
}
