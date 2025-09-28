class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i : arr){
            String key = getKey(i);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);
        }
        List<List<String>> lst = new ArrayList<>();
        for(String key : map.keySet()){
            lst.add(map.get(key));
        }
        return lst;
    }
    public String getKey(String str){
        int[] freq = new int[26];
        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : freq){
            sb.append(i+ " ");
        }
        return sb.toString();
    }
}