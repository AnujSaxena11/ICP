class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int idx = 0;
        for(int i = 0; i<fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0)+1);
            while(map.size() > 2){
                map.put(fruits[idx], map.get(fruits[idx])-1);
                if(map.get(fruits[idx]) == 0){
                    map.remove(fruits[idx]);
                }
                idx++;
            }
            ans = Math.max(ans, i-idx+1);
        }
        return ans;
    }
}