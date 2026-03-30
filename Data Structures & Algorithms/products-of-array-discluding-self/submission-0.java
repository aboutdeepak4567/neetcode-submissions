class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int mul = 1;
        int zeroCount = 0;
        for(int i : nums){
            if(i==0){
                zeroCount++;
            }else{
                mul *= i;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(zeroCount>1){
                arr[i]=0;
            }else if (zeroCount == 1){
                arr[i] = (nums[i]==0)?mul: 0;

            }else {
                arr[i] = mul /nums[i];
            }
        }
            
        return arr;
        
    }
}  
