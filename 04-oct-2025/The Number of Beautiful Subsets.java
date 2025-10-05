class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return solve(0, new HashSet<>(), nums, k) - 1;
    }
    public int solve(int i, HashSet<Integer> set, int[]arr, int k){
        if(i == arr.length){
            return 1;
        }
        int n = solve(i+1, set, arr, k);
        int p = 0;
        if(!set.contains(arr[i]- k)){
            set.add(arr[i]);
            p = solve(i+1, set, arr, k);
            set.remove(arr[i]);
        }
        return n+p;
    }
}