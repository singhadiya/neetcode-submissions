class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int [][]tt = new int[numCourses][numCourses];
        int row = prerequisites.length;

        for(int i=0; i<row; i++){
            tt[prerequisites[i][0]][prerequisites[i][1]] = 1;
        } 
        for(int i=0;i<numCourses;i++){
            for(int j=0; j<numCourses;j++){
                System.out.print(tt[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<numCourses;i++){
              if(dfs(tt,i,new boolean[numCourses])) return false;
        }
        return true;   
    }

    public boolean dfs(int[][]pre,int index,boolean[]visited){
        if(visited[index]==true) return true;
         
        visited[index] = true;
        int count = 0;
        boolean status = false;
        for(int i=0;i<visited.length;i++){
            if(pre[index][i]==1){
               status = dfs(pre,i,visited) || status;
        System.out.println("Index : "+index+" ,status : "+status+" ,i : "+i);
               if(status) return status;
            }
        }
        visited[index] = false;
        return status;
    }
}
