class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>>ans = new ArrayList<>();
        int row = heights.length;
        int col = heights[0].length;
        boolean [][] atlantic = new boolean[row][col];
        boolean [][] pacific = new boolean[row][col];
        boolean [][] visited = new boolean[row][col];
        Queue<int[]>queue = new LinkedList<>();

        //pacific
        for(int i=0;i<row;i++){
            queue.add(new int[]{i,0});
            pacific[i][0]=true;
            visited[i][0]=true;     
        }
        for(int i=0;i<col;i++){
            queue.add(new int[]{0,i});
            pacific[0][i] = true;
            visited[0][i] = true;
        }

        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int r = data[0];
            int c = data[1];

            int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int[] d : dir){
                int i = r+d[0];
                int j = c+d[1];

                if(i>=0 && i<row && j>=0 && j<col && !visited[i][j]&& heights[i][j]>=heights[r][c]){
                    pacific[i][j]=true;
                    visited[i][j]=true;
                    queue.offer(new int[]{i,j});
                }
            }
        } 

        visited = new boolean[row][col];
        //atlantic
        for(int i=0;i<row;i++){
            queue.add(new int[]{i,col-1});
            atlantic[i][col-1]=true;
            visited[i][col-1]=true;     
        }
        for(int i=0;i<col;i++){
            queue.add(new int[]{row-1,i});
            atlantic[row-1][i] = true;
            visited[row-1][i] = true;
        }
        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int r = data[0];
            int c = data[1];

            int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int[] d : dir){
                int i = r+d[0];
                int j = c+d[1];

                if(i>=0 && i<row && j>=0 && j<col && !visited[i][j]&& heights[i][j]>=heights[r][c]){
                    atlantic[i][j]=true;
                    visited[i][j]=true;
                    queue.offer(new int[]{i,j});
                }
            }
        } 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            if(pacific[i][j]&& atlantic[i][j]){
                ans.add(new ArrayList<>(Arrays.asList(i,j)));
            }
            }
        }
        return ans;
    }

}
