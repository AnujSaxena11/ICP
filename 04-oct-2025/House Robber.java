class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums, 0, dp);
    }
    public static int robber(int[] arr, int idx, int[] dp) {
		if(idx >= arr.length) {
			return 0;
		}
		if(dp[idx] != -1) {
			return dp[idx];
		}
		int take = arr[idx] + robber(arr, idx+2, dp);
		int notTake =robber(arr, idx+1, dp);
		dp[idx] = Math.max(take, notTake);
		return Math.max(take, notTake);
	}
}