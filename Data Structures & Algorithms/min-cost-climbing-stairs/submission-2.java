class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if(length == 2){
            return Math.min(cost[0],cost[1]);
        }

        int[]dp = new int[length];
        dp[length-1] = cost[length-1];
        dp[length-2] = cost[length-2];

        for(int i=length-3; i>=0; i--){
            dp[i] = Math.min(cost[i]+dp[i+1],cost[i]+dp[i+2]);
        }
        return Math.min(dp[0],dp[1]); 
    }
}
