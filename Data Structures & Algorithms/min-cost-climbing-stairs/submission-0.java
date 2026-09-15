class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(totalCost(cost,0,cost[0]),totalCost(cost,1,cost[1]));
        
    }

    public int totalCost(int[] cost, int i, int payment){
        if(i >=cost.length-2){ return payment;}
        return Math.min(totalCost(cost,i+1,payment+cost[i+1]),totalCost(cost,i+2,payment+cost[i+2]));
    }
}
