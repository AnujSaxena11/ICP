class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i = 2; i*i<n; i++){
            if(arr[i]){
                int val = i;
                int idx = 2;
                while(val*idx < n){
                    arr[val*idx] = false;
                    idx++;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<n; i++){
            if(arr[i]){
                count++;
            }
        }
        return count;
    }
}