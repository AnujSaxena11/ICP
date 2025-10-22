class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            while(!stk.isEmpty() && arr[i] < arr[stk.peek()]){
                int h = arr[stk.pop()];
                int nse = i;
                if(stk.isEmpty()){
                    ans = Math.max(ans, h*nse);
                }
                else{
                    int pse = stk.peek();
                    int area = h * (nse-pse-1);
                    ans = Math.max(ans, area);
                }
            }
            stk.push(i);
        }
        int nse = arr.length;
        while(!stk.isEmpty()){
            int h = arr[stk.pop()];
            if(stk.isEmpty()){
                ans = Math.max(ans, h*nse);
            }
            else{
                int pse = stk.peek();
                int area = h * (nse-pse-1);
                ans = Math.max(ans, area);
            }
        }
        return ans;
	}
}