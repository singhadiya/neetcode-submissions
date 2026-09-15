class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]>q = new LinkedList<>();
        boolean[][]visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]data = q.poll();
            int row = data[0];
            int col = data[1];
            visited[row][col]=true;
            for(int[]d :dir){
                int i = row + d[0];
                int j = col + d[1];
                if(i>=0&&i<r&&j>=0&&j<c&&!visited[i][j]&&grid[i][j]>0){
                    grid[i][j] = Math.min(grid[row][col]+1,grid[i][j]);
                    q.offer(new int[]{i,j});
                }
            }
        }
    }
}    