class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, set, temp, 0, -1);
        for(List<Integer> ll : set){
            lst.add(ll);
        }
        return lst;
    }
    public void solve(int[] arr, HashSet<List<Integer>> ans, List<Integer> temp, int i, int lastPick){
        if(i == arr.length){
            if(temp.size()>=2){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        solve(arr, ans, temp, i+1, lastPick);
        if(lastPick == -1 || arr[lastPick]<=arr[i]){
            temp.add(arr[i]);
            solve(arr, ans, temp, i+1, i);
            temp.remove(temp.size()-1);
        }

    }
}