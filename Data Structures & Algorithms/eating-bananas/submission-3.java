class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        int result = right;
        while(left<=right){
            int mid = left+(right -left)/2;
            int total=0;
            for(int i : piles){
                total+=(i+mid-1)/mid;

            }
            if(total<=h){
                result = mid;
                right = mid -1;
                
            }else{
                left = mid+1;
                
            }
        }
        
        return result;
        
    }
    private  int getMax(int[] arr){
            int max = 0;
            for(int i : arr){
                max = Math.max(i,max);

            }
            return max;
        }
}