class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return solve(n, dp);
    }
    public int solve(int n, Integer[] dp){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != null){
            return dp[n];
        }
        int one = solve(n-1, dp);
        int two = solve(n-2, dp);
        return dp[n] = one+two;
    }
}