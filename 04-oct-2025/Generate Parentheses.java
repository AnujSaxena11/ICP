class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n, 0, 0, "", ans);
        return ans;
    }
    public void solve(int n, int open, int close, String str, List<String> ans){
        if(open==n && close == n){
            ans.add(str);
            return;
        }
        if(open>n || close>open){
            return;
        }
        solve(n, open+1, close, str + "(", ans);
        solve(n, open, close+1, str + ")", ans);
    }
}