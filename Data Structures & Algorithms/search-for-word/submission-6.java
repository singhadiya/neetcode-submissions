class Solution {
    private boolean status = false;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        boolean[][]visited = new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                dfs(i,j,board,0,word,visited);
                if(status){
                    return true;
                }
            }
        }
       return false; 
    }

    public void dfs(int r,int c,char[][]board,int index,String word,boolean[][]visited){
        if(index == word.length()){
            status = true;
            return;
        }
        if(r>=0 && r<board.length && c>=0 && c<board[0].length &&!visited[r][c]){
            if(board[r][c]==word.charAt(index)){
                int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
                for(int[]d : dir){
                    visited[r][c]=true;
                    dfs(r+d[0],c+d[1],board,index+1,word,visited);
                    visited[r][c]=false;
                }
            }
        }    
    }
}
