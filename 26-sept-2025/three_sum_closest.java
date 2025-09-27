class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target) < min){
                    min = Math.abs(sum-target);
                    ans = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}