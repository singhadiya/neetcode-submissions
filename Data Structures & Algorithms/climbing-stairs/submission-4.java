class Solution {
    public int climbStairs(int n) {
       if(n==1)return 1;
       if(n==2)return 2;
       int small = 1;
       int big = 2; 
       for(int i=3; i<=n;i++){
          int temp = big;
          big = small + big;
          small = temp;
       }
       return big;
    }
}
