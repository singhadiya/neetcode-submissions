class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][]rows = new boolean[9][9];
        boolean[][]columns = new boolean[9][9];
        boolean[][]box = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                Character cell = board[i][j];
                if(cell == '.')continue;
                int val = board[i][j]-'1';
                int boxId = (i/3)*3+j/3;
                if(rows[i][val] || columns[j][val] || box[boxId][val]){
                    return false;
                }
                rows[i][val] = true;
                columns[j][val] = true;
                box[boxId][val] = true;
            }
        }
        return true;
        // Set<Character>s = new HashSet<>();

        // //rows checking
        // for(int i=0;i<9;i++){
        //     s.clear();
        //     for(int j=0;j<9;j++){
        //         Character cell = board[i][j];
        //         if(cell!='.'){
        //             if(s.contains(cell)){
        //                 return false;
        //             }else{
        //                 s.add(cell);
        //             }
        //         }
        //     }
        // }

        // //columns checking
        // for(int i=0;i<9;i++){
        //     s.clear();
        //     for(int j=0;j<9;j++){
        //         Character cell = board[j][i];
        //         if(cell!='.'){
        //             if(s.contains(cell)){
        //                 return false;
        //             }else{
        //                 s.add(cell);
        //             }
        //         }
        //     }
        // }
        // //box checking;
        // for(int i=0;i<9;i=i+3){
        //     for(int j=0;j<9;j=j+3){
        //         s.clear();
        //         for(int k=i;k<i+3;k++){
        //             for(int l=j;l<j+3;l++){
        //                     Character cell = board[k][l];
        //                     if(cell!='.'){
        //                         if(s.contains(cell)){
        //                             return false;
        //                         }else{
        //                             s.add(cell);
        //                         }
        //                     }
        //             }
        //         }
        //     }
        // }
        // return true;
    }
}
