class Solution {
    public int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        solve(nums, 0, 0, target);
        return count;
    }
    public void solve(int[] arr, int i, int sum, int target){
        if(i == arr.length){
            if(sum == target){
                count++;
            }
            return;
        }
        solve(arr, i+1, sum-arr[i], target);
        solve(arr, i+1, sum+arr[i], target);
    }
}