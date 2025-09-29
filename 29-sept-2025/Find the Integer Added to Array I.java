class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i : nums1){
            min1 = Math.min(i, min1);
        }
        for(int i : nums2){
            min2 = Math.min(i, min2);
        }
        return min2 - min1;
    }
}