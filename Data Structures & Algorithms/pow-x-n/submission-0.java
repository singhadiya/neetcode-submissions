class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if(n == 0){
            return 1;
        }
        if(n > 0){
            while(n>0){
                ans = ans*x; 
                n--;
            }
        }else{
            while(n<0){
                ans = ans/x;
                n++;
            }
        }
        return ans;
    }
}
