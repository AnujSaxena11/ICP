class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1, k, n, ans, temp, -1);
        return ans;
    }
    public void solve(int idx, int k, int n, List<List<Integer>> ans, List<Integer> temp, int lastPick){
        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i<=9; i++){
            if((lastPick == -1 || lastPick != i) && n >= i){
                temp.add(i);
                solve(i, k-1, n-i, ans, temp, i);
                temp.remove(temp.size()-1);
            }
        }
    }
}