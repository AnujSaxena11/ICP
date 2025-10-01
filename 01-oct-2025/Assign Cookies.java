class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = 0;
        int p2 = 0;
        int ans = 0;
        while(p2 < s.length && p1 < g.length){
            if(g[p1] <= s[p2]){
                ans++;
                p1++;
                p2++;
            }
            else{
                p2++;
            }
        }
        return ans;
    }
}