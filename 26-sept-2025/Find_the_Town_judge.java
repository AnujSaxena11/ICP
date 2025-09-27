class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n];
        int[] out = new int[n];
        int ans = -1;
        for(int[] arr : trust){
            in[arr[1]-1] ++;
            out[arr[0]-1] ++;
        }
        for(int i=0; i<n; i++){
            if(out[i] == 0 && in[i] == n-1){
                ans = i+1;
            }
        }
        return ans;
    }
}