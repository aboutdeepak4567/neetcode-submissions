class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        for(int i =0;i<heights.length;i++){
            for(int j = i+1;j<heights.length;j++){
                if(heights[i]>=heights[j]){
                    int area = heights[j]*(j-i);
                    max = Math.max(max,area);

                }else{
                    int area = heights[i]*(j-i);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
        
    }
}
