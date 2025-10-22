class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek().ch == c){
                stk.peek().count++;
                if(stk.peek().count == k){
                    stk.pop();
                }
            }
            else{
                stk.push(new Pair(c, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Pair p : stk){
            int val = p.count;
            char chh = p.ch;
            for(int i = 0; i<val; i++){
                sb.append(chh);
            }
        }
        return sb.toString();
    }
    class Pair{
        char ch;
        int count;
        Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
}