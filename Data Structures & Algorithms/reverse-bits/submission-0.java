class Solution {
    public int reverseBits(int n) {

        int ans= n & 1;
        int bits = 1;
        while(bits < 32){
            ans = ans<<1;
            n = n>>1;
            ans += n & 1;
            bits++;   
        }
        return ans;
    }
}
