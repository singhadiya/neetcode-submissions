class Solution {
    public int minCostClimbingStairs(int[] cost) {
          
        
        return Math.min(totalCost(cost[0],0,cost),totalCost(cost[1],1,cost));
    }

    public int totalCost(int cost,int index,int []arr){
        if(index+1 == arr.length || index+2 == arr.length){
            return cost ;
        }
        return Math.min(totalCost(cost+arr[index+1],index+1,arr),totalCost(cost+arr[index+2],index+2,arr));
    }

}
