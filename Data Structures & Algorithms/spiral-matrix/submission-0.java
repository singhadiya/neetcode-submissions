class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new LinkedList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        boolean [][] check = new boolean[r][c];
        int size = r*c;
        int [][] rotated = {{0,1},{1,0},{0,-1},{-1,0}};
        int direction = 0;
        int[]rotation = rotated[direction % 4];
        int i=0,j=0;
        while(ans.size()<size){
            check[i][j] = true;
            ans.add(matrix[i][j]);
            if(i+rotation[0] == r || j+rotation[1] == c || i+rotation[0] == -1 || j+rotation[1] == -1 || check[i+rotation[0]][j+rotation[1]]){
                rotation = rotated[++direction % 4];    
            }
            i += rotation[0];
            j += rotation[1];
        }
        return ans;
    }
}
