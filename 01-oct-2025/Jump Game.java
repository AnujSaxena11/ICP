class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        for(int i = 0; i<nums.length; i++){
            if(i>pos){
                return false;
            }
            pos = Math.max(pos, nums[i]+i); 
        }
        return pos >= nums.length-1;
    }
}