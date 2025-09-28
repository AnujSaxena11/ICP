class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int min_sum = nums[0]*nums[1];
        int max_sum = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(min_sum > 0){
            min_sum = min_sum*nums[nums.length-1];
        }
        int ans = Math.max(min_sum, max_sum);
        return ans;
    }
}