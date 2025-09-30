class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        if(s.length() < p.length()) {
            return lst;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];


        for(int i=0; i<p.length(); i++) {
            arr1[s.charAt(i)-'a']++;
            arr2[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr1, arr2)) {
            lst.add(0);
        }

        int start = 0;
        int end = p.length();

        while(end < s.length()) {

            arr1[s.charAt(start)-'a']--;
            arr1[s.charAt(end)-'a']++;

            if(Arrays.equals(arr1, arr2)) {
                lst.add(start+1);
            }
            end++;
            start++;
        }
        return lst;
    }
}