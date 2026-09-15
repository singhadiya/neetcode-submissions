class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        int num = 1;
        for(int i=0;i<32;i++){
            sum += 1 & n;
             n = n>>1;
        }
        return sum;
    }
}
