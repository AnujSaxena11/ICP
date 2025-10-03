class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates, 0, target, temp, ans);
        return ans;

    }
    public void solve(int[] arr, int s, int target, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = s; i<arr.length; i++){
            if(arr[i] > target){
                break;
            }
            if(i > s && arr[i] == arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            solve(arr, i+1, target-arr[i], temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}