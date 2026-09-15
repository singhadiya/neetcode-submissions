class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {

        let start = 0;
        const row = matrix.length;
        const column = matrix[0].length;
        let end = row*column - 1;
        let mid = 0;
        let i=0,j =0
        while(start<=end){
            mid = Math.trunc((start+end)/2);
            i = Math.trunc(mid / column);
            j = Math.trunc(mid % column);
            if(matrix[i][j]>target){
                end = mid-1;
            }else if(matrix[i][j]<target){
                start = mid+1
            }else{
                return true;
            }
        }
        return false;
    }
}
