class Solution {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row<board.length; row++){
            for(int col = 0; col<board[0].length; col++){
                if(solve(board, word, 0, row, col)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] arr, String word, int i, int row, int col){
        if(row >= arr.length || row < 0 || col >= arr[0].length || col < 0){
            return false;
        }
        if(arr[row][col] != word.charAt(i)){
            return false;
        }
        if(i == word.length()-1){
            return true;
        }
        char ch = arr[row][col];
        arr[row][col] = '*';
        boolean left = solve(arr, word, i+1, row, col-1);
        boolean right = solve(arr, word, i+1, row, col+1);
        boolean top = solve(arr, word, i+1, row-1, col);
        boolean bottom = solve(arr, word, i+1, row+1, col);
        arr[row][col] = ch;
        return left || right || top || bottom;
    }
}