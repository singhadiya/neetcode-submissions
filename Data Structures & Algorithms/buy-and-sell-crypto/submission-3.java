class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int length = prices.length;
        if(length<=1) return profit;
        int buyPrice = prices[0];
        for(int i=1; i<length;i++){
            profit = Math.max(profit,prices[i]-buyPrice);
            buyPrice = Math.min(buyPrice,prices[i]);
        }
        return profit;
        
    }
}
