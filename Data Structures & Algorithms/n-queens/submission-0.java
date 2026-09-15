class Solution {
    private List<List<String>>ans = new ArrayList<>();
    private Set<Integer>col = new HashSet<>();
    private Set<Integer>podia = new HashSet<>();
    private Set<Integer>negdia = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[][] visited = new boolean[n][n];
        dfs(0,n,visited);
        return ans;
    }

    public void dfs(int r,int n,boolean[][]visited){
          if(r == n){
            List<String>curr = new ArrayList<>();
            for(int i=0;i<n;i++){
                String s = "";
                for(int j=0; j<n; j++){
                      if(visited[i][j]){
                        s +="Q";
                      }else{
                        s +=".";
                      }
                }
                curr.add(s);
            }
            ans.add(curr);
            return;
          }
          for(int c=0;c<n;c++){
            if(!this.col.contains(c)&&!this.podia.contains(c+r)&&!this.negdia.contains(r-c)){
                visited[r][c] = true;
                this.col.add(c);
                this.podia.add(c+r);
                this.negdia.add(r-c);
                dfs(r+1,n,visited);
                visited[r][c] = false;
                this.col.remove(c);
                this.podia.remove(c+r);
                this.negdia.remove(r-c);
  
            }
          }
    }
}
