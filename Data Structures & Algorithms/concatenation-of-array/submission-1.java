class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);             // First half
        System.arraycopy(nums, 0, arr, nums.length, nums.length);   // Second half
        return arr;
    }
}