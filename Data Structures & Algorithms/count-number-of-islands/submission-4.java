class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int ans = 0;
        boolean[][]visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'&& !visited[i][j]){
                    dfs(i,j,visited,grid);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(int r,int c,boolean[][]visited,char[][]grid){
        int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
        if(r>=0&&r<grid.length&&c>=0&&c<grid[0].length&&grid[r][c]=='1'&&!visited[r][c]){
            visited[r][c] = true;
            for(int[]d : dir){
            dfs(r+d[0],c+d[1],visited,grid);
        }
        }
    }
}
