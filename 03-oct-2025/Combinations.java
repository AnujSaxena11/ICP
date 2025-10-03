class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1, temp, ans, n, k);
        return ans;
    }
    public void solve(int s, List<Integer> temp, List<List<Integer>> ans, int n, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = s; i<=n; i++){
            temp.add(i);
            solve(i+1, temp, ans, n, k);
            temp.remove(temp.size()-1);
        }
    }
}