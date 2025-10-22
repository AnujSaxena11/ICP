class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int[] temp = new int[matrix[0].length];
        for(char[] arr : matrix){
            ans = Math.max(ans, newArr(arr, temp));
        }
        return ans;
    }
    public int newArr(char[] arr, int[] temp){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '0'){
                temp[i] = 0;
            }
            else{
                temp[i]  += arr[i] - '0';
            }
        }
        return maxHist(temp);
    }
    public int maxHist(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
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