class Solution {
    public int[] countBits(int n) {
        int[]ans = new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i] = count(i);
        }
        return ans;
    }

    public int count(int n){
        int sum = 0;
        for(int i=0; i<32;i++){
            sum+= 1 & n;
            n= n>>1;
        }
        return sum;
    }
}
