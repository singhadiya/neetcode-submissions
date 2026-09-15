class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int r = m.length;
        int c = m[0].length;
        int l = r*c-1;
        // if(r==1 && c==1){
        //     if(m[0][0]==target){
        //         return true;
        //     }
        //     return false;
        // }
        // if(r==1 && c==2){
        //     if(m[0][0]==target || m[0][1]==target){
        //         return true;
        //     }
        //     return false;
        // }
        // if(r==2 && c==1){
        //     if(m[0][0]==target || m[1][0]==target){
        //         return true;
        //     }
        //     return false;
        // }

        int start=0, end=l, mid=start,i=0,j=0;
        while(start<=end){
            mid = (start+end)/2;
            System.out.println("Start : "+start);
            System.out.println("end : "+end);
           
            System.out.println("mid : "+mid);
            i = (mid)/c;
            j = (mid)%c;
            if(m[i][j]<target){
                start = mid+1;
            }else if(m[i][j]>target){
                end = mid-1;
            }else{
                 System.out.println("got num : "+m[i][j]);
                return true;
            } 
            System.out.println("i : "+i);
            System.out.println("j : "+j);
            System.out.println("num : "+m[i][j]);
        }
        return false;
    }
}
