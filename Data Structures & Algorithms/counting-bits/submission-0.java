class Solution {
    public int[] countBits(int n) {
        int[] ans = new int [n+1];
        ans[0] = 0;
        if( n==0 ){
            return ans;
        }
        int counter = 0;
        for(int i=1;i<=n;i++){
            int j = i;
            while(j>0){
                if((j & 1)==1){
                counter++;
                }
                j = j>>1;
            }
            /* while(n>0){
            if((n & 1) != 0 ){
                ans++;
            }
            n = n>>1;
        }*/
            ans[i] = counter;  
            counter = 0;
        }
        return ans;
    }
}
