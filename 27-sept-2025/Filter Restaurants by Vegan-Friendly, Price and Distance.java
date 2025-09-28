class Solution {
    public List<Integer> filterRestaurants(int[][] rest, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> lst = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<rest.length    ; i++){
            if((veganFriendly == 0 || rest[i][2] == 1) && rest[i][3] <= maxPrice && rest[i][4] <= maxDistance){
                lst.add(new int[]{rest[i][0], rest[i][1]});
            }
        }
        Collections.sort(lst, (a,b)->{
            if (b[1] != a[1]) return b[1] - a[1];
            return b[0] - a[0];
        });
        for(int[] arr : lst){
            ans.add(arr[0]);
        }
        return ans;
    }
}