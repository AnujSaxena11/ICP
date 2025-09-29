class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row_min = 0;
        int row_max = matrix.length-1;
        int col_min = 0;
        int col_max = matrix[0].length-1;
        List<Integer> lst = new ArrayList<>();
        int t = matrix.length * matrix[0].length;
        int c = 0;
        while(c<t){
            for(int i = col_min; i<=col_max && c<t; i++){
                lst.add(matrix[row_min][i]);
                c++;
            }
            row_min++;
            for(int i = row_min; i<=row_max && c<t; i++){
                lst.add(matrix[i][col_max]);
                c++;
            }
            col_max--;
            for(int i = col_max; i>=col_min && c<t; i--){
                lst.add(matrix[row_max][i]);
                c++;
            }
            row_max--;
            for(int i = row_max; i>=row_min && c<t; i--){
                lst.add(matrix[i][col_min]);
                c++;
            }
            col_min++;
        }
        return lst;
    }
}