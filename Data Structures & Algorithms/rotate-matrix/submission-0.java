class Solution {
    public void rotate(int[][] matrix) {
        int temp = 0;
        int size = matrix.length;
        for(int i=0;i<(size+1)/2;i++){
            for(int j=0;j<size;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[size-1-i][j];
                matrix[size-1-i][j] = temp;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
