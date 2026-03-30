class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int area = 0;
        for(int i =0;i<heights.length;i++){
            for(int j = i+1;j<heights.length;j++){
                if(heights[i]>=heights[j]){
                    area = heights[j]*(j-i);
                    // max = Math.max(max,area);

                }else{
                     area = heights[i]*(j-i);
                    // max = Math.max(max,area);
                }
                max = Math.max(max,area);
            }
        }
        return max;
        
    }
}
