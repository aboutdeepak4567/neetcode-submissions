class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        for(int i = 0;i<n;i++){
            int low = Integer.MAX_VALUE;
            for(int j = i;j<n;j++){
                low = Math.min(low,heights[j]);
                if(heights[j] == 0){
                    area = Math.max(area,low * (j - i+1));

                }
                area = Math.max(area,low * (j - i+1));


            }

        }
        return area;
    }
}
