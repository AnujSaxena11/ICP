class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long s = 1;
        long e = Integer.MAX_VALUE;
        for(int i : time){
            e = Math.min(e, i);
        }
        e *= totalTrips; 
        long ans = 0;
        while(s<=e){
            long mid = s + (e-s)/2;
            if(possible(time, mid, totalTrips)){
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public boolean possible(int[] arr, long mid, int tt){
        int c = 0;
        for(int i = 0; i<arr.length; i++){
            c += mid/arr[i];
            if(c >= tt){
            return true;
        }
        }
        
        return c>=tt;
    }
}