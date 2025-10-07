class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length-1) >= 0; 
    }
    public int solve(int[]nums, int i, int j){
        if(i == j){
            return nums[i];
        }
        int take_i = nums[i] - solve(nums, i+1, j);
        int take_j = nums[j] - solve(nums, i, j-1);
        return Math.max(take_i, take_j);
    }
}