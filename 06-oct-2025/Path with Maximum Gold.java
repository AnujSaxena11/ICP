class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans = 0;
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                ans = Math.max(ans, solve(grid, row, col));
            }
        }
        return ans;
    }
    public int solve(int[][] grid, int row, int col){
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] == 0){
            return 0;
        }
        int temp = grid[row][col];
        grid[row][col] = 0;
        int l = solve(grid, row, col-1);
        int r = solve(grid, row, col+1);
        int b = solve(grid, row+1, col);
        int u = solve(grid, row-1, col);
        grid[row][col] = temp;
        return temp + Math.max(Math.max(l,r), Math.max(b,u));
    }
}