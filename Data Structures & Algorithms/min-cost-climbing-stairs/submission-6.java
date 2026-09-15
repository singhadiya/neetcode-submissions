class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if(length ==1 ) return cost[0];
        if(length==2) return Math.min(cost[0],cost[1]);
        int[]dp = new int[length];
        dp[length-1] = cost[length-1];
        dp[length-2] = cost[length-2];
        for(int i=length-3;i>=0;i--){
             dp[i] = cost[i]+Math.min(dp[i+2],dp[i+1]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
