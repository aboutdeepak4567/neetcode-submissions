class Solution {
    public int binarySearch(int[] nums,int target,int l,int r){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;


    }
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            // min = nums[mid];
            if(nums[mid]>nums[r]){
                l=mid+1;

            }else {
                r= mid;

            }
        }
        int pivot = l;
        int res = binarySearch(nums,target,pivot,nums.length-1);
        if(res != -1){
            return res;
        }
        return binarySearch(nums,target,0,pivot-1);


        
    }
}
