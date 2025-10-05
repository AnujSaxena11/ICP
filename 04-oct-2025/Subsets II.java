class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, set, temp, 0);
        for(List<Integer> ll : set){
            lst.add(ll);
        }
        return lst;
    }
    public void solve(int[] arr, HashSet<List<Integer>> set, List<Integer> temp, int i){
        if(i == arr.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        solve(arr, set, temp, i+1);
        temp.add(arr[i]);
        solve(arr, set, temp, i+1);
        temp.remove(temp.size()-1);
    }
}