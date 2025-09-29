class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == j || j == n-1-i){
                    ans += mat[i][j];
                }
            }
        }
        return ans;
    }
}