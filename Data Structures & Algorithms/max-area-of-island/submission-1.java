class Solution {
    private int max = 0;
    private int curr = 0;
    public int maxAreaOfIsland(int[][] grid) {
    int r = grid.length;
        int c = grid[0].length;
        boolean[][]visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1&& !visited[i][j]){
                    curr = 0;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return max;
    }

    public void dfs(int r,int c,boolean[][]visited,int[][]grid){
        int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
        if(r>=0&&r<grid.length&&c>=0&&c<grid[0].length&&grid[r][c]==1&&!visited[r][c]){
            visited[r][c] = true;
            curr++;
            max = Math.max(max,curr);
            for(int[]d : dir){
            dfs(r+d[0],c+d[1],visited,grid);
        }
        }
    }
}