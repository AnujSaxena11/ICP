class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i<arr.length-2; i++){
            int v1 = arr[i];
            int v2 = arr[i+1];
            int v3 = arr[i+2];
            if(v1 % 2 != 0 && v2 % 2 != 0 && v3 % 2 != 0){
                return true;
            }
        }
        return false;
    }
}