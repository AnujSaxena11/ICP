class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 0;
        int ans = 0;
        for(int i : piles){
            e = Math.max(e, i);
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(possible(mid, piles, h)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public boolean possible(int mid, int[] arr, int h){
        long time = 0;
        for(int i : arr){
            if(i%mid == 0){
                time+= i/mid;
            }
            else{
                time += i/mid +1;
            }
        }
        if(time > h){
            return false;
        }
        return true;
    }
}