class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if(n == 0) return ans;
        for(int i=0;i<Math.abs(n);i++){
            ans *= x;
        }
        return n >0 ? ans:1/ans;
    }
}
