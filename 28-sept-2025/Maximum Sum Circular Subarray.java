class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int v1 = MaxKadane(nums);
        int v2 = MinKadane(nums);
        if(v1>0){
            return Math.max(v1, v2);
        }
        return v1;
    }
    public int MaxKadane(int[] nums){
        int sum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i< nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public int MinKadane(int[] nums){
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }
        int sum = nums[0];
        int minSum = nums[0];
        for(int i = 1; i< nums.length; i++){
            sum = Math.min(sum + nums[i], nums[i]);
            minSum = Math.min(minSum, sum);
        }
        return totalSum - minSum;
    }
}