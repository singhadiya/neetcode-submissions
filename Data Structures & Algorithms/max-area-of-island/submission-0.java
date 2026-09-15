class Solution {
    private int area=0;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean [][] visited = new boolean [r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==1){
                    if(!visited[i][j]){
                        area++;
                        visited[i][j] = true;
                    }
                    neighbouringNodes(visited,i,j,grid);
                    maxArea = Math.max(maxArea,area);
                    area=0;
                }
            }
        } 
        return maxArea; 
    }

     public void neighbouringNodes(boolean [][] visited,int i,int j,int[][] grid){
        int r = grid.length;
        int c = grid[0].length;
        if(i >= 1 && visited[i-1][j] == false && grid[i-1][j]==1){
            visited[i-1][j] = true;
            area++;
            neighbouringNodes(visited,i-1,j,grid);
        }
        if(j >= 1 && visited[i][j-1] == false && grid[i][j-1]==1){ 
            visited[i][j-1] = true;
            area++;
            neighbouringNodes(visited,i,j-1,grid);
        }
        if(i<r-1 && visited[i+1][j] == false && grid[i+1][j]==1){
            visited[i+1][j] = true;
            area++;
            neighbouringNodes(visited,i+1,j,grid);
        }
        if(j<c-1 && visited[i][j+1] == false && grid[i][j+1]==1){
            visited[i][j+1] = true;
            area++;
            neighbouringNodes(visited,i,j+1,grid);
        }  
    }
}
