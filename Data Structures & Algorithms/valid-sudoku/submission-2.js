class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        let set1 = new Set();
        let set2 = new Set(); 

        /*row checking*/
        for(let i=0; i<9; i++){
            for(let j=0;j<9; j++){
                if(board[i][j].search(/\d/)!==-1){
                    if(set1.has(board[i][j])){
                        console.log("row checking : ",board[i][j]);
                        return false;
                    }else{
                        set1.add(board[i][j]);
                    }
                }
                if(board[j][i].search(/\d/)!==-1){
                    if(set2.has(board[j][i])){
                         console.log("column checking : ",board[j][i]);
                        return false;
                    }else{
                        set2.add(board[j][i]);
                    } 
                }  
            }
            set1.clear();
            set2.clear();
        }

        console.log( " set1 : ",set1);
        // 3*3 box checking;
        for(let i=0; i<9;i+=3){
            for(let j=0; j<9; j+=3){
                for(let k=i; k<i+3; k++){
                    for(let l=j; l<j+3; l++){
                        if(board[k][l].search(/\d/)!==-1){
                            if(set1.has(board[k][l])){
                                return false;
                            }else{
                                set1.add(board[k][l]);
                            }
                        }
                    }
                }
                set1.clear();
            }
        }
        return true;
    }
}
