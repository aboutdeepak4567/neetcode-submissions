class Solution {
    public int search(int[] nums, int target) {
        int fi = 0;
        int li = nums.length-1;
        while(li>=fi){
            int mid = (fi+li)/2;
            if(nums[mid] == target){
                return mid;

            }else if(nums[mid]>target){
                li = mid-1;
            }else{
                fi = mid+1;
            }

        }
        return -1;
        
    }
}
