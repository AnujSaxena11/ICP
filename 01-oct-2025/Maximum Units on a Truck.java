class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        for(int[] arr : boxTypes){
            if(truckSize - arr[0] <= 0){
                ans += arr[1]*truckSize;
                break;
            }
            ans += arr[1]*arr[0];
            truckSize -= arr[0];
        }
        return ans;
    }
}