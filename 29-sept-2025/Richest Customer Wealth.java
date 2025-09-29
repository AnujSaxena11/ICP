class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int[] arr : accounts){
            int val = calculate(arr);
            ans = Math.max(ans, val);
        }
        return ans;
    }
    public int calculate(int[] arr){
        int val = 0;
        for(int i : arr){
            val+=i;
        }
        return val;
    }
}