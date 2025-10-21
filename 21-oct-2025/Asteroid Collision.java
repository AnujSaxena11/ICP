class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i : arr){
            if(i>0 || stk.isEmpty()){
                stk.push(i);
            }
            else{
                int val = -i;
                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < val){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek() == val){
                    stk.pop();
                }
                else if(stk.isEmpty() || stk.peek() < 0){
                    stk.push(i);
                }
            }
        }
        int[] ans = new int[stk.size()];
        for(int i = stk.size()-1; i>=0; i--){
            ans[i] = stk.pop();
        }
        return ans;
    }
}