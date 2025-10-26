class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        Integer[] dp = new Integer[n+1];
        for(int i = 1 ; i*i<=n; i++){
            lst.add(i*i);
        }
        return solve(n, lst, dp);
    }

    public int solve(int n, ArrayList<Integer> lst, Integer[] dp){
        if(n == 0){
            return 0;
        }
        if(dp[n] != null){
            return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<lst.size(); i++){
            if(lst.get(i) > n){
                break;
            }
            min = Math.min(min, 1+solve(n-lst.get(i), lst, dp));
        }
        return dp[n] = min;
    }
}