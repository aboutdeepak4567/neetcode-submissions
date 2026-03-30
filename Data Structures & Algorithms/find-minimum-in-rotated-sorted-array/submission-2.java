class Solution {
    public int findMin(int[] nums) {
        int tr = nums.length - 1;
        int fr = 0;
        int min = nums[0];

        while (fr <= tr) {
            if (nums[fr] < nums[tr]) {
                min = Math.min(min, nums[fr]);
                break;
            }

            int mid = fr + (tr - fr) / 2;
            min = Math.min(min, nums[mid]);

            if (nums[mid] >= nums[fr]) {
                fr = mid + 1; // ✅ Corrected
            } else {
                tr = mid - 1; // ✅ Corrected
            }
        }
        return min;
    }
}
