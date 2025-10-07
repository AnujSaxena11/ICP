class Solution {
    public int uniquePathsIII(int[][] grid) {
        int ans = 0;
        int count = 0;
        int r = 0;
        int c = 0;
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                if(grid[row][col] == 0){
                    count++;
                }
                if(grid[row][col] == 1){
                    r = row;
                    c = col;
                }
            }
        }
        return solve(grid, r, c, count+1);
    }
    public int solve(int[][] grid, int row, int col, int count){
        if(row < 0 || row >= grid.length || col<0 || col >= grid[0].length || grid[row][col] == -1){
            return 0;
        }
        if(grid[row][col] == 2){
            if(count == 0){
                return 1;
            }
            return 0;
        }
        grid[row][col] = -1;
        int l = solve(grid, row, col-1, count-1);
        int r = solve(grid, row, col+1, count-1);
        int b = solve(grid, row+1, col, count-1);
        int u = solve(grid, row-1, col, count-1);
        grid[row][col] = 0;
        return l+r+b+u;
    }
}