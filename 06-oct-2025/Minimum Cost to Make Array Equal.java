class Solution {
    public int ans = 0;
    public int countArrangement(int n) {
        if(n == 0){
            return 0;
        }
        solve(1, n, new int[n+1]);
        return ans;
    }
    public void solve(int idx, int n, int[] arr){
        if(idx > n){
            ans++;
            return;
        }
        for(int i = 1; i<=n; i++){
            if(&&arr[i] == 0  (idx%i == 0 || i%idx == 0)){
                arr[i] = 1;
                solve(idx+1, n, arr);
                arr[i] = 0;
            }
        }
    }
}