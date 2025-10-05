class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int amount) {
        List<List<Integer>> ans = new ArrayList<>();
		List<Integer> lst = new ArrayList<>();
		solve(coin, amount, lst, 0, ans);
        System.out.print(ans.size());
        return ans;
    }
    public static void solve(int[] arr, int amt, List<Integer> temp, int idx, List<List<Integer>> ans) {
        if(idx == arr.length || amt < 0){
            return;
        }
        if(amt == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        solve(arr, amt, temp, idx+1, ans);
        temp.add(arr[idx]);
        solve(arr, amt-arr[idx], temp, idx, ans);
        temp.remove(temp.size()-1);
	}
}