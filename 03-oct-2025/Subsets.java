class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, temp, ans, nums);
        return ans;
    }
    public void solve(int s, List<Integer> temp, List<List<Integer>> ans, int[]arr){
        if(s == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        solve(s+1, temp, ans, arr);
        temp.add(arr[s]);
        solve(s+1, temp, ans, arr);
        temp.remove(temp.size()-1);
    }
}