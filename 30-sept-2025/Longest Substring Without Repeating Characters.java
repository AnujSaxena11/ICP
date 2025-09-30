class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                while(s.charAt(left) != ch){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.remove(s.charAt(left));
                left++;
                map.put(ch, 1);
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}