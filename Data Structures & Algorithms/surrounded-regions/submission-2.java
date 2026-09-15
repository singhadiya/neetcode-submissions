class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        boolean[][] free = new boolean[row][col];
        Queue<int[]>queue = new LinkedList<>();

        //boundries
        //top
        for(int i=0; i<col; i++){
            if(board[0][i]=='O'){
                visited[0][i] = true;
                free[0][i] = true;
                queue.offer(new int[]{0,i});
            }
        }
        //bottom
        for(int i=0; i<col; i++){
            if(board[row-1][i]=='O'){
                visited[row-1][i] = true;
                free[row-1][i] = true;
                queue.offer(new int[]{row-1,i});
            }
        }
        //left
        for(int i=0; i<row; i++){
            if(board[i][0]=='O'){
                visited[i][0] = true;
                free[i][0] = true;
                queue.offer(new int[]{i,0});
            }
        }
        //right
        for(int i=0; i<row; i++){
            if(board[i][col-1]=='O'){
                visited[i][col-1] = true;
                free[i][col-1] = true;
                queue.offer(new int[]{i,col-1});
            }
        }
        

        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int r = data[0];
            int c = data[1];
            int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}};

            for(int[] d : dir){
                int i = r + d[0];
                int j = c + d[1];
                if(i>=0 && i<row && j>=0 && j<col && !visited[i][j] && board[i][j]=='O'){
                    visited[i][j] = true;
                    free[i][j] = true;
                    queue.offer(new int[]{i,j});
                }
            }   
        } 
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'&&!free[i][j]){
                    board[i][j] = 'X';
                }
            }
        } 
    }
}
