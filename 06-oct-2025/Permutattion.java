class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, ans, temp);
        return ans;
    }
    public void solve(int[] nums, int idx, List<List<Integer>> ans, List<Integer> temp){
        if(idx == nums.length){
            temp.clear();
            for(int n : nums){
                temp.add(n);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i<nums.length; i++){
            swap(nums, i, idx);
            solve(nums, idx+1, ans, temp);
            swap(nums, i, idx);
        }
    }
    public void swap(int[] nums, int i, int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}