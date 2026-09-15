class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>s = new HashSet<>();
        int i=0,j=0;
        int k=0,l=0;
        char num = '.';
        while(i<9 && j<9){
          for(k=i;k<i+3;k++){
            for(l=j;l<j+3;l++){
                num = board[k][l];
                if(num != '.' && s.contains(num)){
                    return false;
                }else{
                    s.add(num);
                }
            }
          }
          System.out.println("set : "+s);
          s.clear();
          if(i+3<9){
            i = i+3;
          }else{
            j = j+3;
            i = 0;
          }

        }
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                 num = board[i][j];
                if(num != '.' && s.contains(num)){
                    return false;
                }else{
                    s.add(num);
                }
            }
            s.clear();
        }
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                 num = board[j][i];
                if(num != '.' && s.contains(num)){
                    return false;
                }else{
                    s.add(num);
                }
            }
            s.clear();
        }
    return true;   
    }
}
