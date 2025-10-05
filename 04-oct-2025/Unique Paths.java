class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return solve(0, 0, m, n, dp);
    }
    public int solve(int row, int col, int m, int n, int[][] dp){
        if(row >= m || col >= n){
            return 0;
        }
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        int right = solve(row, col+1, m, n, dp);
        int bottom = solve(row+1, col, m, n, dp);
        return dp[row][col] = right+bottom;
    }
}