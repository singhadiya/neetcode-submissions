class Solution {
    public int orangesRotting(int[][] grid) {
        int min = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        int totalFreshOranges = 0;
        boolean[][]visited = new boolean[rows][columns];
        Queue<int[]>queue = new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]==1){
                    totalFreshOranges++;
                }
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
       
        if(totalFreshOranges == 0 ) return 0;
        while(!queue.isEmpty()){
             int size = queue.size();
             int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}};
             for(int k=0; k<size; k++){
                int[]data = queue.poll();
                int r = data[0];
                int c = data[1];
                for(int[]d:dir){
                    int i = r+d[0];
                    int j = c+d[1];
                    if(i>=0&&i<rows&&j>=0&&j<columns&&!visited[i][j]&&grid[i][j]==1){
                        visited[i][j]=true;
                        queue.offer(new int[]{i,j});
                        totalFreshOranges--;
                    }
                }
             }
            min++;
        }
        

        return totalFreshOranges > 0 ? -1 : min-1;
    }
}
